package se.iths;

import java.util.Arrays;
import java.util.Comparator;

public class SortingOfData {
    public static void main(String[] args) {
        ValueAndIndex[] values = {
                new ValueAndIndex(3, 0),
                new ValueAndIndex(1, 1),
                new ValueAndIndex(5, 2),
                new ValueAndIndex(4, 3),
                new ValueAndIndex(2, 4)};

        //Arrays.sort(values);
        //Arrays.sort(values, (o1, o2)-> o1.value() - o2.value() );
        Arrays.sort(values, Comparator.comparingInt(ValueAndIndex::value).reversed());

        for (ValueAndIndex v : values) {
            System.out.println("Index: " + v.index() + " Value: " + v.value());
        }
    }
}

record ValueAndIndex(int value, int index) {

}
