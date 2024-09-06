package se.iths.method;

public class TaxCalculator {
    public static void main(String[] args) {
        System.out.println(calculateTax(110000));
        System.out.println(calculateTax(90000));
    }

    public static float calculateTax(int income) {
        if (income > 100_000) {
            return (income - 100_000) * 0.4f + 30_000;
        }
        //throw new IllegalStateException();
        return income * 0.3f;
    }
}
