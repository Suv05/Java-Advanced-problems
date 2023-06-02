import java.util.Scanner;

public class Q_4 {
    public static <E> void printArray(E[] inputArray) {
        for (E element : inputArray) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array elements:");

        Integer[] intArray = new Integer[5];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = sc.nextInt();
        }

        System.out.println("Integer Array contains:");
        printArray(intArray);

        System.out.println("Enter array elements:");

        Double[] doubleArray = new Double[5];
        for (int i = 0; i < doubleArray.length; i++) {
            doubleArray[i] = sc.nextDouble();
        }

        System.out.println("Double Array contains:");
        printArray(doubleArray);

    }
}

