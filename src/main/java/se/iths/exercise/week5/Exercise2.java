package se.iths.exercise.week5;

import java.util.Arrays;
import java.util.List;

public class Exercise2 {

    /**
     * This method will convert our array into an List implementation.
     * Depending on which alternative that we use we will get different list implementations.
     *
     * @param array
     * @return
     */
    private static List<String> arrayToList(String[] array) {
        //Alt:1 Create Arraylist and copy from array
//        var list = new ArrayList<String>();
//        Collections.addAll(list, array);
//        return list;
        //Alt: 2 Creates list with the array as backing array. Creates modifiable list
//        return Arrays.asList(array);

        //Alt:3 Creates list and copy each value from array (list becomes unmodifiable)
        return Arrays.stream(array).toList();
    }

    public static void main(String[] args) {
        List<String> list = arrayToList(new String[] { "a", "b", "c" });
        System.out.println(list);

        List<String> strings = List.of("a", "b", "c");
        arrayToList(strings.toArray(new String[0]));
    }
}
