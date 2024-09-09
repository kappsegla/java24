package se.iths.exercise.week1;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Vad heter du? ");
        String name = sc.nextLine();

        String s = name.substring(0, 1).toUpperCase();
        String nameCapitilized = s + name.substring(1);

        System.out.println("Hej " + nameCapitilized);

    }
}
