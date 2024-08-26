package se.iths;

import java.util.Scanner;

public class HelloWorld {

    public static Scanner scanner = new Scanner(System.in);

      public static void main(String[] args) {
        System.out.println("Hello from IntelliJ");
        String inputText = scanner.nextLine();
        System.out.println("Du skrev " + inputText);
        System.out.println("Bye!");
        System.out.println(inputText);
    }
}
