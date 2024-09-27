package se.iths.exercise.week5;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercise4 {

    public static Set<String> createSetFromString(String str){
        return new HashSet<>(List.of(str.toLowerCase().split(" ")));
    }

    public static void main(String[] args) {
        System.out.println(createSetFromString("Hello World"));
        System.out.println(createSetFromString("This should have one this"));
    }

}
