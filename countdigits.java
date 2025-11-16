import java.util.Scanner;

class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = 0, temp = num;

        if (num == 0) count = 1; // special case

        while (temp != 0) {
            count++;
            temp /= 10;
        }

        System.out.println("Number of digits: " + count);
    }
}


output:
Enter a number: 5089
Number of digits: 4
