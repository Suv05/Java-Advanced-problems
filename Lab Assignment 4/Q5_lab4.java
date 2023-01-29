import java.util.Scanner;

public class Q5_lab4 {
    public static void main(String[] args) {
        //Q-Write a Java program to check if a number is perfect number or not.
        //(Hints: A number N is called perfect number, if the sum of factors except N as a factor is
        //equals to the number N.

        //Example:
        //N = 28 is a perfect number than (1 + 2 + 4 + 7 + 14 = 28.)

        //Sample run1:
        //Enter a number: 496
        //496 is a perfect number.

        //Sample run2:
        //Enter a number: 490
        //490 is not a perfect number.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int user = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < user; i++) {
            if (user % i == 0) {
                sum += i;

            }
        }
        if (sum == user) {
            System.out.println("It is a perfect number ");

        }else {
            System.out.println("It is not a perfect number ");
        }
    }
}
