package se.iths.oop;

import java.awt.*;

public class Shapes {
    public static void main(String[] args) {
        //class/type     create object in memory
        Rectangle rect = new Rectangle(10.0f, 5.0f, Color.BLACK);
        Rectangle rect2 = new Rectangle(2.0f, 3.0f, Color.PINK);

        //rect.changeWidth(10.0f);
        //rect.changeHeight(5.0f);

        System.out.println("Height: " + rect.getHeight());
        System.out.println("Width: " + rect.getWidth());
        System.out.println("Color: " + rect.getColor());
        System.out.println();
        System.out.println("Height: " + rect2.getHeight());
        System.out.println("Width: " + rect2.getWidth());
        System.out.println("Color: " + rect2.getColor());




    }
}
