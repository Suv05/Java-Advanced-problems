import java.util.*;
public class Q8_lab3 {
    public static void main(String[] args) {
//Q-Write a java program that takes the x – y coordinates of a point in the Cartesian plane
//and prints a message telling either an axis on which the point lies or the quadrant in which it is found.
        
//Here is the sample output:
//(-1.0, -2.5) is in quadrant III
//(0.0, 4.8) is on the y-axis

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your two number ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if (y > 0 && x > 0) {
            System.out.println("It is lies on 1st quadrant");
        } else if (x < 0 && y > 0) {
            System.out.println("It is lies on 2nd quadrant");
        } else if (x < 0 && y < 0) {
            System.out.println("It is lies on 3rd quadrant");
        }else {
            System.out.println("It is lies on 4th quadrant");
    }
        if (x == 0 && y != 0) {
            System.out.println("It will lies on y-axis");
        } else if (x != 0 && y == 0) {
            System.out.println("It will lies on x-axis");
        } else if (x == 0 && y==0) {
            System.out.println("It will lie on center");
        } else {
            System.out.println("It will lies on xy plane");

        }
    }
 }
