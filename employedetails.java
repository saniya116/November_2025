class Employee {
    String name;
    double basicSalary;
    Employee(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }
    double calculateSalary() {
        double hra = 0.10 * basicSalary;
        double da = 0.05 * basicSalary;
        return basicSalary + hra + da;
    }
    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Total Salary: " + calculateSalary());
    }
}
public class EmployeeMain {
    public static void main(String[] args) {
        Employee e = new Employee("Saniya", 30000);
        e.display();
    }
}

output:
Employee Name: Saniya
Total Salary: 34500.0
