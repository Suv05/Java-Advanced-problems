import java.util.*;

public class Q7_lab3 {
    public static void main(String[] args) {
        //Q-From the above question no. (6) write a java program with a choice if the consumer
        //wants to pay bill online. Consumer who pays their electricity bill online will get a
        //discount of 3%.

        //Here is the sample output:
        //No. of units consumed: 867
        //Do you want to pay online(y/n): y
        //Total amount: 4925.4
        //Discount: 147.762
        //Amount payable: 4777.638
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your unit consumed ");
        int unit = sc.nextInt();
        System.out.println("DO u want to pay bill online?(Y/N)");
        char choice = sc.next().charAt(0);
        if (choice == 'Y' || choice == 'y') {
            System.out.println("Here is your bill");
            double t1, t2, t3, t4;
            t1 = unit * 3;
            t2 = 50 * 3 + (unit - 50) * 4.80;
            t3 = (200 * 4.80) + (unit - 200) * 5.80;
            t4 = (400 * 5.80) + (unit - 400) * 6.20;

            double pay1, pay2, pay3, pay4;
            pay1 = t1 - (t1 * 3) / 100;
            pay2 = t2 - (t2 * 3) / 100;
            pay3 = t3 - (t3 * 3) / 100;
            pay4 = t4 - (t4 * 3) / 100;

            if (unit < 50) {
                System.out.println("Your bill amount " + t1);
                System.out.println("Your discount is " + (t1 * 3) / 100);
                System.out.println("Amount payable is: " + pay1);
            } else if (unit > 50 && unit <= 200) {
                System.out.println("Your bill amount " + t2);
                System.out.println("Your discount is " + (t2 * 3) / 100);
                System.out.println("Amount payable is: " + pay2);
            } else if (unit > 200 && unit <= 400) {
                System.out.println("Your bill amount " + t3);
                System.out.println("Your discount is " + (t3 * 3) / 100);
                System.out.println("Amount payable is: " + pay3);
            } else {
                System.out.println("Your bill amount " + t4);
                System.out.println("Your discount is " + (t4 * 3) / 100);
                System.out.println("Amount payable is: " + pay4);
            }
        } else {
            System.out.println("Pay bill in offline then");
        }

    }
}

