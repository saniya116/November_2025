Difference Between == and .equals() in Java
In Java, both == and .equals() are used to compare things,
but they do NOT work the same.
1. == Operator (Reference Comparison)
The == operator checks:
Are both variables pointing to the exact same memory location?
It is used for reference comparison, not value comparison.
When to use:
When comparing primitive data types
(int, float, char, boolean, double, long, byte, short)
Based on type:
Primitives → compares value
Objects → compares memory address
Example:
int a = 10;
int b = 10;
System.out.println(a == b);   )
String s1 = new String("hello");
String s2 = new String("hello");
System.out.println(s1 == s2); 
2. .equals() Method (Value Comparison)
.equals() is a method that checks:
Do the two objects have the same value/content?
It is defined in the Object class, and many classes override it (String, Integer, ArrayList, etc.)
When to use:
When comparing objects
When you want to compare actual data, not memory address
Example:
String s1 = new String("hello");
String s2 = new String("hello");
System.out.println(s1.equals(s2)); // true (same text content)
3. Important Differences
Feature	==	.equals()
Type	Operator	Method
Works on	Primitives & Objects	Only Objects
Compares	Memory location	Value/content
String Comparison	Usually false	Usually true
Override ability	Cannot override	Can override in class
 4. Special Case: String PoolJava stores string literals in a special memory called the String Pool.
Example:
String s1 = "hello";
String s2 = "hello";
Here:
Both refer to the same memory location
So:
s1 == s2 → true
s1.equals(s2) → true
But with new keyword, memory location is different.
5. Example Code Showing Difference
public class CompareExample {
    public static void main(String[] args) {
        String a = "java";
        String b = "java";
        String x = new String("java");
        String y = new String("java");
        System.out.println(a == b);       
        System.out.println(a.equals(b)); 
        System.out.println(x == y);       
        System.out.println(x.equals(y));  
    }
}
