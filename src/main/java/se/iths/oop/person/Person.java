package se.iths.oop.person;

import java.time.LocalDate;

//Immutable object
public record Person(String name, LocalDate birthDate) {}
