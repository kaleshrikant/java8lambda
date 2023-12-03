package function;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;


// Function program to apply bonus based on employee's salary.


class Employee {
    String ename;
    int salary;

    @Override
    public String toString() {
        return "Employee [ename=" + ename + ", salary=" + salary + "]";
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

    Employee(String ename, int salary) {
        this.ename = ename;
        this.salary = salary;
    }
}

public class Demo2 {
    public static void main(String[] args) {
        ArrayList<Employee> employeeList = new ArrayList<>();
            employeeList.add(new Employee("David", 50000));
            employeeList.add(new Employee("John", 30000));
            employeeList.add(new Employee("Mary", 20000));
        
        // Calculating bonus for each employee
        Function<Employee,Integer> fun = emp -> {
                int sal = emp.getSalary();
                if(sal > 10000 && sal <= 20000) {
                    return (sal * 10/100);
                } else if (sal > 20000 && sal <= 30000) {
                    return (sal * 20/100);
                } else if (sal > 30000 && sal <= 40000) {
                    return (sal * 30/100);
                } else {
                    return (sal * 40/100);
                }
        };

        // Checking bonus > 500 for print
        Predicate<Integer> pre = bonus -> bonus > 5000;

        for (Employee employee : employeeList) {
            int bonus = fun.apply(employee);
            if (pre.test(bonus)) {
                System.out.println("Employee Name : "+employee.getEname());
                System.out.println("Employee Salary : "+employee.getSalary());
            }
        }
    }
}
