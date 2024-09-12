package se.iths.oop;

public class Cylinder {
    private Circle base;
    private double height;

    //Default constructor
    public Cylinder() {
        this(1.0,1.0);  //Constructor chaining
    }

    //Overloaded constructor
    public Cylinder(double radius, double height) {
        this(new Circle(radius), height);
    }

    public Cylinder(Circle base, double height) {
        if( base == null || height <= 0 )
            throw new IllegalArgumentException();
        this.base = base;
        this.height = height;
    }

    public double getVolume() {
        return base.getArea()*height;
    }

}
