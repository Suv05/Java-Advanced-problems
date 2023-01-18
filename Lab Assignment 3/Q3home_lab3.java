import java.util.*;
public class Q3home_lab3 {
    public static void main(String[] args) {
     //Q-Write a java program that randomly generates an integer between 1 and 12 and displays
        //the English month name January, February... December for the number 1, 2... 12,accordingly.
        Random ram = new Random();
        int month = ram.nextInt(1, 12);
        switch (month) {
            case 1 -> System.out.println("It is january");
            case 2 -> System.out.println("It is February");
            case 3 -> System.out.println("It is March");
            case 4 -> System.out.println("It is April");
            case 5-> System.out.println("It is May");
            case 6 -> System.out.println("It is june");
            case 7 -> System.out.println("It is July");
            case 8 -> System.out.println("It is August");
            case 9 -> System.out.println("It is September");
            case 10 -> System.out.println("It is October");
            case 11 -> System.out.println("It is November");
            case 12-> System.out.println("It is December");



        }


    }
}
