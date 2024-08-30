package se.iths.exercise;

public class Exercise5 {

    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Felaktig inmatning, måste vara 3 nummer");
            return;
        }
//        int[] integers = new int[3];
//        for (int i = 0; i < args.length; i++) {
//            try {
//                integers[i] = Integer.parseInt(args[i]);
//            } catch (NumberFormatException e) {
//                //Skriv ut felmeddelande
//                System.out.println("Fel format! Förväntade siffror");
//                //Spara 0 på platsen
//                integers[i] = 0;
//            }
//        }
        int max = Integer.MIN_VALUE;
        for (String arg : args) {
            int tal = 0;
            try {
                tal = Integer.parseInt(arg);
            }catch (NumberFormatException e) {
                System.out.println("Fel format! Förväntade siffror");
            }
            max = Math.max(tal, max);
        }
        System.out.println("Max value is: " + max);
    }
}
