/*Write a Java program that outputs all possible strings formed by using the characters 'c', 'a', 'r',
'b', 'o', and 'n' exactly once.
Example:
For 3 characters ‘C’, ‘A’, ‘R’, the possible strings are
CAR
CRA
RCA
RAC
ACR
ARC */
//import java.util.*;
//public class Q_4 {
//    public static void main(String[] args) {
//        String str = "carbon";
//        List<String> result = new ArrayList<>();
//        permutation("", str, result);
//        for (String s : result) {
//            System.out.println(s);
//        }
//    }
//
//    private static void permutation(String prefix, String str, List<String> result) {
//        int n = str.length();
//        if (n == 0) {
//            result.add(prefix);
//        } else {
//            for (int i = 0; i < n; i++) {
//                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1), result);
//            }
//        }
//    }
//}


public class Q_4 {

    static char[] characters = {'c', 'a', 'r', 'b', 'o', 'n'};

    public static void main(String[] args) {
        printPermutation(characters, 0, characters.length);
    }

    private static void printPermutation(char[] a, int startIndex, int endIndex) {
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

    private static void swap(char[] a, int i, int x) {
        char t = a[i];
        a[i] = a[x];
        a[x] = t;
    }

}