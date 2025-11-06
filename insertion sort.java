Insertion Sort – Theory
 Definition:
Insertion Sort is a simple and efficient algorithm used for sorting small datasets.
It builds the sorted array one element at a time, by inserting each element into its correct position among the previously sorted elements.
Working Principle:
Think of it like arranging playing cards in your hand.
You take one card at a time and place it in the correct order among the already sorted cards.
The array is divided into two parts:
Sorted part
Unsorted part
Each iteration takes one element from the unsorted part and inserts it into the correct position in the sorted part.
Steps (Example):
Let’s take an example array:
[9, 4, 7, 2, 5]
1️⃣ First element 9 is already sorted (initially).
2️⃣ Take 4 → insert it before 9 → [4, 9, 7, 2, 5]
3️⃣ Take 7 → insert it between 4 and 9 → [4, 7, 9, 2, 5]
4️⃣ Take 2 → insert at beginning → [2, 4, 7, 9, 5]
5️⃣ Take 5 → insert between 4 and 7 → [2, 4, 5, 7, 9]
Final Sorted Array: [2, 4, 5, 7, 9]
Algorithm:
1. Start from the second element (index 1).
2. Compare it with the previous elements.
3. Shift all larger elements one position ahead.
4. Insert the current element in its correct place.
5. Repeat until the entire array is sorted.
Time Complexity:
Case	Time Complexity
Best Case (Already sorted array)	O(n)
Average Case	O(n²)
Worst Case (Reverse sorted)	O(n²)
Space Complexity:
O(1) — because it sorts the array in place (no extra array used).
Advantages:
Simple and easy to implement
Efficient for small datasets
Works well for partially sorted arrays
Disadvantages:
Slow for large datasets (because of O(n²) time)
Real-life Analogy:
It’s like arranging playing cards in your hand —
you pick one card at a time and insert it in the correct position.
