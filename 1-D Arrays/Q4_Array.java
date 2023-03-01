import java.util.Scanner;
public class Q4_Array {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];

        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextDouble();
        }

        double min = findMinimum(numbers);
        System.out.printf("The minimum number is: %.1f", min);
    }

    public static double findMinimum(double[] arr) {
        double min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {

                min = arr[i];
            }
        }
        return min;
    }
}
