import java.util.*;

public class Q2_lab5 {
    public static void main(String[] args) {
        //Q-WAP to check whether a number is twisted prime or not. Twisted prime is a number if the
        //number and its reverse both are prime then it is called twisted prime.
        //Sample run 1:
        //Enter a number: 97
        //97 is twisted prime.
        //Sample run 2: 43
        //43 is not a twisted prime
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = sc.nextInt();
        //To check if it is a prim or not
        boolean isPrime = true;
        for (int i = 2; i <= x / 2; i++) {
            if (x % i == 0) {
                isPrime = false;
                break;
            }
        }
        //Revers of the number
        int r = 0;
        while (x != 0) {
            int digit = x % 10;
            r = r * 10 + digit;
            x /= 10;
        }
        //Check if it is prime or not
        boolean isPrime2 = true;
        for (int j = 2; j <= r / 2; j++) {
            if (r % j == 0) {
                isPrime2 = false;
                break;
            }
        }
        //To check if both are prime or not
        if (isPrime2 == isPrime) {
            System.out.println("It is twisted prime.");
        }else {
            System.out.println("It is not a twisted Prime");
        }
    }
}
