import java.util.*;

public class Q4home_lab3 {
    public static void main(String[] args) {
        //Q-Write a java program that prompts the user to enter an integer and determines whether
        //it is divisible by 5 and 6, whether it is divisible by 5 or 6, and whether it is divisible
        //by 5 or 6, but not both.

        //Here is a sample run of this program:
        //Enter an integer: 10
        //Is 10 divisible by 5 and 6? false
        //Is 10 divisible by 5 or 6? true
        //Is 10 divisible by 5 or 6, but not both? True

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = sc.nextInt();

        if (num % 5 == 0 && num % 6 == 0) {
            System.out.println("It is divisible by both 5 & 6");
        } else if (num % 5 == 0) {
            System.out.println("It is only divisible by 5");
        } else if (num % 6 == 0) {
            System.out.println("It is only divisible by 6 ");
        } else {
            System.out.println("It is neither divisible by 5 nor 6");


        }
    }
}
