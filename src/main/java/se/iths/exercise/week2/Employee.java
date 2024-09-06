package se.iths.exercise.week2;

import java.time.LocalDate;


public class Employee {
    private final String name;
    private int salary;
    private final LocalDate startDate;

    public Employee(String name, int salary, LocalDate startDate) {
        if (name.isBlank())
            throw new IllegalArgumentException("Name cannot be empty");
        this.name = name;
        this.salary = salary;
        this.startDate = startDate;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
    

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

}
