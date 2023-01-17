import java.util.*;

public class Q1home_lab3 {
    public static void main(String[] args) {
        //Q-Write a java program that plays the popular scissor-rock-paper game. (Scissors can cut
        //a paper, a rock can knock scissors, and a paper can wrap a rock.) The program
        //randomly generates a number 0, 1, or 2 representing scissor, rock, and paper. The
        //program prompts the user to enter a number 0, 1, or 2 and displays a message indicating
        //whether the user or the computer wins, loses, or draws.

        //Here are sample runs:
        //scissor (0), rock (1), paper (2): 1
        //The computer is scissored. You are rock. You won
        //scissor (0), rock (1), paper (2): 2
        //The computer is paper. You are paper too. It is a draw
        Scanner sc = new Scanner(System.in);
        System.out.println("scissor (0), rock (1), paper (2) : ");
        int i = sc.nextInt();

//        int scissor = 0;
//        int rock = 1;
//        int paper = 2;


        Random ran = new Random();
        int r = ran.nextInt(0, 3);
        System.out.println("Computer's choice is " + r);

        if (r == i) {
            System.out.println("The match is Draw ");
        } else if ((r == 0 && i == 2) || (r == 1 && i == 2) || (r == 2 && i == 0)) {
            System.out.println("You win the game");
        } else {
            System.out.println("Computer win this game");

        }

    }
}
