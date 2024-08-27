package se.iths;

import java.util.Scanner;

public class ArrayExample {
    //Read one number from user and print it
    //Todo: Read two numbers from user and print them
    //Todo: Read 10 numbers from user and print them
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Write a number: ");
        int numberOne = scanner.nextInt();
        System.out.print("Write a number: ");
        int numberTwo = scanner.nextInt();

        System.out.println("You wrote " + numberOne + " " + numberTwo);

    }



}
