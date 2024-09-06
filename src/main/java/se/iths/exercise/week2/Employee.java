package se.iths.exercise.week2;

import java.time.LocalDate;


public class Employee {
    private String name;
    private int salary;
    private LocalDate startDate;

    public Employee(String name, int salary, LocalDate startDate){
        if (name.isBlank())
            throw new IllegalArgumentException("Name cannot be empty");
        this.name = name;
        this.salary = salary;
        this.startDate = startDate;
    }
}
