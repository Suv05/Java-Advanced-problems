import java.util.*;

public class Q5home_lab3 {
    public static void main(String[] args) {
        //Q-What is your gender (M or F): F
        //First name: Gita
        //Last name: Pattanayak
        //Age: 32
        //Are you married, Gita (y or n)? y
        //Then I shall call you Mrs. Gita Pattanayak.
        //What is your gender (M or F): F
        //First name: Anjali
        //Last name: Mishra
        //Age: 48
        //Are you married, Anjali (y or n)? n
        //Then I shall call you Ms. Anjali.
        //What is your gender (M or F): M
        //First name: Ashok
        //Last name: Mohanty

        Scanner sc = new Scanner(System.in);
        System.out.println("What is your gender (M or F): ");
        char sex = sc.next().charAt(0);
        System.out.println("First name: ");
        String fname = sc.next();
        System.out.println("Last name: ");
        String lname = sc.next();
        System.out.println("Age: ");
        int age = sc.nextInt();

        if (age > 20) {
            if (sex == 'F' || sex == 'f') {
                System.out.println("Are you married, " + fname + "(y or n)? ");
                char choice = sc.next().charAt(0);
                if (choice == 'y' || choice == 'Y') {
                    System.out.println("Then I shall call you Mrs. " + fname + " " + lname);
                } else {
                    System.out.println("Then I shall call you Mr." + fname + " " + lname);
                }
            }else {
                System.out.println("You are a male so i can't print your name ");
            }
        }else {
            System.out.println("you are still a kid ");
        }
    }
}

