package se.iths.exercise.week4.exercise6;

public class Car extends Vehicle {
    private int numberOfSeats;

    public Car(String registrationNumber, int numberOfSeats) {
        super(registrationNumber);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }
}
