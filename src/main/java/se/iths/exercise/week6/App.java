package se.iths.exercise.week6;

import java.util.List;

public class App {

    public static void main(String[] args) {

        allEmployeesWithSalaryOver(2_000_000);


    }

    public static void allEmployeesWithSalaryOver(int amount) {
        List<Employee> employees = EmployeeFactory.getAllEmployees();
        employees.stream()
                .filter(employee -> employee.salary() > amount)
                .forEach(System.out::println);
    }




}
