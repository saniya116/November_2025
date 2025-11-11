import java.util.Scanner;
class StringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();
        System.out.println("\nLength of first string: " + str1.length());
        System.out.println("Length of second string: " + str2.length());
        String concat = str1 + " " + str2;
        System.out.println("\nConcatenated string: " + concat);
        System.out.println("\nUppercase: " + concat.toUpperCase());
        System.out.println("Lowercase: " + concat.toLowerCase());
        if (str1.equals(str2))
            System.out.println("\nBoth strings are equal");
        else
            System.out.println("\nStrings are not equal");
        String rev = "";
        for (int i = str1.length() - 1; i >= 0; i--) {
            rev += str1.charAt(i);
        }
        System.out.println("\nReverse of first string: " + rev);
    }
}

output:
Enter first string: Hello
Enter second string: World
Length of first string: 5
Length of second string: 5
Concatenated string: Hello World
Uppercase: HELLO WORLD
Lowercase: hello world
Strings are not equal

Reverse of first string: olleH
