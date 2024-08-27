package se.iths;

import java.util.Scanner;

public class ArrayExample {
    //Read one number from user and print it
    //Read two numbers from user and print them
    //Todo: Read 10 numbers from user and print them
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Write a number: ");
            numbers[i] = scanner.nextInt();
        }

        System.out.print("You wrote ");
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.print(number + " ");
        }

    }


}
