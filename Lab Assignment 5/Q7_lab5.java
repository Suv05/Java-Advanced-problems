public class Q7_lab5 {
    public static void main(String[] args) {
//Question-7:
        //A
        //A B
        //A B C
        //A B C D
        //A B C D E

//        for (int i = 1; i < 6; i++) {
//            for (int j = 65; j < 65 + i; j++) {
//                System.out.print((char)j+" ");
//            }
//            System.out.print("\n");
//
//        for (int i = 1; i < 5; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print((char) (65 + j) + " ");  //Method 2 for above 🪂🚀
//            }
//            System.out.println("\n");
//        }


        //$ $ $ $ $
        //$ $ $ $
        //$ $ $
        //$ $
        //$
//        for (int i = 5; i >0; i--) {
//            for (int j = 1; j <=i; j++) {
//                System.out.print("$" + " ");
//            }
//            System.out.print("\n");
//        }

        //            1
        //         2  2
        //      3  3  3
        // 4   4  4   4
        // 5  5  5  5 5

        for (int i = 1; i < 6; i++) {
            for (int j = 5; j > 0; j--) {
                System.out.print(j+" ");
            }
            System.out.print("\n");
        }

    }
}

