/*Write a java program that randomly fills in 0s and 1s into a 4-by-4 matrix, prints the matrix,
and finds the first row and column with the most 1s.*/
import java.util.Random;
public class Q_5_home {
        public static void main(String[] args) {
            int[][] matrix = generateMatrix(4, 4);
            printMatrix(matrix);

            int maxOnesRowIndex = findRowWithMaxOnes(matrix);
            int maxOnesColumnIndex = findColumnWithMaxOnes(matrix);

            System.out.println("Row with the most 1s: " + maxOnesRowIndex);
            System.out.println("Column with the most 1s: " + maxOnesColumnIndex);
        }

        public static int[][] generateMatrix(int rows, int columns) {
            int[][] matrix = new int[rows][columns];
            Random random = new Random();

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    matrix[i][j] = random.nextInt(2);  // Generates either 0 or 1
                }
            }

            return matrix;
        }

        public static void printMatrix(int[][] matrix) {
            for (int[] row : matrix) {
                for (int num : row) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }

        public static int findRowWithMaxOnes(int[][] matrix) {
            int maxOnesRowIndex = 0;
            int maxOnesCount = 0;

            for (int i = 0; i < matrix.length; i++) {
                int onesCount = 0;

                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] == 1) {
                        onesCount++;
                    }
                }

                if (onesCount > maxOnesCount) {
                    maxOnesCount = onesCount;
                    maxOnesRowIndex = i;
                }
            }

            return maxOnesRowIndex;
        }

        public static int findColumnWithMaxOnes(int[][] matrix) {
            int maxOnesColumnIndex = 0;
            int maxOnesCount = 0;

            for (int j = 0; j < matrix[0].length; j++) {
                int onesCount = 0;

                for (int i = 0; i < matrix.length; i++) {
                    if (matrix[i][j] == 1) {
                        onesCount++;
                    }
                }

                if (onesCount > maxOnesCount) {
                    maxOnesCount = onesCount;
                    maxOnesColumnIndex = j;
                }
            }

            return maxOnesColumnIndex;
        }
    }
