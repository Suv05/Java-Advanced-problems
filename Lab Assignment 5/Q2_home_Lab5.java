public class Q2_home_Lab5 {

    //Question -2:
    //Write a program to print the following patterns using loops:
    //     *
    //   * * *
    //  * * * * *
    //* * * * * * *
    public static void main(String[] args) {
        // Set the number of rows in the pyramid
        int numRows = 4;

// Loop through each row of the pyramid
        for (int i = 0; i < numRows; i++) {
            // Add spaces before the first asterisk on each row
            for (int j = 0; j < numRows - i - 1; j++) {
                System.out.print(" ");
            }
            // Add the asterisks for this row
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }

    }
}
