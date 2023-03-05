import java.util.Scanner;
public class Q10_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        int choice = 0;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Create an array of N integers");
            System.out.println("2. Display the array elements");
            System.out.println("3. Insert an element at specific position");
            System.out.println("4. Delete an element at a given position");
            System.out.println("5. Exit");

            System.out.print("\nEnter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    createArray(arr, input);
                    break;
                case 2:
                    displayArray(arr);
                    break;
                case 3:
                    insertElement(arr, input);
                    break;
                case 4:
                    deleteElement(arr, input);
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        } while (choice != 5);
    }

    public static void createArray(int[] arr, Scanner input) {
        System.out.println("\nEnter " + arr.length + " integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
    }

    public static void displayArray(int[] arr) {
        System.out.println("\nArray elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void insertElement(int[] arr, Scanner input) {
        System.out.print("\nEnter the position to insert the element: ");
        int position = input.nextInt();

        if (position < 1 || position > arr.length + 1) {
            System.out.println("Invalid position. Please enter a number between 1 and " + (arr.length + 1) + ".");
            return;
        }

        System.out.print("Enter the element to insert: ");
        int element = input.nextInt();

        // Shift the elements to the right
        for (int i = arr.length - 1; i >= position; i--) {
            arr[i] = arr[i - 1];
        }

        // Insert the element
        arr[position - 1] = element;

        System.out.println("Element " + element + " inserted at position " + position + ".");
    }

    public static void deleteElement(int[] arr, Scanner input) {
        System.out.print("\nEnter the position of the element to delete: ");
        int position = input.nextInt();

        if (position < 1 || position > arr.length) {
            System.out.println("Invalid position. Please enter a number between 1 and " + arr.length + ".");
            return;
        }

        int element = arr[position - 1];

        // Shift the elements to the left
        for (int i = position - 1; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        // Set the last element to 0
        arr[arr.length - 1] = 0;

        System.out.println("Element " + element + " at position " + position + " deleted.");
    }
}
