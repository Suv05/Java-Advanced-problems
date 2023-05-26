/*Question-3:
Write a java program to check whether a number is a spy number or not.
Example:
N = 132
Sum of digit of N = 1 + 3 + 2 = 6
Product of digit of N = 1 × 3 × 2 = 6
So, 132 is a spy number.*/

import java.util.*;
public class Q_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int x = sc.nextInt();
        int sum = 0;
        int prod = 1;
        while (x != 0) {
            int y = x % 10;
            sum += y;
            prod *= y;
            x = x / 10;
        }
        if (sum == prod) {
            System.out.println("It is a spy number");
        } else {
            System.out.println("It is not a spy number");
        }
    }
}
