/*Write a java program to print M-by-N array in the tabular format. Also, display the sum of
elements of the array.
Sample Run:
Enter number of Row and Columns of 2D-Array: 3 3
Enter elements of 2D-Array: 1 2 3 2 3 4 3 4 5
The elements of 2D array are:
1 2 3
2 3 4
3 4 5
The sum of elements of the 2D-Array is 27*/

import java.util.Scanner;
public class Q_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the dimensions of the array from the user
        System.out.print("Enter the number of rows (M): ");
        int M = sc.nextInt();
        System.out.print("Enter the number of columns (N): ");
        int N = sc.nextInt();

        // Create the array and populate it with user input
        int[][] array = new int[M][N];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("Enter element at position (" + i + ", " + j + "): ");
                array[i][j] = sc.nextInt();
            }
        }

        // Print the array in tabular format
        System.out.println("\nArray in tabular format:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        // Calculate the sum of array elements
        int sum = 0;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                sum += array[i][j];
            }
        }

        System.out.println("\nSum of array elements: " + sum);

        sc.close();
    }
}
