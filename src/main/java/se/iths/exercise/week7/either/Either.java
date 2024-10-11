package se.iths.exercise.week7.either;

public class Either {
    private final Error left;
    private final Account right;


    public static Either left(Error left){
        return new Either(left, null);
    }

    public static Either right(Account right){
        return new Either(null, right);
    }

    // The reason this is private is that
    // we don't want a user to be able to create a new object
    // and pass both an error & an account
    private Either(Error left, Account right) {
        this.left = left;
        this.right = right;
    }

//     public Either(Error left){
//         this.left = left;
//         this.right = null;
//     }
//
//     public Either(Account right){
//         this.left = null;
//         this.right = right;
//     }


}
