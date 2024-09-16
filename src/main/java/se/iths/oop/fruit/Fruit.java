package se.iths.oop.fruit;

public abstract class Fruit {
    public void peel() {
        System.out.println("Fruit");
    }

    public void eat() {
        System.out.println("Fruit");
    }
}

class Apple extends Fruit {
    @Override
    public void peel() {
        System.out.println("Apple peeling");
    }

    @Override
    public void eat() {
        System.out.println("Eating an apple");
    }
}

class Banana extends Fruit {
    @Override
    public void peel() {
        System.out.println("Banana peeling");
    }

    @Override
    public void eat() {
        System.out.println("Eating a banana");
    }
}

class FruitSallad {
    public static void main(String[] args) {
        Fruit fruit = new Apple();
        Fruit fruit2 = new Banana();
        //Fruit fruit3 = new Fruit(); Can't be instantiated because Fruit is abstract

        Fruit[] fruits = {fruit, fruit2};
        for (Fruit f : fruits) {
            f.peel();
            f.eat();
        }

    }
}
