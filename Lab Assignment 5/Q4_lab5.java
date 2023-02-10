import java.util.*;

public class Q4_lab5 {
    public static void main(String[] args) {
//Question-4:
//WAP to calculate and display the factorial of all numbers between m and n (where m < n, m
//> 0, n > 0)

//Sample run:
//Enter the value of m: 2
//Enter the value of n: 5
//Factorial of 2 is: 2
//Factorial of 3 is: 6
//Factorial of 4 is: 24
//Factorial of 5 is: 120
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of m: ");
        int m = sc.nextInt();
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        int fact = 1;
        for (int i = m; i <= n; i++) {
            for (int j = i; j > 0; j--) {
                System.out.println(j);
                fact = fact * j;
                break;
            }

            System.out.println("Factorial of " + i + " is: " + fact);

        }
    }
}
