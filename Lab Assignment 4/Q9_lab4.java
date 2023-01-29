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
//        String input = Integer.toString(user);
//        String output = input.replaceAll("0", "");
//        System.out.println("Integer without zeros: "+ output);

        //Method by Loop instruction....🫰💞☄️
        String input = Integer.toString(user);
        String output = "";

        for (int i = 0; i < input.length(); i++) {
            char currentchar = input.charAt(i);
            if (currentchar != '0') {
                output += currentchar;

            }
        }
        System.out.println("Input without zeros: " + output);


             //This is by chat gpt 💞😎❤️‍🔥
//                int input = sc.nextInt();
//                String inputString = Integer.toString(input);
//                String outputString = "";
//
//                for (int i = 0; i < inputString.length(); i++) {
//                    char currentChar = inputString.charAt(i);
//                    if (currentChar != '0') {
//                        outputString += currentChar;
//                    }
//                }
//
//                System.out.println("Input without zeros: " + outputString);



    }
}
