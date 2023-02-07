public class Q3home_lab4 {
    public static void main(String[] args) {
//Q-Write a java program in which using one for loop and one if statement, prints the integers
//from 1,000 to 2,000 with five integers per line. Hint: Use the % operation.
        int count = 0;
        for (int i = 1000; i <= 2000; i++) {
            System.out.print(i);
            System.out.print(" ");
            count++;
            if (count == 5) {
                System.out.println("\n");
                count = 0;
            }
        }
    }
}
