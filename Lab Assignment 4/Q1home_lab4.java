import java.util.*;

public class Q1home_lab4 {
    public static void main(String[] args) {
        //Q-Write a java program to find the difference between the sum of the squares of the first ten
        //natural numbers and the square of the sum.
        //The sum of the squares of the first ten natural numbers is:
        //1^2 + 2^2 + 3^2 + 4^2 + 5^2 + 6^2 + 7^2 + 8^2 + 9^2 + 10^2 = 385
        //The square of the sum of the first ten natural numbers is:
        //(1 + 2 + ... + 10)^2 = 55^2 = 3025
        //Hence the difference between the sum of the squares of the first
        //ten natural numbers and the square of the sum is 3025 − 385 =
        //2640.
        int square = 0;
        for (int i = 1; i <= 10; i++) {
            square= square+(i*i);

        }
        System.out.println("The sum of the squares of the first ten natural numbers is: "+square);
        int sum=0;
        int sq2=0;
        for (int x = 0; x <= 10; x++) {
            sum=sum+x;
            sq2=sum*sum;
        }
        System.out.println("The square of the sum of the first ten natural numbers is: "+ sq2);

        System.out.println("Hence the difference between the sum of the squares of the first \n ten natural numbers and the square of the sum is "+(square-sq2));
    }
}
