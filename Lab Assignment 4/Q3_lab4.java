import java.util.*;

public class Q3_lab4 {
    public static void main(String[] args) {
//Q-Write a java program that takes an integer N from user, uses
//Math. Random () to print N random integer numbers between 1 to N, and then prints their
//average value. Use do while loop.

//Sample run:
//Enter a number: 6
//Random numbers generated are: 6 4 5 2 2 5
//Average of 6 random numbers are 4

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number N: ");
        int n = sc.nextInt();
        int sum = 0;
//        Random rand = new Random();
//        int num = rand.nextInt();
        int ran;
        int count = 0;
        do {
            ran = (int) (1+(Math.random() * n));
            System.out.println(ran+" ");
            sum = sum + ran;
            count++;

        } while (count < n);
        int avg_sum =  (sum / n);
        System.out.println("here is avg " + avg_sum);

    }
}



