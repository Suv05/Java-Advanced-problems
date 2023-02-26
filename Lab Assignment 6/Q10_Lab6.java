//import java.util.Scanner;
//public class Q10_Lab6 {
//        public static void main(String[] args) {
//            Scanner input = new Scanner(System.in);
//            int choice = 0;
//            while (choice != 5) {
//                System.out.println("Select a shape to calculate the area:");
//                System.out.println("1. Triangle");
//                System.out.println("2. Square");
//                System.out.println("3. Circle");
//                System.out.println("4. Rectangle");
//                System.out.println("5. Exit");
//                System.out.print("Enter your choice: ");
//                choice = input.nextInt();
//                switch (choice) {
//                    case 1:
//                        double base, height;
//                        System.out.print("Enter the base of the triangle: ");
//                        base = input.nextDouble();
//                        System.out.print("Enter the height of the triangle: ");
//                        height = input.nextDouble();
//                        System.out.println("The area of the triangle is: " + calculateArea(base, height));
//                        break;
//                    case 2:
//                        double side;
//                        System.out.print("Enter the side of the square: ");
//                        side = input.nextDouble();
//                        System.out.println("The area of the square is: " + calculateArea(side));
//                        break;
//                    case 3:
//                        double radius;
//                        System.out.print("Enter the radius of the circle: ");
//                        radius = input.nextDouble();
//                        System.out.println("The area of the circle is: " + calculateArea(radius));
//                        break;
//                    case 4:
//                        double length, width;
//                        System.out.print("Enter the length of the rectangle: ");
//                        length = input.nextDouble();
//                        System.out.print("Enter the width of the rectangle: ");
//                        width = input.nextDouble();
//                        System.out.println("The area of the rectangle is: " + calculateArea(length, width));
//                        break;
//                    case 5:
//                        System.out.println("Exiting...");
//                        break;
//                    default:
//                        System.out.println("Invalid choice.");
//                }
//            }
//        }
//
////        public static double calculateArea(double base, double height) {
////            return 0.5 * base * height;
////        }
////
////        public static double calculateArea(double side) {
////            return side * side;
////        }
////
////        public static double calculateArea(double radius) {
////            return Math.PI * radius * radius;
////        }
//
////        public static double calculateArea(double length, double width) {
////            return length * width;
//       // }
//    }
//
//
