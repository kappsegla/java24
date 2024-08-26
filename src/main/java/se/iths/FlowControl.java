package se.iths;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FlowControl {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            System.out.print("Skriv in ett tal: ");
            int value = scanner.nextInt();

            if (value > 0) {
                System.out.println("Hej om sant");
                System.out.println("Hej igen");
            }
        } catch (InputMismatchException e) {
            //This code only runs if we write something not 0-9 in scanner.nextInt()
            System.out.println("Only 0-9");
        }
        System.out.println("Bye!");

    }
}
