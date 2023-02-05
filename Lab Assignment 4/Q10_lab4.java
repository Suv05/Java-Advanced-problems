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
        for (int i = 1; i <= 5; i++) {
            pow = 3*pow;
            System.out.println(pow);

        }
            System.out.println("The largest power of 3 less than or equal to "+num+" is "+ pow);

    }
}
