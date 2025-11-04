import java.util.*;
class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : arr) set.add(num);
        System.out.println("Array after removing duplicates: " + set);
    }
}

output:
Enter array size:7
Enter elements:
10 20 40 10 60 20 50
Array after removing dupilucates:[10, 20,40,50,60]
