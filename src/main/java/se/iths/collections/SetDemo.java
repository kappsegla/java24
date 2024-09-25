package se.iths.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {
//        Set<String> set = new HashSet<>();
//        set.add("A");
//        set.add("B");
//        set.add("C");
//        set.add("AB");
//        set.add("A");
//
//        set.forEach(System.out::println);

        Set<Mutable> mutableSet = new HashSet<>();
        mutableSet.add(new Mutable(1));
        mutableSet.add(new Mutable(2));
        var m3 = new Mutable(3);
        mutableSet.add(m3);
        mutableSet.add(new Mutable(1));
        m3.setValue(2);
        mutableSet.add(new Mutable(4));
        mutableSet.forEach(System.out::println);

        Set<Mutable> mutableSet2 = new LinkedHashSet<>();
    }
}

class Mutable {
    private int value;

    public Mutable(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mutable mutable)) return false;
        return value == mutable.value;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }

    @Override
    public String toString() {
        return value + "";
    }
}
