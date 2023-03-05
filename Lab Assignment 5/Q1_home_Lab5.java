public class Q1_home_Lab5 {
    public static void main(String[] args) {
        //Question-1:
        //Write a program to print the following patterns:
        //5 4 3 2 *
        //5 4 3 * 1
        //5 4 * 2 1
        //5 * 3 2 1
        //* 4 3 2 1

        int n = 5;

        for (int i = 0; i < n; i++) {
            for (int j = n; j >= 1; j--) {
                if (j == i + 1 || j == n - i) {
                    System.out.print("* ");
                } else {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }

    }
}
