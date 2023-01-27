import java.util.*;
public class Q6_lab4 {
    public static void main(String[] args) {
//Write a java program to enter two numbers through the keyboard. Write a program to find the
//value of one number raised to the power of another. (Do not use Java built-in method).

//Sample run:
//Enter the base: 5
//Enter the power: 4
//5 to the power 4 is: 625
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base: ");
        int b = sc.nextInt();
        System.out.println("Enter the power: ");
        int p = sc.nextInt();
//        int i = 0;
//        while (i < p) {
//            i++;
//            b=b*b;
//            System.out.println("TO THE POWER "+ b);
//        }
                int result = 1;
                for (int i = 0; i < p; i++) {
                    result *= b;


                }
                System.out.println(b + " raised to the power of " +p + " is " + result);
            }
        }
