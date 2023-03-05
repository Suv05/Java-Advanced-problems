import java.util.Arrays;
public class Q8_Array {
    public static void main(String[] args) {
//Write a java program that implements the array reversal algorithm suggested in Note 1.

//Note 1: There is a simpler algorithm for array reversal that starts out with two indices, i=0
//and j=n-1. With each iteration i is increased and j is decreased for i<j.

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Original array: " + Arrays.toString(arr));

        // Reverse the array
        reverseArray(arr);

        System.out.println("Reversed array: " + Arrays.toString(arr));
    }

    public static void reverseArray(int[] arr) {
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            // Swap the elements at i and j
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            // Move i to the next index
            i++;

            // Move j to the previous index
            j--;
        }
    }
}
