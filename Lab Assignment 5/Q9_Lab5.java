import java.util.Scanner;
public class Q9_Lab5 {
    //Write a program that will read the value of n from the user and calculate sum of the following
    //series: 1/1^2 + 1/2^2 + 1/3^2 + ... + 1/n^2
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / Math.pow(i,2);
        }

        System.out.println("Sum of the series is: " + sum);
    }
}