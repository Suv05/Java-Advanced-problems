import java.util.Scanner;
public class Q10_Lab5 {
    //Given a=0, b=1 and c=1 are the first three numbers of some sequence. All other numbers in
    //the sequence are generated from the sum of their three most recent predecessors. Write a java
    //program to generate this sequence up to n terms where n > 3.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int a = 0, b = 1, c = 1;
        System.out.print(a + " " + b + " " + c + " ");
        for (int i = 4; i <= n; i++) {
            int temp = a + b + c;
            System.out.print(temp + " ");
            a = b;
            b = c;
            c = temp;
        }
    }
}
