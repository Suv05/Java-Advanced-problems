public class Q5Home_lab1 {
    public static void main(String[] args) {

        // Using extra variables
        int W = 1, A = 2, K = 3, G = 4;
        int temp1 = W;
        int temp2 = A;
        int temp3 = K;
        W = G;
        A = temp3;
        K = temp2;
        G = temp1;
        System.out.println("W = "+W);
        System.out.println("A = "+A);
        System.out.println("K = "+K);
        System.out.println("G = "+G);
// Without using extra variables
//        W = W + G;
//        G = W - G;
//        W = W - G;
//
//        A = A + K;
//        K = A - K;
//        A = A - K;
//        System.out.println("W = "+W);
//        System.out.println("A = "+A);
//        System.out.println("K = "+K);
//        System.out.println("G = "+G);

// Now the values of W, G, K, & A have been exchanged as required.


    }
}
