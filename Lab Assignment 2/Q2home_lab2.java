import java.sql.SQLOutput;
import java.util.*;

public class Q2home_lab2 {
    public static void main(String[] args) {
        //Q-Write a java program that asks
        //the user how many eggs she has and then tells the user how many dozen eggs she has and how
        //many extra eggs are left over. A gross of eggs is equal to 144 eggs. Extend your program so
        //that it will tell the user how many gross, how many dozen, and how many leftover eggs she
        //has.

        // For example, if the user says that she has 1342 eggs, and then your program would respond
        //with Your number of eggs is 9 gross, 3 dozen, and 10

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of eggs you have");
        int eggs = sc.nextInt();
        int g = eggs / 144;
        int d = (eggs % 144) / 12;
        int l =eggs%((eggs / 144)+((eggs % 144) / 12));
        System.out.println("Your number of eggs  "+g+" gross,"+d+" dozen,and "+l+ " leftover");

    }
}
