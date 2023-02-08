import java.util.*;

public class Q3_lab5 {
    public static void main(String[] args) {
        //Question-3:
        //WAP to enter the first number and second number. Display the prime numbers between the
        //first and second number.

        //Sample run:
        //Enter the first number: 4
        //Enter the second number: 15
        //Prime numbers between 4 and 15 are: 5 7 11 13

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int x = sc.nextInt();
        System.out.println("Enter the second number: ");
        int y = sc.nextInt();
        System.out.println("Prime numbers between " + x + " and " + y + " are: ");
        for (int i = x; i <= y; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}




