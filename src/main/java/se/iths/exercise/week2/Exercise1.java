package se.iths.exercise.week2;


import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Skriv in första numret: ");
        int num1 = scanner.nextInt();

        System.out.println("Skriv in andra numret: ");
        int num2 = scanner.nextInt();

        System.out.println("Skriv in tredje numret: ");
        int num3 = scanner.nextInt();

        System.out.println("Det minsta numret är : " + findMinimum(num1, num2, num3));


    }

    public static int findMinimum(int a, int b, int c) {
        int min = Math.min(a, b);
        min = Math.min(min, c);
        return min;
    }

}
