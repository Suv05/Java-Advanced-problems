import java.util.*;

public class Q4_lab3 {
    public static void main(String[] args) {
        //Q-Question-4:
        //Make a simple game involving a computer and a user. The computer first guesses a
        //number between 1 and 9 inclusive, then ask the user to enter a number between 1 and
        //9 inclusive. If the user guess is correct then display “You got it right”, if the guess is
        //close (+1, -1) “Almost got it “, Otherwise “You got it wrong”.

        //Enter user number: 2
        //Computer guesses: 3
        //“Almost got it”
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user number");
        int u = sc.nextInt();
        Random rand = new Random();
        int x = rand.nextInt(1, 9);
        System.out.println("Print computers guess : " + x);

        if (u == x) {
            System.out.println("You got it right");
        } else if (x - u == 1 || u - x == 1) {
            System.out.println("YOU almost got it");
        } else {
            System.out.println("You got it wrong");
        }
    }
}
