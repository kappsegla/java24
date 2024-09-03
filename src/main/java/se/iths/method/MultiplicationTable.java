package se.iths.method;

public class MultiplicationTable {

    public static void main(String[] args) {
        printFor(2);
        int sum = add(2, 3);
        int tal1 = 2;
        int tal2 = 3;
        int prod = product(tal1, tal2);
        System.out.println(sum);
    }

    private static int product(int tal1, int tal2) {
        return tal1 * tal2;
    }

    public static void printFor(int table) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(table + " * " + i + " = " + product(table, i));
            //System.out.printf("%s * %d = %d%n", table, i, table * i);
        }
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
