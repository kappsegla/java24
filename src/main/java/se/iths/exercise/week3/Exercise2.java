package se.iths.exercise.week3;

import java.util.Arrays;

public class Exercise2 {
    public static void main(String[] args) {
        String[] inArray = {"1", "2", "3", "4"};
        System.out.println(Arrays.toString(copyWithExclusion(inArray, 0)));
        System.out.println(Arrays.toString(copyWithExclusion(inArray, 4))); // Ska returnera inArray
    }

    public static String[] copyWithExclusion(String[] org, int exclusionIndex) {

        String[] tempArray = new String[org.length - 1];
        int j = 0;

        for (int i = 0; i < org.length; i++) {
            if (i != exclusionIndex) {
                tempArray[j++] = org[i];
            }
        }
        return tempArray;
    }

}
