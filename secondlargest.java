import java.util.*;
class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        System.out.println("Second largest element: " + arr[n - 2]);
    }
}

output:
Enter size of array:5
Enter 5 elements:
11 23 5 1 67
Second largest Element is :5
