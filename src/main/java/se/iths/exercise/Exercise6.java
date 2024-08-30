package se.iths.exercise;

import java.util.Arrays;
import java.util.Random;

public class Exercise6 {

    public static void main(String[] args) {
        int[] anArray = new int[10];
        // Math.random()
        Random rand = new Random();
        for (int i = 0; i < 10 ; i++) {
            //anArray[i] = (int) (Math.random() * 11);
            int randomNumber = rand.nextInt(10);
            anArray[i] = randomNumber;
        }
        System.out.println(Arrays.toString(anArray));
    }

}
