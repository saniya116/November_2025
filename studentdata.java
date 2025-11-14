import java.util.*;
class Student {
    String name;
    int rollNo;
    double marks;
    void inputDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        name = sc.nextLine();
        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();
        System.out.print("Enter Marks: ");
        marks = sc.nextDouble();
    }
    void displayDetails() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}
public class StudentMain {
    public static void main(String[] args) {
        Student s = new Student();
        s.inputDetails();
        s.displayDetails();
    }
}

output:
Enter Student Name: Saniya
Enter Roll Number: 12
Enter Marks: 89.5
Student Details 
Name: Saniya
Roll Number: 12
Marks: 89.5
