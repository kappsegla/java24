package se.iths.observable;

import se.iths.observable.subject.Subject;

public class GameSubject extends Subject {

    private String type;

    public GameSubject(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
        notifyObservers();
    }
}
