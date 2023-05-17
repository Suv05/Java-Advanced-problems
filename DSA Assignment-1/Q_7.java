/*Write a java program to find the maximum and minimum and how many times they both occur
in an array of n elements. Find out the positions where the maximum first occurs and the
minimum last occurs.*/
import java.util.Arrays;
public class Q_7 {
    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 5, 3, 2, 1, 5, 4, 5};

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int maxOccurrences = 0;
        int minOccurrences = 0;
        int maxFirstPos = -1;
        int minLastPos = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxOccurrences = 1;
                maxFirstPos = i;
            } else if (arr[i] == max) {
                maxOccurrences++;
            }

            if (arr[i] < min) {
                min = arr[i];
                minOccurrences = 1;
                minLastPos = i;
            } else if (arr[i] == min) {
                minOccurrences++;
                minLastPos = i;
            }
        }

        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum occurrences: " + maxOccurrences);
        System.out.println("Minimum occurrences: " + minOccurrences);
        System.out.println("Position of the first occurrence of maximum: " + maxFirstPos);
        System.out.println("Position of the last occurrence of minimum: " + minLastPos);
    }
}
