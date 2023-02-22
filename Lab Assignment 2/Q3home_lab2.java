import java.util.*;

public class Q3home_lab2 {
    public static void main(String[] args) {
        //Q-Write a java program that prompts the user to enter three points (x1, y1), (x2, y2), (x3, y3) of
        //a triangle and displays its area. The formula for computing the area of a triangle is
        //s = (side1 + side2 + side3)/2;
        //area=√𝑠 ∗ (𝑠 − 𝑎) ∗ (𝑠 − 𝑏) ∗ (𝑠 − 𝑐)
        //Here is a sample run:
        //Enter three points for a triangle: 1.5 -3.4 4.6 5 9.5 -3.4
        //The area of the triangle is 33.6
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 points for calculating area if triangle");
        double x1= sc.nextDouble();
        double y1= sc.nextDouble();
        double x2= sc.nextDouble();
        double y2= sc.nextDouble();
        double x3= sc.nextDouble();
        double y3= sc.nextDouble();
        double s=((y1-x1)+(y2-x2)+(y3-x3))/2;
        double area = s*(s-(y1-x1))*(s-(y2-x2))*(s-(y3-x3));
        System.out.println(Math.sqrt(area));


    }
}
