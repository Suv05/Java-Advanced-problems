public class Q5_lab5 {
    public static void main(String[] args) {
//Question-5:
//WAP to display the multiplication table from 2 to 15.
//Sample run:
//Multiplication table of 2
//2 × 1 = 2
//2 × 2 = 4
//:
//:
//2 × 10 = 20
//Multiplication table of 3
//3 × 1 = 3
//3 × 2 = 6
//:
//:
//3 × 10 = 30
//:
//:
//:
//Multiplication table of 15
//15 × 1 = 15
//15 × 2 = 30
//:
//:
//15 × 10 = 150
        //Normal table format...
//        int n=2;
//        for (int i = 1; i <= 10; i++) {
//            System.out.printf("%d X %d=%d\n" ,n, i, n*i);
//        }
        for (int i = 2; i < 16; i++) {
            System.out.println("Multiplication table of "+i);
            for (int x = 1; x < 11; x++) {
                System.out.printf("%d X %d = %d\n",i,x,i*x);

            }
        }

    }
}
