package se.iths.exercise.week1;

import java.util.Arrays;
import java.util.Random;

public class Exercise6 {
    public static final int ARRAY_SIZE = 10;

    public static void main(String[] args) {
        int[] anArray = new int[ARRAY_SIZE];
        int[] reverseArray = new int[ARRAY_SIZE];

        Random rand = new Random();
        for (int i = 0; i < ARRAY_SIZE; i++) {
            //anArray[i] = (int) (Math.random() * 11);
            int randomNumber = rand.nextInt(10);
            anArray[i] = randomNumber;
        }
        int j = ARRAY_SIZE - 1;
        for (int i = 0; i < ARRAY_SIZE; i++) {
            reverseArray[j] = anArray[i];
            j--;
        }
        System.out.println(Arrays.toString(anArray));
        System.out.println(Arrays.toString(reverseArray));
        int sum = 0;
        for (int i = 0; i < anArray.length; i += 2) {
            if ((i % 2) == 0) sum += anArray[i];
        }
        System.out.println(sum);
    }

}
