import java.util.*;
public class Q2_lab2 {
    public static void main(String[] args) {
        //Q - The distance between two cities (in km.) is input through the keyboard. Write a java program
        //to convert and print this distance in meters, feet, inches and centimetres.

        //Hint:
        //1km=1000meter, 1km=3280.8399feet, 1km= 39370.0787 inch,
        //1km= 100000 centimetre

        //Here is the sample run:
        //Enter the distance in km=165
        //165 km is 165000 meters
        //165 km is 541338.5835 feet
        //165 km is 6496062.9854999995 inch
        //165 km is 16500000 centimetres...

        Scanner sc = new Scanner((System.in));
        System.out.println("Enter your distance in km");
        float km= sc.nextFloat();
        float m = km*1000;
        System.out.println("Your distance in meter is " + m);
        float fe = km*3280.8399f;
        System.out.println("Your distance in meter is " + fe);
        float inc = km*39370.0787f;
        System.out.println("Your distance in meter is " + inc);

    }
}
