package se.iths.observable;

public class Demo {
    public static void main(String[] args) {

        Subject subject = new Subject();

        subject.registerObserver(()-> System.out.println("Hello from first observer"));
        subject.registerObserver(()-> System.out.println("Hello from second observer"));

        subject.notifyObservers();

        subject.registerObserver(()-> System.out.println("Hello from third observer"));
        subject.notifyObservers();

    }
}
