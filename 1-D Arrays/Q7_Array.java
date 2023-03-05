import java.util.Scanner;
public class Q7_Array {
    //Write a java program that prompts the user to enter 5 numbers, invokes this method to return
    //the maximum value, and displays the maximum value. Here is a sample run of the program:

    //Sample run:
    //Enter ten numbers: 9 5 7 2 3
    //The second maximum number is: 7
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[5];
        System.out.print("Enter five numbers: ");

        // Read the input from the user
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }

        // Invoke the method to get the maximum value
        double max = getMaxValue(numbers);

        // Display the result
        System.out.println("The maximum number is: " + max);
    }

    public static double getMaxValue(double[] numbers) {
        double max = Double.MIN_VALUE;

        // Find the maximum value
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        return max;
    }
}
