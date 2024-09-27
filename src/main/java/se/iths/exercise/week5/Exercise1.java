package se.iths.exercise.week5;

import java.util.ArrayList;

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

    }


// 6. Checking if the ArrayList is empty
// 7. Getting the size of the ArrayList
// 8. Checks if an object exists in the ArrayList.
// 9. Write a custom sorting of the objects in the ArrayList with an implementation of Comparator .
}
