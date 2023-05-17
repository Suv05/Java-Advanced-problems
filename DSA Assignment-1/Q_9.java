/*Write a method that sums all the numbers in the major diagonal in an n * n matrix of double
values using the following header:
public static double sumMajorDiagonal(double[][] m)
Write a java program that reads a 4-by-4 matrix and displays the sum of all its elements on the
major diagonal.*/
import java.util.Scanner;
public class Q_9 {
    public static double sumMajorDiagonal(double[][] m) {
        double sum = 0.0;
        int n = m.length;

        for (int i = 0; i < n; i++) {
            sum += m[i][i];
        }

        return sum;
    }

    public static void main(String[] args) {
        double[][] matrix = new double[4][4];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a 4-by-4 matrix row by row:");

        // Read the matrix elements from the user
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = sc.nextDouble();
            }
        }

        // Calculate and display the sum of the major diagonal
        double sum = sumMajorDiagonal(matrix);
        System.out.println("The sum of the major diagonal is: " + sum);
    }
}


