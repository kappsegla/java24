package se.iths.exercise;

import java.util.Scanner;

public class Exercise2And3 {
    public static Scanner scnr = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Ange två siffror: ");
        int num1 = scnr.nextInt();
        int num2 = scnr.nextInt();

        double med = (num1 + num2) / 2.;
        System.out.println("Medelvärdet är: " + med);

        //num1 = Math.abs(num1);
        //num1 = num1 < 0 ? -num1 : num1;

        if (num1 < 0) {
            num1 = -num1;
        }
        if (num2 < 0) {
            num2 = num2 * -1;
        }
        if (num1 == num2) {
            System.out.println("Summan av de två talen gånger två är: " + (num1 + num2) * 2);
        } else {
            System.out.println("Summan av de två talen är: " + (num1 + num2));
        }
    }
}
