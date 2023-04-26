import java.util.*;

public class Q2home_lab3 {
    public static void main(String[] args) {
//Q-Write a java program that prompts the user to enter an integer for today’s day of the
//week (Sunday is 0, Monday is 1... and Saturday is 6). Also prompt the user to enter
//the number of days after today for a future day and display the future day of the week.

//Here is a sample run:
//Enter today's day: 1
//Enter the number of days elapsed since today: 3
//And today  is Monday and the future day is Thursday
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter today's day: ");
        int day = sc.nextInt();
        System.out.println("Enter the number of days elapsed since today: ");
        int day2 = sc.nextInt();
        if(day==1){
            System.out.print("It is monday");
        } else if (day == 2) {
            System.out.print("It is Tuesday");
        } else if (day == 3) {
            System.out.print("It is Wednesday");
        } else if (day == 4) {
            System.out.print("It is Thursday");
        } else if (day == 5) {
            System.out.print("It is Friday");
        } else if (day == 6) {
            System.out.print("It is Saturday");
        } else if (day == 7) {
            System.out.print("It is Sunday");
        }
        switch (day2 % 7) {
            case 1 -> System.out.print(" And the future day  is Monday");
            case 2 -> System.out.print(" And the future day  is Tuesday");
            case 3 -> System.out.print(" And the future day  is Wednesday");
            case 4 -> System.out.print(" And the future day  is Thursday");
            case 5 -> System.out.print(" And the future day  is Friday");
            case 6 -> System.out.print(" And the future day  is Saturday");
        }

    }
}
