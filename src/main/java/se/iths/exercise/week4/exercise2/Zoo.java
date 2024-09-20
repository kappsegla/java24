package se.iths.exercise.week4.exercise2;

import java.util.Arrays;

public class Zoo {
    private final Animal[] animals = new Animal[5];

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.animals[0] = new Cat();
        zoo.animals[1] = new Horse();
        zoo.animals[2] = new Snake();
        zoo.animals[3] = new Frog();
        zoo.animals[4] = new Cat();

        if (zoo.animals[0].hashCode() == zoo.animals[4].hashCode()) {
            System.out.println("Same hashCode");
        }

        if (zoo.animals[0].equals(zoo.animals[4])) {
            System.out.println("Same type of animal");
        }

        Arrays.sort(zoo.animals);
        System.out.println(Arrays.toString(zoo.animals));
    }
}
