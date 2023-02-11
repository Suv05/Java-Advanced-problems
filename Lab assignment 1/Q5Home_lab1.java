public class Q5Home_lab1 {
    public static void main(String[] args) {

        // Using extra variables
        int W, A, K, G;
        int temp1 = W;
        int temp2 = A;
        int temp3 = K;
        W = G;
        A = temp3;
        K = temp2;
        G = temp1;

// Without using extra variables
        W = W + G;
        G = W - G;
        W = W - G;

        A = A + K;
        K = A - K;
        A = A - K;

// Now the values of W, G, K, and A have been exchanged as required.


    }
}
