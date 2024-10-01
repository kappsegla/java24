package se.iths.functional;

import java.time.LocalTime;
import java.util.List;

public class Pure {
    public static int counter = 0;

    public static int add(int a, int b) {
        return a + b;
    }

    public static int count() {
        return counter++;
    }

    public static String greeting(final String name) {
        if (LocalTime.now().isBefore(LocalTime.of(12, 0))) {
            return "Good morning " + name;
        }
        return "Good afternoon " + name;
    }

    public static String pureGreeting(final String name, LocalTime time) {
        if (time.isBefore(LocalTime.of(12, 0))) {
            return "Good morning " + name;
        }
        return "Good afternoon " + name;
    }



    public static void main(String[] args) {
        System.out.println(add(1, 2));
        System.out.println(count());

        var list = List.of(1, 2, 3, 4);

        list.forEach(System.out::println);

        recursion(10);

    }

    public static void recursion(int value) {
        if (value == 0)
            return;
        recursion(value - 1);
        System.out.println(value);
    }
}
