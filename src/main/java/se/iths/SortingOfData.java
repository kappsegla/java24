package se.iths;

import java.util.Arrays;

public class SortingOfData {
    public static void main(String[] args) {
        ValueAndIndex[] values = {
                new ValueAndIndex(3, 0),
                new ValueAndIndex(1, 1),
                new ValueAndIndex(5, 2),
                new ValueAndIndex(4, 3),
                new ValueAndIndex(2, 4)};

        Arrays.sort(values);

        for (ValueAndIndex v : values) {
            System.out.println("Index: " + v.index() + " Value: " + v.value());
        }
    }
}

record ValueAndIndex(int value, int index) implements Comparable<ValueAndIndex> {
    @Override
    public int compareTo(ValueAndIndex other) {
        return this.value - other.value;
    }
}
