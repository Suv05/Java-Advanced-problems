import java.util.*;

public class Q4home_lab4 {
    public static void main(String[] args) {
        //Q-Write a java program to print the sum of all even numbers and the product of all odd numbers
        //from 1 to N. Where, N is the input to the program.
        //For input, N = 10
        //Sum of all even numbers = 2 + 4 + 6 + 8 + 10 = 30
        //Product of all odd numbers = 1 * 3 * 5 * 7 * 9 = 945

        Scanner sc = new Scanner(System.in);
        System.out.println("Take the input from user: ");
        int n = sc.nextInt();
        int sum=0;
        int product=1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                sum=sum+i;
            } else  {
                product=product*i;
            }
        }
        System.out.println("Sum of all even numbers = "+sum);
        System.out.println("Product of all odd numbers = "+product);
    }
}
