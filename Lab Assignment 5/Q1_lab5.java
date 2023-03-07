import java.util.*;

public class Q1_lab5 {
    public static void main(String[] args) {
//Question-1:
//Amicable numbers are a pair of numbers each of whose divisors are added to give the other number.
//Example: The smallest pair of amicable numbers is (220, 284).They are amicable because the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and110, of which the sum is 284; and the proper divisors of 284 are 1, 2, 4, 71 and 142, of which the sum is 220.

//Sample run 1:
//Enter first number: 220
//Enter second number: 284
//220 and 284 are amicable numbers.
//Sample run 2:
//Enter first number: 220
//Enter second number: 230
//220 and 230 are not amicable numbers

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int x = sc.nextInt();
        System.out.println("Enter second number: ");
        int y = sc.nextInt();
        int sum1 = 0,sum2 = 0;
        for (int i = 1; i < x; i++) {
            if (x % i == 0) {
                sum1 = sum1 + i;
            }
        }
        for (int j = 1; j < y; j++) {
            if (y % j == 0) {
                sum2 = sum2 + j;
            }
        }
        if (sum1 == y && sum2 == x) {
            System.out.println(x + " and " + y + " are amicable numbers.");
        } else {
            System.out.println(x + " and " + y + " are not amicable numbers.");
        }

    }
}
