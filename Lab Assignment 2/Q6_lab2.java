import java.util.*;
public class Q6_lab2 {
    public static void main(String[] args) {
        //Q- When a brick is dropped from a tower, it falls faster and faster until it hits the earth. The
        //distance it travels is given by d = (1/2) gt2,
        // Here d is in feet, t is the time in seconds, and g is 32.174

        //Here is the sample run:
        //Enter the number of seconds: 5.4
        //Distance travelled: 469.096
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of seconds: ");
        double sec= sc.nextDouble();
        double dist = 32.174 * sec * sec * (1.0 / 2.0);
        System.out.println(dist);

    }
}
