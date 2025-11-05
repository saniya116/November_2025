import java.util.*;
class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine().toLowerCase();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine().toLowerCase();
        if (str1.length() != str2.length()) {
            System.out.println("Not Anagrams");
            return;
        }
        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if (Arrays.equals(a, b))
            System.out.println("Anagrams");
        else
            System.out.println("Not Anagrams");
    }
}

output:
Enter first String: listen
Enter second String:silent
