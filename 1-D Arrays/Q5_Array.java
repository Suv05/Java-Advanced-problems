import java.util.Scanner;
public class Q5_Array {
    //Write a java program that prompts the user to enter 5 numbers, invokes this method to return
    //the maximum value, and displays the maximum value. Here is a sample run of the program:
    //Sample run:
    //Enter five numbers: 9 5 7 2 3
    //The maximum number is: 9
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[5];

        System.out.print("Enter five numbers: ");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextDouble();
        }

        double max = findMaximum(numbers);
        System.out.printf("The maximum number is: %.1f", max);
    }

    public static double findMaximum(double[] arr) {
        double max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
