import java.util.*;
class FibonacciRec {
    static int fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        System.out.println("Fibonacci Series:");
        for (int i = 0; i < n; i++)
            System.out.print(fib(i) + " ");
    }
}

output:
Enter number of terms:5
Fibonacci series: 0 1 1 2 3
