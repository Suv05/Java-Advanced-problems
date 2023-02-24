import java.util.Scanner;

public class Q9_Lab6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = input.nextLine();
        if (isValidPassword(password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }

    public static boolean isValidPassword(String password) {
        if (password.length() < 8) {
            return false;
        }
        if (!password.matches("[a-zA-Z0-9]+")) {
            return false;
        }
        if (password.replaceAll("\\D", "").length() < 2) {
            return false;
        }
        return true;
    }
}


