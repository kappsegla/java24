package se.iths.exercise.week7.either;

public class Either<L, R> {
    private final L left;
    private final R right;


    public static <L, R> Either<L, R> left(L left) {
        return new Either<>(left, null);
    }

    public static <L, R> Either<L, R> right(R right) {
        return new Either<>(null, right);
    }

    // The reason this is private is that
    // we don't want a user to be able to create a new object
    // and pass both an error & an account
    private Either(L left, R right) {
        this.left = left;
        this.right = right;
    }

    public boolean isLeft() {
        return left != null;
    }

    public boolean isRight() {
        return right != null;
    }

    public L getLeft() {
        if (!isLeft())
            throw new IllegalStateException("Left doesn't have a value");
        return left;
    }

    public R getRight() {
        if (!isRight())
            throw new IllegalStateException("Right doesn't have a value");
        return right;
    }
}
