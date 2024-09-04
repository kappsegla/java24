package se.iths.oop;

import java.math.BigInteger;

public class FunWithCircles {
    public static void main(String[] args) {

        Circle circle = new Circle(5);

        System.out.printf("Radius:     %.2f%n", circle.getRadius());
        System.out.printf("Area:      %.2f%n", circle.getArea());
        System.out.printf("Perimeter: %.2f%n", circle.getPerimeter());

        //Skapa massor av cirklar...
        //VM options to increase heap size -Xmx10G -Xms10G
        Circle[] circles = new Circle[10_000];

//        for (int i = 0; i < 10000; i++) {
//            circles[i] = new Circle(Math.random());
//        }

        CanItBeNull canIt = new CanItBeNull();
        System.out.println(canIt.name().length());
        canIt.name("Name");
    }
}

class CanItBeNull {
    private String name = "";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String name() {
        return name;
    }

    public void name(String name) {
        this.name = name;
    }
}
