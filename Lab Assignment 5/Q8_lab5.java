import java.util.Scanner;

public class Q8_lab5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int tempSum = 0;
            for (int j = 1; j <= i; j++) {
                tempSum += j;
            }
            sum += tempSum;
        }

        System.out.println("Sum of the series is: " + sum);
    }
}