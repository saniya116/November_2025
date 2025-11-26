import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp = num, sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit * digit * digit;
            temp /= 10;
        }
       if (sum == num)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is NOT an Armstrong number");
    }
}

output:
Enter a number:153
153 is an ArmStrong number
