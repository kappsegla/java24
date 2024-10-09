package se.iths.search;

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        String s = "This is a string";
        Scanner sc = new Scanner(System.in);
        String dynamic = sc.nextLine();

        System.out.println("Are the strings equals? " + s.equals(dynamic));
        System.out.println("Are the strings s and dynamic same object? " + (dynamic == s) );

        dynamic = dynamic.intern();
        System.out.println("And now? " + ( dynamic == s ));
    }
}
