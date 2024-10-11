package se.iths.exercise.week7.either;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        var demo = new Demo();

        var userIds = List.of(0,1,2,3);

            userIds.stream().map(demo::getUserAccount)
                    .filter(Either::isRight)
                    .map(Either::getRight)
                    .forEach(System.out::println);

//        for( var userId : userIds ) {
//            Either either = demo.getUserAccount(userId);
//            if (either.isRight())
//                System.out.println(either.getRight());
//            else
//                System.out.println(either.getLeft());
//        }
    }

    //Returnera ett konto för användaren om:
    //User har ett konto
    //UserId är giltigt
    //This method can return Either an Account or and Error... different types.
    public Either getUserAccount(int userId) {
        //Kolla om det finns en användare med id userId
        var user = getUserById(userId);
        if( user.isEmpty())
            return Either.left(new Error.UserNotFound());
        //Kolla om användaren har ett konto?
        var accounts = getUserAccounts(user.get());
        if (accounts.isEmpty())
            return Either.left(new Error.AccountNotFound());
        return Either.right(accounts.stream().findFirst().get());
    }

    //This method can return zero or one User
    private Optional<User> getUserById(int userId) {
        if (userId < 1)
            return Optional.empty();
        if( userId == 1)
            return Optional.of(new User(userId, "Donald"));
        return Optional.of(new User(userId, "Minny"));
    }

    //This method can return zero or many Accounts.
    //Can also use List if we can have duplicated values
    private Set<Account> getUserAccounts(User user) {
        if (user == null)
            return Set.of();
        if (user.name().equals("Donald"))
            return Set.of(new Account(1, user), new Account(3, user));
        return Set.of();
    }
}

record User(int id, String name) {
}

// a user can have zero or more accounts
record Account(int id, User user) {
}
