import java.util.Scanner;
class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        if (str.equalsIgnoreCase(rev))
            System.out.println("\nThe string is a palindrome.");
        else
            System.out.println("\nThe string is not a palindrome.");
    }
}

output:
Enter a string: Madam
The string is a palindrome.
