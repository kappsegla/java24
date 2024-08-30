package se.iths.exercise;

public class Exercise5 {

    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Felaktig inmatning, måste vara 3 nummer");
            return;
        }
        int[] integers = new int[3];
        for (int i = 0; i < args.length; i++) {
            try {
                integers[i] = Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                //Skriv ut felmeddelande
                System.out.println("Fel format! Förväntade siffror");
                //Spara 0 på platsen
                integers[i] = 0;
            }
        }

        int max = integers[0];
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] > max) {
                max = integers[i];
            }
        }
        System.out.println("Max value is: " + max);


    }
}
