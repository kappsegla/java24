package se.iths.exercise.week2;


import java.util.List;
import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Skriv in första numret: ");
        int num1 = scanner.nextInt();

        System.out.println("Skriv in andra numret: ");
        int num2 = scanner.nextInt();

        System.out.println("Skriv in tredje numret:");
        int num3 = scanner.nextInt();

        System.out.println("Det minsta numret är : " + findMinimum(num1, num2, num3));
        System.out.println(findMinimum(new int[]{num1, num2, num3}));
        

    }

    /**
     * Finds the minimum number in numbers array
     *
     * @param numbers
     * @return Smallest number
     */
    //Datatyp + Array + Variabel!
    public static int findMinimum(int[] numbers) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            min = Math.min(min, numbers[i]);
        }
        return min;
    }

    public static int findMinimum(int a, int b, int c) {
        int min = Math.min(a, b);
        min = Math.min(min, c);
        return min;
    }

}
