import java.util.Scanner;
public class Q3_Lab6 {
    //Use the reverse method to implement isPalindrome. A number is a palindrome if its reversal is
    //the same as itself. Write a java program that prompts the user to enter an integer and reports
    //whether the integer is a palindrome.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome");
        } else {
            System.out.println(number + " is not a palindrome");
        }
    }

    public static boolean isPalindrome(int x) {
        int reverse = 0;
        int original = x;

        while (x != 0) {
            reverse = reverse * 10 + (x % 10);
            x /= 10;
        }

        return reverse == original;
    }
}
