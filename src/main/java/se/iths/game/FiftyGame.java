package se.iths.game;

import java.util.Random;
import java.util.Scanner;

public class FiftyGame {
    public static final int RAND_BOUND = 51;
    Random rand = new Random();
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        var fiftyGame = new FiftyGame();
        fiftyGame.play();
    }

    private void play() {
        //Slumpa value 1-50
        int value = rand.nextInt(RAND_BOUND);
        System.out.print("Make a guess between 1 and 50: ");
        int guess = sc.nextInt();


    }
}
