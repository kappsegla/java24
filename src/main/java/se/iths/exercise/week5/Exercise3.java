package se.iths.exercise.week5;

import java.util.ArrayList;
import java.util.List;

public class Exercise3 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("coconut");
        list.add("orange");
        System.out.println(list);
        var reversedList = reverse(list);
        reversedList.addLast("lemon");
        System.out.println(list);

        System.out.println(reversedList);
    }
    public static List<String> reverse(List<String> strings){
        //reversed method does not create a new list, just returns a list that uses the original list
        //but all methods are inverted. So addFirst becomes addLast and updates the original list.
        return new ArrayList<>(strings.reversed());
    }
}
