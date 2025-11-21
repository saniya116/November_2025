public class CountEvenOdd {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 11, 14, 17};  
        int even = 0, odd = 0;
        for (int num : arr) {
            if (num % 2 == 0)
                even++;
            else
                odd++;
        }
        System.out.println("Array Elements:");
        for (int x : arr) System.out.print(x + " ");
        System.out.println("\nEven Count: " + even);
        System.out.println("Odd Count: " + odd);
    }
}

output:

Array Elements:
2 5 8 11 14 17 
Even Count: 3
Odd Count: 3
