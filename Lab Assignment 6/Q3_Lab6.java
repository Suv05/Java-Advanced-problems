import java.util.Scanner;
public class Q3_Lab6 {
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
