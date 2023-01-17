import java.util.Scanner;
public class Q9_lab3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        System.out.print("Enter third number: ");
        int c = scanner.nextInt();

        if (a > b && a > c) {
            System.out.println("Largest number: " + a);
            if (b > c) {
                System.out.println(" 2nd Largest number: " + b);
            }else {
                System.out.println(" 2nd Largest number: " + c);
            }
        } else if (b > a && b > c) {
            System.out.println("Largest number: " + b);
            if (a > c) {
                System.out.println(" 2nd Largest number: " + a);
            }else {
                System.out.println(" 2nd Largest number: " + c);
            }
        } else if (c > a && c > b) {
            System.out.println("Largest number: " + c);
            if (b > a) {
                System.out.println(" 2nd Largest number: " + b);
            }else {
                System.out.println(" 2nd Largest number: " + a);
            }
        }



    }
}
