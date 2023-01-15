import java.util.*;
public class Q1_lab3 {
    public static void main(String[] args) {
        //Q-Write a program to input the age of a person and check if the age of the person is
        //greater than or equal to 18 then print the message:
        //“You are eligible to cast your vote”
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int a = sc.nextInt();
        if (a >= 18) {
            System.out.println("You are eligible to cast your vote");
        }
    }
}
