package se.iths.exercise.week5;

import java.util.SortedSet;
import java.util.TreeSet;

public class JavaTree {
    public static void main(String[] args) {
        SortedSet<Integer> sortedTree = new TreeSet<>();
        sortedTree.add(6);
        sortedTree.add(8);
        sortedTree.add(4);
        sortedTree.add(3);
        sortedTree.add(5);
        sortedTree.add(7);
        sortedTree.add(9);

        System.out.println(sortedTree);
    }
}
