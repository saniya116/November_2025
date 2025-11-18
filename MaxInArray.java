public class MaxInArray {
    public static void main(String[] args) {
        int[] arr = {12, 5, 9, 25, 17};
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Maximum element in array: " + max);
    }
}
Output: 
Maximum element in array: 25
