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
        double pay1,pay2,pay3,pay4;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your unit consumed ");
        int unit = sc.nextInt();
        System.out.println("DO u want to pay bill online?(Y/N)");
        char choice = sc.next().charAt(0);
        if (choice == 'Y' || choice == 'y') {
            System.out.println("Here is your bill");
        }else {
            System.out.println("Pay bill in offline then");
        }
        if (unit <= 50) {
            System.out.println("Your bill amount " + unit * 3);
            pay1=unit * 3;
            double discount1 = (unit * 3)*3/100;
            System.out.println("Your discount " + discount1);
            System.out.println("Your amount payable " + (double) (pay1 - discount1));
        } else if (unit > 50 && unit <= 200) {
            System.out.println("Your bill amount " + (50 * 3 + (unit - 50) * 4.80));
            pay2 = (50 * 3 + (unit - 50) * 4.80);
            double discount2 = (50 * 3 + (unit - 50) * 4.80) * 3 / 100;
            System.out.println("Your discount " + discount2);
            System.out.println("Your amount payable " + (double) (pay2 - discount2));
        } else if (unit > 200 && unit <= 400) {
            System.out.println("Your bill amount " + (200 * 4.80) + (unit - 200) * 5.80);
        pay3=(200 * 4.80) + (unit - 200) * 5.80;
        double discount3 = ((200 * 4.80) + (unit - 200) * 5.80) * 3 / 100;
        System.out.println("Your discount " + discount3);
        System.out.println("Your amount payable " + (double) (pay3 - discount3));

        } else {
            System.out.println("Your bill amount "+ (400*5.80)+ (unit-400)*6.20);
        pay4= ((400*5.80)+ (unit-400)*6.20);
        double discount4 = ((400*5.80)+ (unit-400)*6.20)*3/100;
        System.out.println("Your discount " + discount4);
        System.out.println("Your amount payable " + (double) (pay4 - discount4));
        }

    }
}
