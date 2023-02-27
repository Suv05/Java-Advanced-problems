import java.util.Scanner;
public class Q6_Lab6 {
    //Write a java program that prompts the user to enter a string followed by a character and
    //displays the number of occurrences of the character in the string.
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String inputString = sc.nextLine();

            System.out.print("Enter a character: ");
            char inputChar = sc.nextLine().charAt(0);

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


