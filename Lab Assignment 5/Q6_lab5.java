public class Q6_lab5 {
    public static void main(String[] args) {
//Question-6:
//Write a program to print the following outputs using for loops:
//*
//* *
//* * *
//* * * *
//* * * * *

//        for (int i = 1; i < 6; i++) {
//            for (int j = i; j >0; j--) {
//
//            System.out.print("*");
//            }
//            System.out.print("\n");
//        }

//1
//2 2
//3 3 3
//4 4 4 4
//5 5 5 5
        for (int i = 1; i < 6; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print(i);
            }
            System.out.print("\n");
        }
    }
}
