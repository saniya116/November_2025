public class SumOfDigits {
    public static void main(String[] args) {
        int num = 9875;  // predefined number
        int sum = 0;

        int temp = num;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        System.out.println("Number: " + num);
        System.out.println("Sum of Digits: " + sum);
    }
}

output:

Number: 9875
Sum of Digits: 29
