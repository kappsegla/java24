package se.iths.exercise;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What day of the week is it? ");
        String dayOfWeek = scanner.nextLine().toLowerCase();
        //dayOfWeek = dayOfWeek.substring(0,3);

        int dayNumber = switch (dayOfWeek) {
            case "monday", "mon" -> 1;
            case "tuesday", "tue" -> 2;
            case "wednesday", "wed" -> 3;
            case "thursday", "thu" -> 4;
            case "friday", "fri" -> 5;
            case "saturday", "sat" -> 6;
            case "sunday", "sun" -> 7;
            default -> 0;
            // Koden nedan avslutar programmet och ger ett error
            // default -> throw new IllegalArgumentException();
        };

        System.out.println("Ditt nummer är: " + dayNumber);
    }

}
