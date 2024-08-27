package se.iths;

import java.util.Scanner;

public class Loops {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        whileLoop2();
    }

    private static void whileLoop2() {
        int n = 1;
        while (n > 0) {
            System.out.println("Hej");
            //Ask user for input
            System.out.print("Write 1 to continue or 0 to exit: ");
            n = scanner.nextInt();
        }
    }

    private static void whileLoop() {
        while (true) {
            System.out.println("Hej");
            //Ask user for input
            System.out.print("Write 1 to continue or 0 to exit: ");
            int n = scanner.nextInt();
            if (n == 0) {
                break;
                //return;
            }
            System.out.println("I see that you want to continue");
        }
    }
}
