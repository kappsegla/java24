package se.iths.functional;

import java.util.ArrayList;
import java.util.List;

public class JavaStreams {

    public static void main(String[] args) {
        List<Car> cars = initialize();
        //Functional style programming
        var awdCars = cars.stream()
                .filter(Car::awd)
                .toList();

        System.out.println(awdCars);

        //Same thing but using imperative style of programming
        List<Car> carsWithAwd = new ArrayList<>();
        for (Car car : cars) {
            if (car.awd()) {
                carsWithAwd.add(car);
            }
        }
        System.out.println(carsWithAwd);

    }

    private static List<Car> initialize() {
        return List.of(
                new Car("Subaru", "WRX", 271, true),
                new Car("Volvo", "XC70", 197, true),
                new Car("Toyota", "Corolla", 169, false),
                new Car("Volkswagen", "ID3", 150, false),
                new Car("McLaren", "GTS", 626, false)
        );
    }
}

record Car(String make, String model, int horsepower, boolean awd) {
}
