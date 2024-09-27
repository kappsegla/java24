package se.iths.exercise.week5;

import java.util.ArrayList;
import java.util.Comparator;

public class Exercise1 {

    public static void main(String[] args) {
        // 1. Creating an ArrayList
        ArrayList<String> list = new ArrayList<>();
        // 2. Adding elements to the ArrayList
        list.add("Coffee");
        list.add("Tea");
        // 3. Accessing an element in the ArrayList
        String index0 = list.get(0);
        String index1 = list.get(1);
        String first = list.getFirst();
        String last = list.getLast();
        // 4. Modifying an element in the ArrayList
        list.set(1, "Espresso");
        // 5. Removing an element from the ArrayList
        //String removedItem = list.remove(1);
        boolean removed = list.remove("Coffee");
        // All variables that previously referenced the removed value
        // will still have a reference to that value. This is why
        // index0 still returns "Coffee" even if we removed it
        System.out.println(list);
        // 6. Checking if the ArrayList is empty
        if (list.isEmpty())
            System.out.println("List is empty");
        // 7. Getting the size of the ArrayList
        System.out.println("List size: " + list.size());
        // 8. Checks if an object exists in the ArrayList.
        list.add("Tea");
        list.add("Tea");
        String tea = "Tea";
        if (list.contains(tea)) System.out.println("List contains Tea!");
        // 8a. What index does tea have?
        int firstIndex = list.indexOf("Tea");
        System.out.println("Index of tea: " + firstIndex);
        int lastIndex = list.lastIndexOf("Tea");
        System.out.println("Last index of tea: " + lastIndex);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(tea)) {
                System.out.println("We found tea on index " + i);
            }
        }
        // 9. Write a custom sorting of the objects in the ArrayList with an implementation of Comparator .
        list.sort(Comparator.comparing(o -> o.substring(1)));
        System.out.println(list);
    }
}
