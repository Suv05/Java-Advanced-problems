import java.util.*;

public class Q10_lab4 {
    public static void main(String[] args) {
        //Q- Write a java program to print largest power of three less than or equal to N.

        //Sample run:
        //Enter a number: 100
        //The largest power of 3 less than or equal to 100 is 81
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int pow = 1;

        while (pow <= num / 3) {
           // System.out.println("post"+pow);  For check 😅
            pow *= 3;
           // System.out.println("pre"+pow);   for check 😅

        }

        System.out.println("The largest power of 3 less than or equal to " + num + " is " + pow);
    }
}
