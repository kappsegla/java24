package se.iths.exercise.week4.exercise6;

public abstract sealed class Vehicle permits Car, Truck {
    private final String registrationNumber;

    public Vehicle(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public static void printVehicleProperties(Vehicle vehicle) {
        System.out.println(vehicle.getRegistrationNumber());
        switch (vehicle) {
            case Car car -> System.out.println(car.getNumberOfSeats());
            case Truck truck -> System.out.println(truck.getLoadCapacity());
        }
    }
}
