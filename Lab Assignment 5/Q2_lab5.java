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
        int r = 0;
        while (x != 0) {
            int digit = x % 10;
            r = r * 10 + digit;
            x/=10;
        }

    }
}
