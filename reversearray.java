import java.util.*;
class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println("Reversed array:");
        for (int i = n - 1; i >= 0; i--)
            System.out.print(arr[i] + " ");
    }
}

output:
Enter size of array: 4
Enter elements:
1 2 3 4
Reversed array:
4 3 2 1
