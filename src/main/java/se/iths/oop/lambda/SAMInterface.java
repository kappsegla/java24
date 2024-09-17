package se.iths.oop.lambda;

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
                System.out.println(this.getClass().getName());
            }
        };
        sam2.sayHi();

    }
}
