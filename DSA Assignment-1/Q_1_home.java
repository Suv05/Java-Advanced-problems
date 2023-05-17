/*Write a Java program that takes as input three integers, a, b, and c, from the Java console
and determines if they can be used in a correct arithmetic formula (in the given order), like
“a + b = c,” “a = b − c,” or “a b = c.”∗*/

import java.util.Scanner;

public class Q_1_home {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three integers (a, b, c):");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a + b == c) {
            System.out.println(a + " + " + b + " = " + c);
        } else if (a == b - c) {
            System.out.println(a + " = " + b + " - " + c);
        } else if (a * b == c) {
            System.out.println(a + " * " + b + " = " + c);
        } else {
            System.out.println("The numbers cannot be used in a correct arithmetic formula.");
        }
    }
}
