import java.util.Scanner;

public class Q3_Array {
    public static void main(String[] args) {
        //Question-3:
        //Write a java program using an array that reads the integers between 1 and 100 and counts the occurrences of each. Assume the input ends with 0.

        int[] count = new int[101]; // Array to store the counts
        Scanner input = new Scanner(System.in);
        int num;

        // Read integers between 1 and 100 and count the occurrences
        do {
            num = input.nextInt();
            if (num >= 1 && num <= 100) {
                count[num]++;
            }
        } while (num != 0);

        // Print the counts
        for (int i = 1; i <= 100; i++) {
            if (count[i] > 0) {
                System.out.println(i + " occurs " + count[i] + " times.");


                //Another process to do it ❤️‍🔥😅🥲


//                Scanner sc = new Scanner(System.in);
//                int[] occurrences = new int[101]; // Array to hold the occurrences of each number
//                int num;
//
//                System.out.print("Enter the integers between 1 and 100: ");
//                while ((num = sc.nextInt()) != 0) {
//                    if (num >= 1 && num <= 100) {
//                        occurrences[num]++;
//                    }
//                }
//
//                for (int i = 1; i <= 100; i++) {
//                    if (occurrences[i] > 0) {
//                        System.out.printf("%d occurs %d %s\n", i, occurrences[i], (occurrences[i] > 1 ? "times" : "time"));
//                    }
            }
        }
    }
}
