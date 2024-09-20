package se.iths.exercise.week4;

public class Ball implements Tossable {
    private String brandName;

    @Override
    public void toss() {
        System.out.println("Tossing ball");
    }

    public Ball(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void bounce() {
        System.out.println("Bounce ball");
    }
}
