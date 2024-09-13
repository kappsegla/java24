package se.iths.oop.person;

import se.iths.oop.person.membertype.MemberType;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

//Immutable object
public record Person(String name, LocalDate birthDate, MemberType type) {

    public int age() {
        return (int) ChronoUnit.YEARS.between(birthDate, LocalDate.now());
    }

    public Person withName(String name) {
        return new Person(name, this.birthDate, this.type);
    }
}
