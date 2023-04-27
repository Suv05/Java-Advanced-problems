/*Question-1:
Write a Java program that can take a positive integer greater than 2 as input and write out the
number of times one must repeatedly divide this number by 2 before getting a value less
than 2.
Sample Run:
The positive integer greater than 2 from command line argument
is 67.
The number of times one must repeatedly divide this number by 2
before getting a value less than 2 is 5.*/

import java.util.*;

public class Q_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer greater than 2: ");
        int n = sc.nextInt();
        int count = 0;
        while (n > 2) {
            n = n / 2;
            count++;
        }
        System.out.println("Numbers of time it can be divided by 2 is: " + count);

    }
}
