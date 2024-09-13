package se.iths.oop;

import java.util.Objects;

public class Person {
    private String name;
    private String personalNumber;

    public Person(String name, String personalNumber) {
        this.name = name;
        this.personalNumber = personalNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return Objects.equals(personalNumber, person.personalNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(personalNumber);
    }
}
