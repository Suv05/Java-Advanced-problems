import java.util.Scanner;

public class Q1_Lab6 {
    //Question-1:
    //Design a Simple Calculator using methods in java containing the following functionalities,
    //namely, with Addition, Subtraction, Multiplication, Remainder, Division and Square Root. The
    //signature of the methods are given below.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = input.nextInt();

        System.out.print("Enter the second number: ");
        int b = input.nextInt();

        System.out.println("\nChoose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Remainder");
        System.out.println("5. Division");
        System.out.println("6. Square Root");

        System.out.print("\nEnter your choice (1-6): ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println(a + " + " + b + " = " + additionSimple(a, b));
                break;
            case 2:
                System.out.println(a + " - " + b + " = " + subtractionSimple(a, b));
                break;
            case 3:
                System.out.println(a + " X " + b + " = " + multiplicationSimple(a, b));
                break;
            case 4:
                System.out.println(a + " % " + b + " = " + remainderSimple(a, b));
                break;
            case 5:
                System.out.println(a + " / " + b + " = " + divisionSimple(a , b));
                break;
            case 6:
                System.out.println("sqrt(" + a + ") = " +squareRootSimple(a) );
                break;
            default:
                System.out.println("Invalid choice!");
        }

    }

    public static int additionSimple(int x, int y) {
        return x + y;
    }

    public static int subtractionSimple(int x, int y) {
        return x - y;
    }

    public static int multiplicationSimple(int x, int y) {
        return x * y;
    }

    public static int remainderSimple(int x, int y) {
        return x % y;
    }

    public static double divisionSimple(int x, int y) {
        int j = 0;
        if (x == 0) {
            System.out.println("Cannot divide by zero!");
        } else {
            j = x / y;
        }
        return j;
    }

    public static double squareRootSimple(int x) {
        double k = 0;
        if (x < 0) {
            System.out.println("Cannot calculate square root of a negative number!");
        } else {
            k = Math.sqrt(x);
        }
        return k;
    }
}

