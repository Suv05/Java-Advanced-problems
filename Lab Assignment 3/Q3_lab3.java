import java.util.*;

public class Q3_lab3 {
    public static void main(String[] args) {
        //Q-Input first number: 241
        //Input second number:345
        //Input third number: 4563
        //“Increasing"
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd number");
        int b = sc.nextInt();
        System.out.println("Enter the 3rd number");
        int c = sc.nextInt();
        if (a > b && b > c) {
            System.out.println("DECREASING");
        } else if (a < b && b < c) {
            System.out.println("INCREASING");
        }else {
            System.out.println("Neither Decreasing or increasing");
        }


    }
}
