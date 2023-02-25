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

        public static boolean isPalindrome(int number) {
            int reverse = 0;
            int original = number;

            while (number != 0) {
                int digit = number % 10;
                reverse = reverse * 10 + digit;
                number /= 10;
            }

            return reverse == original;
        }
    }
