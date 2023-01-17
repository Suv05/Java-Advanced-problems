import java.util.Scanner;
public class Q10_lab3 {
    public static void main(String[] args) {
        //Q-A University conducts a 100-mark exam for its student and grades them as follows.
        //Assigns a grade based on the value of the marks. Write a java program to print the
        //grade according to the mark secured by the student. [Use switch-case].

        //Mark Range        Letter Grade
        //>=90                    O
        //>=80 AND <90            A
        //>=70 AND <80            B
        //>=60 AND <70            C
        //>=50 AND <60            D
        //>=50 AND <40            E
        //<40                     F

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks in subject");
        int m = sc.nextInt();
        switch (m/10) {
            case 10, 9 -> System.out.println("o");
            case 8 -> System.out.println("you have A grade in your exam.");
            case 7 -> System.out.println("you have B grade in your exam.");
            case 6 -> System.out.println("you have C grade in your exam.");
            case 5 -> System.out.println("you have D grade in your exam.");
            case 4 -> System.out.println("you have E grade in your exam.");
            case 3 -> System.out.println("you have f grade in your exam.");

        }
    }
}
