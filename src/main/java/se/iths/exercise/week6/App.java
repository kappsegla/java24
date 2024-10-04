package se.iths.exercise.week6;

import java.util.*;
import java.util.stream.Collectors;

public class App {
    public final static List<Employee> employees = EmployeeFactory.getAllEmployees();

    public static void main(String[] args) {

        //allEmployeesWithSalaryOver(2_000_000);
        //numberOfEmployees();
        //employeeWithHighestSalary();
        //employeeWithLowestSalary();
        //employeesWithLowestSalary();
        //employeesWorkingOnMoreThanOneProject();
        //projectNames();
        //groupEmployeesByNumberOfProjects();
        //checkIfAllEmployeesHasSalaryOver(2_000_000);
        //checkIfAnyEmployeeHasSalaryUnder(1_000_000);
        //totalSalaryOfEmployees();
        //sortEmployeesByAscSalary();
        //limitFive();
        //skipFive();

        lowestAndHighestSalary();

    }

    public static void lowestAndHighestSalary() {
        employees.stream()
                .map(ShortEmployee::create)
                .collect(Collectors.teeing(
                        Collectors.minBy(Comparator.comparingInt(ShortEmployee::salary)),
                        Collectors.maxBy(Comparator.comparingInt(ShortEmployee::salary)),
                        //MinMax::new
                        List::of
                        //(min, max) -> List.of(min, max) - lambda version of List::of
                )).forEach(System.out::println);
    }

record ShortEmployee(String name, int salary){
       public ShortEmployee(Employee employee){
           this(employee.firstName() + " " + employee.lastName(), employee.salary());
       }

       public static ShortEmployee create(Employee employee){
           return new ShortEmployee(employee.firstName() + " " + employee.lastName(), employee.salary());
       }
}

//    record MinMax(Optional<Employee> a, Optional<Employee> b) {
//    }

    public static void skipFive() {
        employees.stream().skip(5).forEach(System.out::println);
    }

    public static void limitFive() {
        employees.stream().limit(5).forEach(System.out::println);
    }

    public static void sortEmployeesByAscSalary() {
        employees.stream()
                .sorted(Comparator.comparingInt(Employee::salary))
                .forEach(System.out::println);
    }

    public static void totalSalaryOfEmployees() {
        double sum = employees.stream()
                .mapToDouble(Employee::salary)
                .sum();

        System.out.printf("Sum: %,.2f", sum);
    }

    public static void checkIfAnyEmployeeHasSalaryUnder(int amount) {
        System.out.println(employees.stream()
                .anyMatch(e -> e.salary() < amount));
    }

    public static void checkIfAllEmployeesHasSalaryOver(int amount) {
//        boolean allOverAmount = true;
//
//        for (Employee employee : employees) {
//            if (employee.salary() < amount) {
//                allOverAmount = false;
//                break;
//            }
//        }
//        System.out.println(allOverAmount);

        System.out.println(employees.stream().allMatch(e -> e.salary() > amount));
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
        var min = employees.stream()
                .min(Comparator.comparing(Employee::salary))
                .orElseThrow()
                .salary();

        employees.stream()
                .filter(e -> e.salary() == min)
                .forEach(System.out::println);
    }

    public static void employeesWorkingOnMoreThanOneProject() {
        employees.stream()
                .filter(e -> e.projects().size() > 1)
                .map(e -> e.firstName() + " " + e.lastName() + ", Projects: " + e.projects().size())
                .forEach(System.out::println);
    }

    public static void projectNames() {
        Set<Project> projects = new HashSet<>();

        employees.stream()
                .map(Employee::projects)
                .forEach(projects::addAll);

        projects.forEach(System.out::println);

        // Alternativ 2
        employees.stream()
                .map(Employee::projects)
                .flatMap(List::stream)
                .collect(Collectors.toSet())
                .forEach(System.out::println);  //forEach from Iterable interface
    }

    public static void employeesWithLowestSalary() {
        List<Employee> lowestSalaryEmployees = employees.stream()
                .reduce(new ArrayList<Employee>(), App::keepIfLowest, App::keepIfLowestCombiner);

        lowestSalaryEmployees.forEach(System.out::println);
    }

    public static void groupEmployeesByNumberOfProjects() {
        employees.stream()
                .collect(Collectors.groupingBy(e -> e.projects().size(),   //Key for the map
                        Collectors.mapping(Employee::firstName, Collectors.toList())))  //Value to put under key. .joining(",")
                .forEach((key, value) -> System.out.println(key + ": " + value));
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

    private static ArrayList<Employee> keepIfLowestCombiner(List<Employee> left, List<Employee> right) {
        throw new UnsupportedOperationException();
    }
}
