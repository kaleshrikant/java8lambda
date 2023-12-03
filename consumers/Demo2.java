package consumers;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

// Showcasing use of Function, Predicate and Consumer.

class Employee {
    String ename;
    int salary;
    String gender;

    public Employee(String ename, int salary, String gender) {
        this.ename = ename;
        this.salary = salary;
        this.gender = gender;
    }
    
    public String getEname() {
        return ename;
    }
    public void setEname(String ename) {
        this.ename = ename;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Employee [ename=" + ename + ", salary=" + salary + ", gender=" + gender + "]";
    }
}

public class Demo2 {
    public static void main(String[] args) {
        
        List<Employee> employees = new ArrayList<>();
            employees.add(new Employee("David", 50000, "Male"));
            employees.add(new Employee("John", 30000, "Male"));
            employees.add(new Employee("Mary", 20000, "Female"));
            employees.add(new Employee("Scott", 60000, "Male"));

            // Task 1 
        Function<Employee,Integer> empFunction = emp -> (emp.getSalary() * 10/100);
            // Task 2
        Predicate<Integer> empPredicate = sal -> sal > 5000;
            // Task 3
        Consumer<Employee> empConsumer = e -> {
            System.out.println("Employee Name : "+e.getEname());
            System.out.println("Employee Salary : "+e.getSalary());
            System.out.println("Employee Gender : "+e.getGender());
        };

        for (Employee employee : employees) {
            int bouns = empFunction.apply(employee);
            boolean bounsResult = empPredicate.test(bouns);
            if(bounsResult)
                empConsumer.accept(employee);
        }
    }
}
