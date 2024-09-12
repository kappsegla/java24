package se.iths.oop.animal;

public class Zoo {

    public static void main(String[] args) {
        Animal animal = new Cat();
        Animal animal2 = new Dog();

        Cat cat = new Cat();
        Dog dog = new Dog();
        Animal animal3 = cat;

        Object o = new Dog();

    }
}
