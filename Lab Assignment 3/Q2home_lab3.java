import java.util.*;
public class Q2home_lab3 {
    public static void main(String[] args) {
//Q-Write a java program that prompts the user to enter an integer for today’s day of the
//week (Sunday is 0, Monday is 1... and Saturday is 6). Also prompt the user to enter
//the number of days after today for a future day and display the future day of the week.

//Here is a sample run:
//Enter today's day: 1
//Enter the number of days elapsed since today: 3
//Today is Monday and the future day is Thursday
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter today's day: ");
        int day = sc.nextInt();
        System.out.println("Enter the number of days elapsed since today: ");
        int day2 = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println(" Today is Monday");
        }
    }
}
