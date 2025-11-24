public class ArmstrongNumber {
    public static void main(String[] args) {
        int number = 153; // You can change this value to test any number
        int original = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += digit * digit * digit; 
            number /= 10;
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong Number");
        } else {
            System.out.println(original + " is NOT an Armstrong Number");
        }
    }
}

output:
153 is an Armstrong Number
