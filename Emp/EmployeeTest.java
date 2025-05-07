// A) Write a Java program to create a class called Employee with methods called work() and getSalary(). 
// Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee().


class Employee {
    public void work() {
        System.out.println("Employee is working.");
    }

    public double getSalary() {
        return 30000.0;  // base salary
    }
}

// Subclass HRManager extending Employee
class HRManager extends Employee {
    @Override
    public void work() {
        System.out.println("HR Manager is managing employee relations and hiring.");
    }

    public void addEmployee() {
        System.out.println("New employee added by HR Manager.");
    }
}

// Main class to test the implementation
public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee();
        System.out.println("Employee:");
        emp.work();
        System.out.println("Salary: " + emp.getSalary());

        System.out.println("\nHR Manager:");
        HRManager hr = new HRManager();
        hr.work();                // Overridden method
        System.out.println("Salary: " + hr.getSalary());  // Inherited method
        hr.addEmployee();         // New method in subclass
    }
}
