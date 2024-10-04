package se.iths.exercise.week6;

import java.util.*;

public class App {
    public final static List<Employee> employees = EmployeeFactory.getAllEmployees();

    public static void main(String[] args) {

        //allEmployeesWithSalaryOver(2_000_000);
        //numberOfEmployees();
        //employeeWithHighestSalary();
        employeeWithLowestSalary();
        test();
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
        Optional<Employee> employee = employees.stream()
                .max(Comparator.comparingInt(Employee::salary));

        employee.ifPresent(System.out::println);
    }

    public static void employeeWithLowestSalary() {
        Optional<Employee> employee = employees.stream()
                .min(Comparator.comparingInt(Employee::salary));

        employee.ifPresent((e) -> System.out.println(e.firstName() + " " + e.lastName()));

        // Alternativ 2
        //var min = employees.stream().min(Comparator.comparing(Employee::salary)).orElseThrow().salary();
        //employees.stream()
        // .filter(e -> e.salary() == min)
        // .toList()
        // .forEach(System.out::println);
    }

    public static void test() {
        List<Employee> lowestSalaryEmployees = employees.stream()
                .parallel()
                .reduce(new ArrayList<Employee>(), App::keepIfLowest, (left, right) -> {
                    if (left.isEmpty())
                        return right;
                    else if (right.isEmpty())
                        return left;
                    else if (left.get(0).salary() < right.get(0).salary())
                        return left;
                    else if (left.get(0).salary() > right.get(0).salary())
                        return right;
                    else {
                        var list = new ArrayList<>(right);
                        list.addAll(left);
                        return list;
                    }
                });

        lowestSalaryEmployees.forEach(System.out::println);
    }

    private static ArrayList<Employee> keepIfLowest(ArrayList<Employee> list, Employee employee) {
        if (list.isEmpty() || employee.salary() < list.get(0).salary()) {
            list.clear();
            list.add(employee);
        } else if (employee.salary() == list.get(0).salary()) {
            list.add(employee);
        }
        return list;
    }
}
