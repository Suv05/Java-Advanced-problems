public class Type1 {

    //    1
    //   2 2
    //  3 3 3
    // 4 4 4 4
    //5 5 5 5 5
    public static void main(String[] args) {
        int rows = 5;

        // loop through rows
        for (int i = 1; i <= rows; i++) {

            // print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // print numbers
            for (int k = 1; k <= i; k++) {
                System.out.print(i + " ");
            }

            // print new line
            System.out.println();
        }
    }
}
