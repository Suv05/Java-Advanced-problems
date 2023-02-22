import java.util.*;

public class Q6_lab3 {
    public static void main(String[] args) {
        //Q-Write a java program to calculate the monthly electricity bill. The tariff is given as
        //follows:
        //Price per    Unit range
        //Rs. 3/-     First 50 units
        //Rs. 4.80/-  50-200 units
        //Rs. 5.80/-  200-400 units
        //Rs. 6.20/-  Above 400 units

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your unit consumed ");
        int unit = sc.nextInt();
        double t1, t2, t3, t4;
        t1 = unit * 3;
        t2 = 50 * 3 + (unit - 50) * 4.80;
        t3 = (200 * 4.80) + (unit - 200) * 5.80;
        t4 = (400 * 5.80) + (unit - 400) * 6.20;
        if (unit < 50) {
            System.out.println("Your bill amount " + t1);
        } else if (unit > 50 && unit <= 200) {
            System.out.println("Your bill amount " + t2);
        } else if (unit > 200 && unit <= 400) {
            System.out.println("Your bill amount " + t3);
        } else {
            System.out.println("Your bill amount " + t4);
        }

    }
}
