/*Write a java program to find the maximum and minimum and how many times they both occur
in an array of n elements. Find out the positions where the maximum first occurs and the
minimum last occurs.*/

import java.util.*;

public class Q_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int max = arr[0];
        int min = arr[0];
        int maxOccurrences = 0;
        int minOccurrences = 0;
        int maxFirstPos = -1;
        int minLastPos = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxOccurrences = 1;
                maxFirstPos = i + 1;
            } else if (arr[i] == max) {
                maxOccurrences++;
            }

            if (arr[i] < min) {
                min = arr[i];
                minOccurrences = 1;
                minLastPos = i + 1;
            } else if (arr[i] == min) {
                minOccurrences++;
                minLastPos = i + 1;
            }
        }


        System.out.println("Maximum element of the array is " + max + " and occurs " + maxOccurrences + " times.");
        System.out.println("Minimum element of the array is " + min + " and occurs " + minOccurrences + " times.");
        System.out.println("First occurrence of the maximum element is at position " + maxFirstPos + ".");
        System.out.println("Last occurrence of the minimum element is at position " + minLastPos + ".");
    }
}
