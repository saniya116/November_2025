public class CountDigits {
    public static void main(String[] args) {
        int num = 98345;
        int count = 0;

        while (num != 0) {
            num = num / 10;
            count++;
        }

        System.out.println("Number of digits: " + count);
    }
}

output:
Number of digits: 5
