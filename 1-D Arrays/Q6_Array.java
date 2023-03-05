import java.util.Scanner;
public class Q6_Array {
    //Write a java program that prompts the user to enter ten numbers, invokes this method to return
    //the second minimum value, and displays the second minimum value. Here is a sample run of the program:
    //Sample run:
    //Enter ten numbers: 1.9 2.5 3.7 2 1.5 6 3 4 5 2
    //The second minimum number is: 1.9
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];
        System.out.print("Enter ten numbers: ");

        // Read the input from the user
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }

        // Invoke the method to get the second minimum value
        double secondMin = getSecondMinimum(numbers);

        // Display the result
        System.out.println("The second minimum number is: " + secondMin);
    }

    public static double getSecondMinimum(double[] numbers) {
        double min1 = Double.MAX_VALUE;
        double min2 = Double.MAX_VALUE;

        // Find the first minimum value
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min1) {
                min1 = numbers[i];
            }
        }

        // Find the second minimum value
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min2 && numbers[i] != min1) {
                min2 = numbers[i];
            }
        }

        return min2;
    }
}

