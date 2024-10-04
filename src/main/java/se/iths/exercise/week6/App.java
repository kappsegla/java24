package se.iths.exercise.week6;

import java.util.List;

public class App {
    public final static List<Employee> employees = EmployeeFactory.getAllEmployees();

    public static void main(String[] args) {

        //allEmployeesWithSalaryOver(2_000_000);
        //numberOfEmployees();
        employeeWithHighestSalary();

    }

    public static void allEmployeesWithSalaryOver(int amount) {
        employees.stream()
                .filter(employee -> employee.salary() > amount)
                .forEach(System.out::println);
    }

    public static void numberOfEmployees() {
        var count = employees.stream().count();

        System.out.println(count);
    }

    public static void employeeWithHighestSalary() {

    }


}
