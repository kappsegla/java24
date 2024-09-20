package se.iths.exercise.week4.exercise2;

import java.util.Arrays;
import java.util.Iterator;

public class Zoo implements Iterable<Animal> {
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
        for(Animal animal : zoo){
            System.out.println(animal);
        }
        // What an iterator does behind the scene
//        Iterator<Animal> iterator = zoo.iterator();
//        while (iterator.hasNext()) {
//            Animal animal = iterator.next();
//            System.out.println(animal);
//        }
        //System.out.println(Arrays.toString(zoo.animals));
    }

    @Override
    public Iterator<Animal> iterator() {
        // The code below works since arrays implements the Iterator interface
        //return Arrays.stream(animals).iterator();

        // However this gives us more freedom to decide what we want to do
        return new Iterator<>() {
            int index = 0;

            @Override
            public boolean hasNext() {
                return index < animals.length;
            }

            @Override
            public Animal next() {
                return animals[index++];
            }
        };
    }

    public void add(Animal animal){
        //Todo: Add protection from adding more animals than array size?
        animals[size++] = animal;
    }

    public Animal get(int index){
        return animals[index];
    }
}
