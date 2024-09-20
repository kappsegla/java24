package se.iths.exercise.week4.exercise2;

import java.util.Arrays;

public class Zoo {
    private final Animal[] animals = new Animal[5];
    private int size;

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.add(new Cat());
        zoo.add(new Horse());
        zoo.add(new Snake());
        zoo.add(new Frog());
        zoo.add(new Cat());
        
        Arrays.sort(zoo.animals);
        System.out.println(Arrays.toString(zoo.animals));
    }

    public void add(Animal animal){
        //Todo: Add protection from adding more animals than array size?
        animals[size++] = animal;
    }
    public Animal get(int index){
        return animals[index];
    }
}
