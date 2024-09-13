package se.iths.oop.animal;

public class Zoo {

    public static void main(String[] args) {

        Dog d = new Dog();
        //d.talk();

        Cat c = new Cat("Pelle");
        //c.talk();
        Cat c2 = new Cat("Pelle");

        if( c.equals(c2) )
            System.out.println("Same cat");
        else
            System.out.println("Different cat");

        System.out.println(c);

        Animal a = new Animal();
        //a.talk();

        Animal b = new Cat("Misse");
        b.talk();
        //b = d;
        //b.talk();




//        try {
//            throw new IllegalArgumentException();
//        } catch (IllegalArgumentException e) {
//            System.out.println("IllegalArgumentException");
//        } catch (Exception ex) {
//            System.out.println("Exception");
//        }

    }
}
