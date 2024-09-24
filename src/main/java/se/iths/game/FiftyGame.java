package se.iths.game;

import java.util.Random;
import java.util.Scanner;

public class FiftyGame {
    public static final int MAX_RANDOM = 50;
    public static final int RAND_BOUND = MAX_RANDOM + 1;

    Random rand = new Random();
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        var fiftyGame = new FiftyGame();
        fiftyGame.play();
    }

    private void play() {
        //Slumpa value 1-50
        int value = rand.nextInt(RAND_BOUND);
        boolean exit = false;
        while (!exit) {
            System.out.print("Make a guess between 1 and " + MAX_RANDOM + ": ");
            int guess = sc.nextInt();
            if (guess == value) {
                System.out.println("Congratulations! You win!");
                exit = true;
            } else if (guess < value) {
                System.out.println("Your guess is too low!");
            } else {
                System.out.println("Your guess is too high!");
            }
        }
        System.out.println("Thanks for playing");
    }
}
