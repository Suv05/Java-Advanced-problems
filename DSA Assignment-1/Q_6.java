public class Q_6 {

    public static boolean isOdd(int i) {
        return (i & 1) == 1;
    }
    public static void main(String[] args) {

        int num1 = 10;
        System.out.println(num1 + " is odd? " + isOdd(num1));
    }
}

