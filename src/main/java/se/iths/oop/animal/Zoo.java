package se.iths.oop.animal;

public class Zoo {

    public static void main(String[] args) {

        Dog d = new Dog();
        d.talk();

        Cat c = new Cat();
        c.talk();

        Animal a = new Animal();
        a.talk();

        Animal b = new Cat();
        b.talk();
        b = d;
        b.talk();




//        try {
//            throw new IllegalArgumentException();
//        } catch (IllegalArgumentException e) {
//            System.out.println("IllegalArgumentException");
//        } catch (Exception ex) {
//            System.out.println("Exception");
//        }

    }
}
