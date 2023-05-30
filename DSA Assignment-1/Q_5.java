/*Question-5:
Write a java method to calculate the sum of digits of a given number until the number is a
single digit. The method signature is as follows.
public static int sum_Of_Digits(int n)
Example:
Let n = 9294
Sum = 9 + 2 + 9 + 4 = 24
Sum = 2 + 4 = 6
Sample Run:
Enter a number 9294
Sum of digits of 9294 until the number is a single digit is 6*/

import java.util.*;

public class Q_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = sc.nextInt();
        int result = sum_Of_Digits(n);
        System.out.println("Sum of digits of " + n + " until the number is a single digit is " + result);
        // Output: 6

    }

    public static int sum_Of_Digits(int n) {
        if (n < 10) {
            return n; // Base case: return single digit number as it is
        } else {
            int sum = 0;
            while (n != 0) {
                sum += n % 10; // Add the last digit to the sum
                n /= 10; // Remove the last digit
            }
            return sum_Of_Digits(sum); // Recursively call the method with the sum
        }
    }
}
