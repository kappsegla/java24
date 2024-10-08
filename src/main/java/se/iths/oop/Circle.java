package se.iths.oop;

public class Circle {
    private final double radius;

    public Circle(double radius) {
        if( radius < 0 )
            throw new IllegalArgumentException();
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    //circumference, omkretsen på runda föremål circle, oval
    public double getPerimeter() {
        return Math.PI * radius * 2;
    }
}
