import java.util.Scanner;
class PowerNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        int base = sc.nextInt();
        System.out.print("Enter exponent: ");
        int exp = sc.nextInt();
        int result = 1;
        for (int i = 1; i <= exp; i++) {
            result *= base;
        }
        System.out.println(base + " raised to " + exp + " is: " + result);
    }
}

output:
Enter base:2
Enter exponent:5
2 raised to 5 is:32
