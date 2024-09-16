package se.iths.oop.animal;

public class Animal {

    public void talk(){
        System.out.println("This is an animal. No sound given");
    }

    public static void printName(){
        System.out.println(Animal.class.getSimpleName());
    }
}
