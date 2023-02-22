import java.util.*;
public class Q5_lab2 {
    public static void main(String[] args) {
        //Q-Write a java program that reads the radius of a hemisphere and computes the surface area
        //and volume using the following formulas:

        //Surface Area of Hemisphere = 3 π r^2. Volume of a hemisphere = (2/3)πr^3
        //Where π is a constant whose value is equal to 3.14 approximately. “r” is the radius of the
        //hemisphere.
        //
        // Hint: Use Math.PI.


        //Here is a sample run:
        //Enter the radius of the hemisphere: 7.0
        //The surface area of the hemisphere is 461.814
        //The volume area of the hemisphere is 718.377

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the hemisphere: ");
        float r= sc.nextFloat();
        float vl = (float) ((2.0/3.0)*Math.PI*Math.pow(r,3));
        System.out.println(vl);
        float sr = (float) (3.0 * Math.PI * Math.pow(r, 2));
        System.out.println(sr);
    }
}
