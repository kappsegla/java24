package se.iths;

import java.util.Scanner;

public class Loops {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i * 10);
        }

        for (int i = 0; i < 100; i = i + 10) {
            System.out.println(i);
        }

//        for (float f = 0.0f; f < 1.0; f += 0.1f)
//            System.out.println(f);

        for (int i = 0; i < 10; i++) {
            System.out.println(i / 10.0);
        }

        for (int i = 0; i < 2; i++) {
            forLoop();
        }
    }

    private static void forLoop() {
        //Print hej 3 times
        for (int i = 0; i < 3; i++) {
            System.out.println("Hej");
        }
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
