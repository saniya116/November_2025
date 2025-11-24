public class LargestInArray {
    public static void main(String[] args) {
        int[] arr = {10, 25, 3, 99, 67};

        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("Largest element in the array: " + largest);
    }
}

output:
Largest element in the array: 99
