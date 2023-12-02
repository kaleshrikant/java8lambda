package predicates;

import java.util.ArrayList;
import java.util.function.Predicate;

 // Return employee details if salary > 50k and experience > 3

class Employee {
    String ename;
    int salary;

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

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    int experience;

    Employee(String ename, int salary, int experience) {
        this.ename = ename;
        this.salary = salary;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Employee [ename=" + ename + ", salary=" + salary + ", experience=" + experience + "]";
    }

}

public class Demo2 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 50000, 5));
        employees.add(new Employee("David", 20000, 2));
        employees.add(new Employee("Scott", 30000, 3));
        employees.add(new Employee("Mary", 40000, 6));

        Predicate<Employee> employeePredicate = e -> (e.getSalary() > 50000 && e.getExperience() > 3);
        for (Employee employee : employees) {
            if (employeePredicate.test(employee))
                System.out.println(employee);
        }
    }
}