/*Write a Java program that takes two arrays a and b of length n storing int values, and returns
the dot product of a and b. That is, it returns an array c of length n such that c[i] = a[i] · b[i],
for i = 0, . . . , n − 1*/
public class Q_3_home {
    public static int[] calculateDotProduct(int[] a, int[] b) {
        if (a.length != b.length) {
            throw new IllegalArgumentException("Array lengths must be equal.");
        }

        int n = a.length;
        int[] c = new int[n];

        for (int i = 0; i < n; i++) {
            c[i] = a[i] * b[i];
        }

        return c;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {6, 7, 8, 9, 10};

        int[] c = calculateDotProduct(a, b);

        System.out.print("Dot Product: ");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
    }
}
