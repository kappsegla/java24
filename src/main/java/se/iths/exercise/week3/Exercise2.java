package se.iths.exercise.week3;

import java.util.Arrays;
import java.util.Objects;

public class Exercise2 {
    public static void main(String[] args) {
        String[] inArray = {"1", "2", "3", "4","2"};

        System.out.println(Arrays.toString(copyWithExclusion(inArray, 0)));
        System.out.println(Arrays.toString(copyWithExclusion(inArray, 1)));
        System.out.println(Arrays.toString(copyWithExclusion(inArray, 2)));
        System.out.println(Arrays.toString(copyWithExclusion(inArray, 3)));
        System.out.println(Arrays.toString(copyWithExclusion(inArray, 4))); // Ska returnera inArray
        System.out.println(Arrays.toString(copyWithExclusion(inArray, -1))); // Ska returnera inArray
        System.out.println(Arrays.toString(copyWithExclusion(inArray, "2")));
    }

    public static String[] copyWithExclusion(String[] org, String exclusionString) {
        int lost = 0;
        for (String s : org) {
            if (Objects.equals(s, exclusionString)) {
                lost++;
            }
        }
        String[] tempArray = new String[org.length - lost];
        int j = 0;
        for (String s: org){
            if (!Objects.equals(s, exclusionString)){
                tempArray[j++] = s;
            }
        }
        return tempArray;
    }

    public static String[] copyWithExclusion(String[] org, int exclusionIndex) {

        if (exclusionIndex >= org.length || exclusionIndex < 0 || org == null || org.length == 0) {
            return org;
        }

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
