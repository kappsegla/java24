package se.iths.oop;

import java.time.LocalDate;

//Immutable object
public record Person(String name, LocalDate birthDate) {}
