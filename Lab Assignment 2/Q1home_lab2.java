import java.util.*;
public class Q1home_lab2 {
    public static void main(String[] args) {
        //Q-Write a java program that prompts the user to enter the minutes (e.g., 1 billion), and displays
        //the number of years and days for the minutes.

        //Here is a sample run:
        //Enter the number of minutes: 1000000000
        //1000000000 minutes is approximately 1902 years and 214 days.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your minutes");
        double min = sc.nextDouble();

        // 1hour=60Min
        // 1day = 1440 min
        // 1 year= 525600min

        int y= (int) (min/525600);
        int d = (int) ((min%525600)/1440);
        System.out.println(min+" minutes is approximately "+y+ " years and "+d+" days");

    }
}
