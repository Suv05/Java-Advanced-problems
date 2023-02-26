import java.util.*;
public class Q1_lab4 {
    public static void main(String[] args) {
//Q-Write a java program that gets three integer numbers from the user. Count from the first number
//to the second number increments by the third number. Use for loop to do it. Also, display the
//sum of numbers displayed between the first number and second number.

//Sample run:
//Enter first number: 4
//Enter second number: 13
//Enter third number: 3
//4 7 10 13
//The sum of number displayed is 34

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your 1st number");
        int x = sc.nextInt();
        System.out.println("Enter your 2nd number");
        int y = sc.nextInt();
        System.out.println("Enter your 3rd number");
        int z = sc.nextInt();
//        int i=0;
//        int sum = 0;
//        for (i= x; x <= y; x = z + x) {
//            System.out.println(x);
//            sum=sum+x;
//        }
//            System.out.println("The sum of number displayed is "+sum);

        int sum = 0;

        for (int i = x; i <= y; i =i+z) {
            System.out.print(i + " ");
            sum += i;
        }

        System.out.println("\nSum of numbers displayed: " + sum);

    }
}
