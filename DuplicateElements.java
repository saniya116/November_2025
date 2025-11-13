import java.util.*;
class DuplicateElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println("Duplicate elements:");
        boolean found = false;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    found = true;
                    break;
                }
            }
        }
        if (!found)
            System.out.println("No duplicates found.");
    }
}

output:
Enter size of array: 6
Enter elements:
2 4 3 2 1 3
Duplicate elements:
2
3
