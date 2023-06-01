/*Write a method that returns the sum of all the elements in a specified column in a matrix
using the following header:
public static double sumColumn(double[][] m, int columnIndex)
Write a java program that reads a 3-by-4 matrix and displays the sum of each column.*/

import java.util.Scanner;

public class Q_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] matrix = new double[3][4];

        System.out.println("Enter the elements of the matrix:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = sc.nextDouble();
            }
        }
        displayColumnSums(matrix);
    }

    public static void displayColumnSums(double[][] matrix) {
        int columns = matrix[0].length;

        for (int j = 0; j < columns; j++) {
            double sum = sumColumn(matrix, j);
            System.out.println("Sum of column " + j + ": " + sum);
        }
    }

    public static double sumColumn(double[][] matrix, int columnIndex) {
        double sum = 0;

        for (double[] elements : matrix) {
            sum += elements[columnIndex];
        }

        return sum;
    }
}
