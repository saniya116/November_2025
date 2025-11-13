import java.util.Scanner;
class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows of first matrix: ");
        int r1 = sc.nextInt();
        System.out.print("Enter number of columns of first matrix: ");
        int c1 = sc.nextInt();
        System.out.print("Enter number of rows of second matrix: ");
        int r2 = sc.nextInt();
        System.out.print("Enter number of columns of second matrix: ");
        int c2 = sc.nextInt();
        if (c1 != r2) {
            System.out.println("Matrix multiplication not possible!");
            return;
        }
        int[][] a = new int[r1][c1];
        int[][] b = new int[r2][c2];
        int[][] result = new int[r1][c2];
        System.out.println("\nEnter elements of first matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nEnter elements of second matrix:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        System.out.println("\nResultant Matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}

output:
Enter number of rows of first matrix: 2
Enter number of columns of first matrix: 2
Enter number of rows of second matrix: 2
Enter number of columns of second matrix: 2
Enter elements of first matrix:
1 2
3 4
Enter elements of second matrix:
5 6
7 8
Resultant Matrix:
19 22
43 50
