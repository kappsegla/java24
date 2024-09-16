package se.iths.oop.fruit;

public interface Fruit {
    void peel();

    //Abstract demands that the programmer implements this method in subclasses
    //When using abstract methods, the class must be abstract too.
    void eat();
}

class Apple implements Fruit{
    @Override
    public void peel() {
        System.out.println("Apple peeling");
    }

    @Override
    public void eat() {
        System.out.println("Eating an apple");
    }
}

final class Banana implements Fruit {
    @Override
    public void peel() {
        System.out.println("Banana peeling");
    }

    @Override
    public void eat() {
        System.out.println("Eating a banana");
    }
}

class RoyalGala extends Apple {
    //This is okey but we can't make subclasses of Banana since its final
}

class FruitSallad {
    public static void main(String[] args) {
        Fruit fruit = new Apple();
        Fruit fruit2 = new Banana();
        //Fruit fruit3 = new Fruit(); //Can't be instantiated because Fruit is abstract

        Fruit[] fruits = {fruit, fruit2};
        for (Fruit f : fruits) {
            f.peel();
            f.eat();
        }

    }
}
