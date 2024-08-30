package se.iths.exercise;

import java.util.Arrays;
import java.util.Random;

public class Exercise6 {

    public static void main(String[] args) {
        int[] anArray = new int[10];
        int[] reverseArray = new int[10];

        Random rand = new Random();
        for (int i = 0; i < 10 ; i++) {
            //anArray[i] = (int) (Math.random() * 11);
            int randomNumber = rand.nextInt(10);
            anArray[i] = randomNumber;
        }
        int j = 9;
        for (int i = 0; i <anArray.length ; i++) {
            reverseArray[j] = anArray[i];
            j--;
        }
        System.out.println(Arrays.toString(anArray));
        System.out.println(Arrays.toString(reverseArray));
    }

}
