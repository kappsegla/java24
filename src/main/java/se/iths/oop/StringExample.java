package se.iths.oop;

import java.util.Scanner;

public class StringExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string1 = "Hej";
        String string2 = "hej";

        if(string1.equals(null))
            System.out.println("string1 and string2 are the same");
        else
            System.out.println("string1 and string2 are not the same");



    }
}
