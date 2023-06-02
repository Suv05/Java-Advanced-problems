import java.util.Scanner;

public class Q_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your lucky number: ");
        try {
            int luckyNumber = Integer.parseInt(scanner.nextLine());

            if (luckyNumber < 0) {
                throw new NumberFormatException("Negative number");
            }

            System.out.println("Your lucky number is " + luckyNumber);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }

    }
}


