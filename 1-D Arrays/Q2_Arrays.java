import java.util.Random;

public class Q2_Arrays {
    public static void main(String[] args) {
        //Write a java program to create an array of size N and store the random values between 1 and 100 in it and print the number of prime numbers present in the array.

        int N = 10; // Change this value to set the size of the array
        int[] arr = new int[N];
        Random rand = new Random();

        // Generate random values between 1 and 100 and store them in the array
        for (int i = 0; i < N; i++) {
            arr[i] = rand.nextInt(100) + 1;
            System.out.print(arr[i] + " ");
        }

        // Count the number of prime numbers in the array
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (isPrime(arr[i])) {
                count++;
            }
        }

        System.out.println("\nNumber of prime numbers in the array: " + count);
    }

    // Helper method to check if a number is prime or not
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
