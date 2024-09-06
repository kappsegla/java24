package se.iths.exercise.week2;

public class Rectangle {
    private float width;
    private float height;

    public Rectangle(float width, float height) {
        if (width <= 0 || height <= 0)
            throw new IllegalArgumentException("width and height must be greater than 0");
        this.width = width;
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getArea() {
        return width * height;
    }

    public float getPerimeter() {
        return 2 * (width + height);
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.f, 10.f);
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Omkrets: " + rectangle.getPerimeter());
    }
}