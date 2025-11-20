public class LargestOfThree {
    public static void main(String[] args) {
        int a = 10, b = 40, c = 25;

        if (a >= b && a >= c) {
            System.out.println(a + " is the largest number.");
        } else if (b >= a && b >= c) {
            System.out.println(b + " is the largest number.");
        } else {
            System.out.println(c + " is the largest number.");
        }
    }
}

output:
40 is the largest number.
