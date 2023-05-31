/*Write a Java method, isOdd( ), that takes an int i and returns true if and only if I am odd. Your
method can't use the multiplication, modulus, or division operators, The method signature is
as follows.
public static boolean isOdd(int n)
Sample Run:
Enter a number 37
37 is odd: true*/
public class Q_6 {
   //Explanation....
    //1-The method isOdd() uses bitwise AND operation (&) with the number 1 to
    // check the least significant bit of i.

    //2-In binary representation, odd numbers have the least significant bit set to 1,
    //while even numbers have it set to 0.

    //3-If the result of (i & 1) is 1, it means the least significant bit is 1,
    // indicating that the number is odd.

    public static boolean isOdd(int i) {
        return (i & 1) == 1;

    }

    public static void main(String[] args) {

        int num1 = 11;
        System.out.println(num1 + " is odd? " + isOdd(num1));
    }
}

/*public static boolean isOdd(int i) {
        if ((i >> 1) << 1 != i) {
            return true;
        }
        return false;
    }*/