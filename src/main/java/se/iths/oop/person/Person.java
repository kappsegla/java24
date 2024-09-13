package se.iths.oop.person;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

//Immutable object
public record Person(String name, LocalDate birthDate) {

    public int age() {
        return (int) ChronoUnit.YEARS.between(birthDate, LocalDate.now());
    }
}
