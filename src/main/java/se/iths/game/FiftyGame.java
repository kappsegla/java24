package se.iths.game;

import java.util.ArrayList;
import java.util.List;
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
        int guessCount = 0;
        boolean exit = false;
        List<String> guesses = new ArrayList<>();

        while (!exit) {
            System.out.print("Make a guess between 1 and " + MAX_RANDOM + ": ");
            int guess = sc.nextInt();
            guessCount++;
            guesses.add(String.valueOf(guess));
            if (guess == value) {
                victoryCelebration(guessCount, guesses);
                exit = true;
            } else if (guess < value) {
                System.out.println("Your guess is too low!");
            } else {
                System.out.println("Your guess is too high!");
            }
        }
        System.out.println("Thanks for playing");
    }

    private static void victoryCelebration(int guessCount, List<String> guesses) {
        System.out.println("Congratulations! You win after " + guessCount +
                           (guessCount > 1 ? " guesses.": " guess."));
        System.out.print("Your" + (guessCount > 1 ? " guesses ": " guess ") +
                         "are ");
        System.out.println(String.join(",", guesses));
    }
}
