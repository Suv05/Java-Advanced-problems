import java.util.Scanner;
public class Q9_Array {
    public static void main(String[] args) {
        //The method will return the index of the item if the element is present in the array. Otherwise, it will
        //return -1. Write a java program that prompts the user to enter 5 numbers, and the item to search, then
        //invokes this method to display whether the element is present in the array. Here is a sample run of the program:
        //Sample run:
        //Enter ten numbers: 9 5 7 2 6
        //Enter the item to search: 7
        //The element is present in the array at position: 3

        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.print("Enter five numbers: ");

        // Read the input from the user
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.print("Enter the item to search: ");
        int item = input.nextInt();

        // Invoke the method to search for the item in the array
        int position = searchArray(numbers, item);

        // Display the result
        if (position == -1) {
            System.out.println("The element is not present in the array.");
        } else {
            System.out.println("The element is present in the array at position: " + position);
        }
    }

    public static int searchArray(int[] arr, int item) {
        // Iterate over the array to find the item
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                // Return the index of the item if found
                return i;
            }
        }

        // Return -1 if the item is not found
        return -1;
    }
}
