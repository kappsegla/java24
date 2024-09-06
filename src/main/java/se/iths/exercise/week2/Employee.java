package se.iths.exercise.week2;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;


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

    //Use Period and Period.between for calculating an answer in years, months, days
    public int employmentTime(LocalDate date) {
        return (int) startDate.until(date, ChronoUnit.DAYS);
    }

    public int employmentTime() {
        return employmentTime(LocalDate.now());
    }

    public int employmentTime(String date) {
        try {
            return employmentTime(LocalDate.parse(date));
        } catch (DateTimeParseException e) {
            // Error message should be moved to class that implements this function
            System.out.println("Not correct formatted date!");
            throw e;
        }
    }


    public static void main(String[] args) {
        Employee employee = new Employee("John Smith", 1000, LocalDate.of(1990, 1, 1));
        System.out.println(employee.employmentTime(LocalDate.now()));
        System.out.println(employee.employmentTime("2021-03-31"));

        System.out.println(employee.getSalary()); // Should print 1000
        employee.setSalary(2000);
        System.out.println(employee.getSalary()); // Should print 2000
    }

}
