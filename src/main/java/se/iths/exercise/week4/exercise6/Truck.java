package se.iths.exercise.week4.exercise6;

public final class Truck extends Vehicle {
    private final int loadCapacity;

    public Truck(String registrationNumber, int loadCapacity) {
        super(registrationNumber);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }
}
