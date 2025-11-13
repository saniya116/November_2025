import java.util.*;
class CountEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int even = 0, odd = 0;
        for (int num : arr) {
            if (num % 2 == 0)
                even++;
            else
                odd++;
        }
        System.out.println("Even count: " + even);
        System.out.println("Odd count: " + odd);
    }
}

output:
Enter size of array: 6
Enter elements:
1 2 3 4 5 6
Even count: 3
Odd count: 3
