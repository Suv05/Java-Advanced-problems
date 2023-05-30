/*Write a Java program that outputs all possible strings formed by using the character 'c', 'a', 'r',
'b', 'o', and 'n' exactly once.
Example:
For 3 character ‘C’, ‘A’, ‘R’, the possible strings are
CAR
CRA
RCA
RAC
ACR
ARC */

public class Q_4 {

    static char[] ch = {'c', 'a', 'r', 'b', 'o', 'n'};

    public static void main(String[] args) {
        printPermutation(ch, 0, ch.length);
    }

    public static void printPermutation(char[] a, int startIndex, int endIndex) {
        if (startIndex == endIndex)//reached end of recursion, print the state of a
            System.out.println(new String(a));
        else {
            //try to move the swap window from start index to end index
            //i.e 0 to a.length-1
            for (int x = startIndex; x < endIndex; x++) {
                swap(a, startIndex, x);
                printPermutation(a, startIndex + 1, endIndex);
                swap(a, startIndex, x);
            }
        }
    }

    public static void swap(char[] a, int i, int x) {
        char t = a[i];
        a[i] = a[x];
        a[x] = t;
    }

}