import java.util.*;
public class Q1_Arrays {
    public static void main(String[] args){
   // Write a java program to create an array of size N and store the random values between 1 to N in it and find the sum and average.

        int N = 10; // Change N to desired array size
        int[] arr = new int[N];
        Random rand = new Random();

        // Fill array with random values between 1 and N
        for (int i = 0; i < N; i++) {
            arr[i] = rand.nextInt(N) + 1;
        }

        // Calculate sum of values in array
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += arr[i];
        }

        // Calculate average of values in array
        double average = (double) sum / N;

        // Print array, sum, and average
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
//In this program, we first define the size of the array N and create an empty array of that size using int[] arr = new int[N];. We then use the Random class from the java.util package to generate random values between 1 and N using rand.nextInt(N) + 1 and store them in the array using a for loop.

