import java.util.*;

public class Q8_lab4 {
    public static void main(String[] args) {
        //Q-Write a program that generates a random integer number between 1 and 10 and asks the user to
        //guess what the number is. If the user's guess is higher than the random number, the program
        //should display "Too high, try again." If the user's guess is lower than the random number, the
        //program should display "Too low, try again." The program should use a loop that repeats until
        //the user correctly guesses the random number and display good guess.

        // Sample run:
        //Computer guess: 7
        //User guess: 5
        //Too low, try again
        //Computer guess: 5
        //User guess: 7
        //Too high, try again
        //Computer guess: 5
        //User guess: 5
        //Good guess
        Scanner sc = new Scanner(System.in);
        int user = 0;
        Random rand = new Random();
        int comp = rand.nextInt(1, 10);
//        System.out.println("Computer guess : " + comp);
        while (user != comp) {
            System.out.println("User guess a number between 1 to 10 :");
            user = sc.nextInt();
            if (comp > user) {
                System.out.println("You guess too low");
            } else if (comp < user) {
                System.out.println("You guess too high");
            } else {
                System.out.println("You guess right");
            }

        }
    }
}
