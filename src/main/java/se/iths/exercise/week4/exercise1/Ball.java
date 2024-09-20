package se.iths.exercise.week4.exercise1;

public abstract class Ball implements Tossable {
    private String brandName;

    public Ball(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }

    public abstract void bounce();

}
