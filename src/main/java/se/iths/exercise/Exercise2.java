package se.iths.exercise;

import java.util.Scanner;

public class Exercise2 {
    public static Scanner scnr = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("Ange två siffror: ");
        int num1= scnr.nextInt();
        int num2= scnr.nextInt();

        double med = (num1 + num2) / 2.;
        System.out.println("Medelvärdet är: " + med );
    


    }
}
