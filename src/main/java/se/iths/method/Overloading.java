package se.iths.method;

public class Overloading {
    public static void main(String[] args) {
        System.out.println(sum(1, 2));
        System.out.println(sum(1.0, 2.0));
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }


}
