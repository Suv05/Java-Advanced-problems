import java.util.Scanner;
public class Q1_Lab6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();

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
                add(num1, num2);
                break;
            case 2:
                subtract(num1, num2);
                break;
            case 3:
                multiply(num1, num2);
                break;
            case 4:
                remainder(num1, num2);
                break;
            case 5:
                divide(num1, num2);
                break;
            case 6:
                sqrt(num1);
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }

    public static void add(double num1, double num2) {
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }

    public static void subtract(double num1, double num2) {
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
    }

    public static void multiply(double num1, double num2) {
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
    }

    public static void remainder(double num1, double num2) {
        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
    }

    public static void divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Cannot divide by zero!");
        } else {
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        }
    }

    public static void sqrt(double num1) {
        if (num1 < 0) {
            System.out.println("Cannot calculate square root of a negative number!");
        } else {
            System.out.println("sqrt(" + num1 + ") = " + Math.sqrt(num1));
        }
    }
}

