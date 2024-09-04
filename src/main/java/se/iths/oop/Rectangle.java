package se.iths.oop;

import java.awt.*;

public class Rectangle {
    //Fields that holds data for objects of type Rectangle
    //private, encapsulation
    private float width;
    private float height;
    private Color color;

    public Rectangle(float width, float height, Color color) {
        if (width <= 0 || height <= 0)
            throw new IllegalArgumentException();
        this.width = width;
        this.height = height;
        this.color = color;
    }

    //Methods for changing and reading field data
    public void changeWidth(float newWidth) {
        //Validation of data. Prefer validation first in method, early throw/return
        if (newWidth <= 0)
            throw new IllegalArgumentException();
        width = newWidth;

    }

    public void changeHeight(float newHeight) {
        if (newHeight <= 0)
            throw new IllegalArgumentException();
        height = newHeight;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    public Color getColor() {
        return this.color;
    }
}
