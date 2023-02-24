import java.util.Scanner;
public class Q6_Lab6 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String inputString = scanner.nextLine();

            System.out.print("Enter a character: ");
            char inputChar = scanner.nextLine().charAt(0);

            int charCount = countOccurrences(inputString, inputChar);

            System.out.println("The number of occurrences of the character '" + inputChar + "' in the string is " + charCount);
        }

        public static int countOccurrences(String inputString, char inputChar) {
            int count = 0;
            for (int i = 0; i < inputString.length(); i++) {
                if (inputString.charAt(i) == inputChar) {
                    count++;
                }
            }
            return count;
        }
    }


