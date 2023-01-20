import java.util.*;
public class Q2_lab4 {
    public static void main(String[] args) {
        //Q-An integer n is divisible by 9 if the sum of its digits is divisible by 9. Use this concept in your
        //program to determine whether the number is divisible by 9. Test it on the following
        //numbers: Use while loop.
        //n = 123456
        //n = 154368
        //n = 621594

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();
        int sum = 0;
        while (num != 0) {
            sum=sum+num % 10;
            num = num / 10;
        }
        System.out.println("Here is your sum of digits "+sum);
        if (sum % 9 == 0) {
            System.out.println("It is divisible by 9");
        }else {
            System.out.println("It is not divisible by 9 ");
        }

    }
}
