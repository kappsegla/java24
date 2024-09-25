package se.iths.game;

import se.iths.oop.animal.Animal;
import se.iths.oop.animal.Cat;

import java.util.ArrayList;
import java.util.List;

public class Gen<T> {

    private T ob;

    public Gen(T ob) {
        this.ob = ob;
    }

    public T getOb(){
        return ob;
    }

    public void showType(){
        System.out.println(ob.getClass().getName());
    }

    public void printFieldType() throws NoSuchFieldException {
        System.out.println(getClass().getDeclaredField("ob").getType().getName());
    }
}

class GenDemo{

    public static void printInfo(Gen<?> genericObject){
        System.out.println(genericObject.getOb());
    }

    public static void printAnimals(List<? extends Animal> animals){
        animals.forEach(System.out::println);
    }

    public static void main(String[] args) throws NoSuchFieldException {
        Gen<String> string = new Gen<>("String");
        printInfo(string);
        Gen<Integer> integer = new Gen<>(1);
        printInfo(integer);

        List<Cat> animals = new ArrayList<>();
        animals.add(new Cat("Misse"));
        animals.add(new Cat("Pelle"));
        printAnimals(animals);
        // ? extends Animal only allows List<> of classes extending Animal
        //List<String> someStrings = List.of("Hej","Då");
        //printAnimals(someStrings);

//        var value = string.getOb();
//        System.out.println(value);
//        string.showType();
//        string.printFieldType();
//
//        Gen<Integer> integer = new Gen<>(1);
//        var value2 = integer.getOb();
//        integer.showType();

    }
}
