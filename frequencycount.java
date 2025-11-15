import java.util.*;
class FrequencyCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        boolean[] visited = new boolean[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Frequency of each element:");
        for (int i = 0; i < n; i++) {
            if (visited[i] == true)
                continue;
            int count = 1;

            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " → " + count + " time(s)");
        }
    }
}
output:
Enter size of array: 7
Enter elements:
1 2 2 3 3 3 1
Frequency of each element:
1 → 2 time(s)
2 → 2 time(s)
3 → 3 time(s)


