package se.iths.exercise.week7.either;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        var demo = new Demo();

        var userIds = List.of(0, 1, 2, 3);

        //Keep only found accounts and ignore errors by filtering out left Either objects
        userIds.stream()
                .map(demo::getUserAccount)
                .filter(Either::isRight).map(Either::getRight)
                .forEach(System.out::println);

        //Keep both errors (left) and accounts ( right ) in one list for each
        //Avoids doing the streaming and calls to getUserAccount twice to get everything.
        var result = userIds.stream()
                .map(demo::getUserAccount)
                .collect(Collectors.teeing(
                        Collectors.filtering(Either::isLeft, Collectors.mapping(Either::getLeft, Collectors.toList())),
                        Collectors.filtering(Either::isRight, Collectors.mapping(Either::getRight, Collectors.toList())),
                        List::of));

        System.out.println("Errors: " + result.get(0));
        System.out.println("Accounts: " + result.get(1));

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
    public Either<Error, Account> getUserAccount(int userId) {
        //Kolla om det finns en användare med id userId
        var user = getUserById(userId);
        if (user.isEmpty()) return Either.left(new Error.UserNotFound());
        //Kolla om användaren har ett konto?
        var accounts = getUserAccounts(user.get());
        if (accounts.isEmpty()) return Either.left(new Error.AccountNotFound());
        return Either.right(accounts.stream().findFirst().get());
    }

    //This method can return zero or one User
    private Optional<User> getUserById(int userId) {
        if (userId < 1) return Optional.empty();
        if (userId == 1) return Optional.of(new User(userId, "Donald"));
        return Optional.of(new User(userId, "Minny"));
    }

    //This method can return zero or many Accounts.
    //Can also use List if we can have duplicated values
    private Set<Account> getUserAccounts(User user) {
        if (user == null) return Set.of();
        if (user.name().equals("Donald")) return Set.of(new Account(1, user), new Account(3, user));
        return Set.of();
    }
}
