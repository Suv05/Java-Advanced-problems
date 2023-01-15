import java.util.*;
public class Q5_lab3 {
    public static void main(String[] args) {
        //Q-Write a Java program that takes a year from user and print true if that year is a leap year
        //otherwise print false.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your year");
        int y = sc.nextInt();
        if (y%4==0 && y%100!=0 || y%400==0) {
            System.out.println("It is a leap year");
        }else{
            System.out.println("It is not a leap year");
        }


    }
}
