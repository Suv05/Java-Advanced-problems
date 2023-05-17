/*Write a method to add two matrices. The header of the method is as follows:
public static double[][] addMatrix(double[][] a, double[][] b)
In order to be added, the two matrices must have the same dimensions and the same or
compatible types of elements.
Question-*/
public class Q_4_home {
    public static double[][] addMatrix(double[][] a, double[][] b) {
        // Check if the matrices have the same dimensions
        if (a.length != b.length || a[0].length != b[0].length) {
            throw new IllegalArgumentException("Matrices must have the same dimensions");
        }

        // Create a new matrix to store the result
        double[][] result = new double[a.length][a[0].length];

        // Add corresponding elements from matrices a and b
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }

        // Return the resulting matrix
        return result;
    }

    public static void main(String[] args) {
        // Example matrices
        double[][] matrix1 = {{1.0, 2.0}, {3.0, 4.0}};
        double[][] matrix2 = {{5.0, 6.0}, {7.0, 8.0}};

        // Add the matrices
        double[][] sum = addMatrix(matrix1, matrix2);

        // Print the result
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[0].length; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }

}
