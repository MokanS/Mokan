package HomeworkNr10;

import java.util.function.Predicate;
import java.util.ArrayList;
import java.util.List;

class Employee {
    private String name;
    private String surname;
    private int age;
    private String department;

    public Employee(String name, String surname, int age, String department) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public static void testEmployee(Employee e, Predicate<Employee> testMethod) {
        if (testMethod.test(e)) {
            System.out.println("Тест пройден.");
        } else {
            System.out.println("Тест не пройден.");
        }
    }
}

public class Employees{
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Анна", "Иванова", 25, "Software Engineering"));
        employees.add(new Employee("Иван", "Петров", 30, "Marketing"));
        employees.add(new Employee("Алексей", "Сидоров", 22, "Software Engineering"));
        employees.add(new Employee("Мария", "Смирнова", 19, "HR"));

        Predicate<Employee> departmentTest = employee -> "Software Engineering".equals(employee.getDepartment());
        Employee.testEmployee(employees.get(0), departmentTest);
        Employee.testEmployee(employees.get(1), departmentTest);

        Predicate<Employee> ageTest = employee -> employee.getAge() > 20;
        Employee.testEmployee(employees.get(0), ageTest);
        Employee.testEmployee(employees.get(3), ageTest);

        Predicate<Employee> nameStartsWithATest = employee -> employee.getName().startsWith("А");
        Employee.testEmployee(employees.get(0), nameStartsWithATest);
        Employee.testEmployee(employees.get(1), nameStartsWithATest);
    }
}
