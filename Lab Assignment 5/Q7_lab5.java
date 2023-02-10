public class Q7_lab5 {
    public static void main(String[] args) {
//Question-7:
        //A
        //A B
        //A B C
        //A B C D
        //A B C D E

        for (int i = 1; i < 6; i++) {
            for (int j = 65; j < 65 + i; j++) {
                System.out.print((char)j+" ");
            }
            System.out.print("\n");
        }
    }
}
