import java.util.*;

public class Q9_lab4 {
    public static void main(String[] args) {
        //Q- Write a java program to take an integer input from the user and print the input by removing all
        //zeros.

        //Example: Input = 10200 then Output = 12.
        //Sample run:
        //Enter an integer number: 10203040
        //After removing 0 from number 10203040, the new number is 1234
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int user = sc.nextInt();
        //Method 1 .....🥲🥲🥲👍🫰💞
        String input = Integer.toString(user);
        String output = input.replaceAll("0", "");
        System.out.println("Integer without zeros: "+ output);


//        int input = sc.nextInt();
//        String inputString = Integer.toString(input);
//        String outputString = inputString.replaceAll("0", "");
//        System.out.println("Integer without zeros: " + outputString);


    }
}
