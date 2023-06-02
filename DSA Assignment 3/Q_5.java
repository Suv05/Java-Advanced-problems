import java.util.Scanner;

public class Q_5 {
    public static <T> int count(T[] array, T item) {
        int count = 0;
        for (T element : array) {
            if (element.equals(item)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array elements:");

        Integer[] intArray = new Integer[5];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = scanner.nextInt();
        }

        System.out.println("Enter the element to search:");
        Integer searchItem = scanner.nextInt();

        int occurrence = count(intArray, searchItem);
        System.out.println("Number of times " + searchItem + " is present in the array is " + occurrence);

        scanner.close();
    }
}

