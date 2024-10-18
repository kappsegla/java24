package se.iths.observable.subject;

import se.iths.observable.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

    List<Observer> observers = new ArrayList<>();

    public final void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public final void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    protected final void notifyObservers() {
        for (Observer observer : observers) {
            observer.alert();
        }
    }
}
