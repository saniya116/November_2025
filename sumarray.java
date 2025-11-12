import java.util.*;
class SumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += arr[i];
        System.out.println("Sum of all elements: " + sum);
    }
}

output:
Enter size of array: 5
Enter elements:
1 2 3 4 5
Sum of all elements: 15
