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
                System.out.println(a + " + " + b + " = " + add(a, b));
                break;
            case 2:
                System.out.println(a + " - " + b + " = " + subtract(a, b));
                break;
            case 3:
                System.out.println(a + " X " + b + " = " + multiply(a, b));
                break;
            case 4:
                System.out.println(a + " % " + b + " = " + remainder(a, b));
                break;
            case 5:
                divide(a, b);
                break;
            case 6:
                sqrt(a);
                break;
            default:
                System.out.println("Invalid choice!");
        }

    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static int remainder(int x, int y) {
        return x % y;
    }

    public static void divide(int x, int y) {
        if (x == 0) {
            System.out.println("Cannot divide by zero!");
        } else {
            System.out.println(x + " / " + y + " = " + (x / y));
        }
    }

    public static void sqrt(int x) {
        if (x < 0) {
            System.out.println("Cannot calculate square root of a negative number!");
        } else {
            System.out.println("sqrt(" + x + ") = " + Math.sqrt(x));
        }
    }
}

