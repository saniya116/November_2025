What is Exception Handling in Java? Explain the keywords try, catch, finally, throw, and throws with Syntax
Answer:
Exception Handling in Java is a mechanism used to handle runtime errors and ensure that the normal flow of the program is not interrupted. 
It allows the program to respond to unexpected conditions like invalid input, division by zero, file not found, network failure etc.
An exception is an event that occurs during execution of a program and disrupts its normal flow.
Exception Handling helps to detect, handle, and recover from such errors smoothly.
Keywords in Exception Handling
Keyword	Purpose
try	Block where we write risky code that may cause exception
catch	Used to handle the exception thrown by try block
finally	Executes always, whether exception occurs or not (used to close resources like files, DB, etc.)
throw	Used to manually throw an exception inside method
throws	Used in method declaration to indicate that method may throw exception
Syntax
try {
    // Risky code
} catch(ExceptionType e) {
    // Handling code
} finally {
    // Always executed code
}
Example

public class ExceptionDemo {
    static void check(int age) throws ArithmeticException {
        if(age < 18) {
            throw new ArithmeticException("Not eligible to vote");
        } else {
            System.out.println("Eligible to vote");
        }
    }

    public static void main(String[] args) {
        try {
            check(16);
        } catch(ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Program ended");
        }
    }
}
Output

Exception: Not eligible to vote
Program ended
Advantages of Exception Handling
Helps maintain normal program flow
Separates error-handling code from normal code
Prevents program crash
Supports debugging
