package se.iths.oop.lambda;

@FunctionalInterface
public interface SAMInterface {
    void sayHi();
}

class SamImplementation implements SAMInterface {
    @Override
    public void sayHi() {
        System.out.println("Hi");
    }
}

class SamDemo {
    public static void main(String[] args) {
        SAMInterface sam = new SamImplementation();
        sam.sayHi();

        //Anonymous class, might be called SamDemo$1
        SAMInterface sam2 = new SAMInterface() {
            @Override
            public void sayHi() {
                System.out.println("Hi from lambda");
            }
        };
        sam2.sayHi();

        //Lambda implementation of a single abstract method interface
        SAMInterface sam3 = () -> System.out.println("Hi from lambda");
        sam3.sayHi();

        //Lambda implementation of a single abstract method interface
        SAMInterface sam4 = () -> printGreeting();
        sam4.sayHi();

    }

    private static void printGreeting() {
        System.out.println("Hi from lambda");
        System.out.println("Second line of code");
    }
}
