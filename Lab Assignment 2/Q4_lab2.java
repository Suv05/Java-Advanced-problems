import java.util.*;
public class Q4_lab2 {
    public static void main(String[] args) {
        //Q- Write a java program that reads an integer between 0 and 1000 and adds all the digits in the
        //integer. For example, if an integer is 749, the sum of all its digits is 20.

        //Hint: Use the % operator to extract digits, and use the /
        //operator to remove the extracted digit.
        //For instance, 749 % 10 = 9 and 749 / 10 = 74.

        //Here is a sample run:
        //Enter a number between 0 and 1000: 999 The sum of the
        //digits is 27

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your digits between 0-1000");
        int num = sc.nextInt();
        //Method-1
       /* int fd= num%10;
        num=num/10;
        int md= num%10;
        num=num/10;
        int ld= num%10;
        num=num/10;
       int sum= fd+md+ld;
        System.out.println(sum);*/

        //Method-2
        int sum = 0;
        while (num!=0){
            sum= sum+num%10;
            num=num/10;
        }
        System.out.println(sum);


    }
}
