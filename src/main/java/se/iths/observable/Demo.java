package se.iths.observable;

public class Demo {
    public static void main(String[] args) {

//        Subject subject = new Subject();
//        subject.registerObserver(()-> System.out.println("Hello from first observer"));
//        subject.registerObserver(()-> System.out.println("Hello from second observer"));
//        subject.notifyObservers();

        GameSubject gameSubject = new GameSubject("Moose");
        gameSubject.registerObserver(() -> System.out.println("Game changed to: " + gameSubject.getType()));
        gameSubject.registerObserver(() -> System.out.println("New game type: " + gameSubject.getType()));

        gameSubject.setType("Deer");
        gameSubject.setType("Hog");
    }
}
