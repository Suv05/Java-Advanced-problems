import java.util.*;
public class Q7_lab4 {
    public static void main(String[] args) {
       //Q- Write a java program to print the multiplication table of a number entered by the user.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int n=sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d=%d\n ",n,i,n*i);
        }
    }
}
