Static Keyword in Java
In Java, the static keyword is used for memory management. It belongs to the class and not to a specific object. 
When a member (variable/method/block) is declared as static, it can be accessed without creating an object of the class.
Static is used mainly for:
Common values
Utility functions
Memory efficiency
Static Variable
Also called Class Variable
One common copy is shared by all objects
stored in Method Area memory
Example:
class Student {
    int rollNo;
    static String college = "ABC College"; // static variable
    Student(int r) {
        rollNo = r;
    }
}
Here, college is shared among all students.
Static Method
Can be called without creating an object
Can only access static members directly (not instance variables)
Commonly used for utility functions
Example:
class Demo {
    static void display() {
        System.out.println("Static Method Called");
    }
    public static void main(String[] args) {
        Demo.display(); // calling without object
    }
}
Static Block
Executes automatically before main()
Used to initialize static data
Example:
class Test {
    static {
        System.out.println("Static Block Executed");
    }
    public static void main(String[] args) {
        System.out.println("Main Method Executed");
    }
}
Why Use Static?
Feature	Benefit
Shared memory	Reduces memory usage
No object creation required	Easy access
Fast execution	Better performance
