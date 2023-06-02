import java.util.Scanner;

public class Q_2 {
    public static void main(String[] args) {
        String[] favoriteColors = new String[4];

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter four colors:");

            for (int i = 0; i < 4; i++) {
                favoriteColors[i] = scanner.nextLine();
            }

            // Simulating NumberFormatException
            System.out.println("Convert string to integer");
            int number = Integer.parseInt(favoriteColors[0]);

            // Simulating ArrayIndexOutOfBoundsException
            System.out.println("Enter one more color:");
            favoriteColors[4] = scanner.nextLine();

        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        } finally {
            System.out.println("The colors entered are:");
            for (String color : favoriteColors) {
                if (color != null) {
                    System.out.println(color);
                }
            }
        }


    }
}
