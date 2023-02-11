import java.util.*;
public class Q4_lab4 {
    public static void main(String[] args) {
//Q-Write a program that finds the greatest common divisor (GCD) of two numbers using Euclid's
//algorithm, which is an iterative computation based on the following observation: if y divides
//x, the GCD of x and y is y; otherwise, the GCD of x and y is same as GCD of x % y and y.

//Sample run:
//Enter the first number: 56
//Enter the second number: 98
//GCD of 56 and 98 is 14
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        int gcd;

        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }

        gcd = num1;
        System.out.println("The GCD of " + num1 + " and " + num2 + " is " + gcd);
    }
}
