import java.util.*;
public class Q1_lab2 {
    public static void main(String[] args) {
        //Q - Write a java program that reads a Fahrenheit degree in a double value from the console, then
        //converts it to Celsius and displays the result. The formula for the conversion is as follows:


        //Celsius = (Fahrenheit-32) *(5/9)
        //Hint: In Java, 5 / 9 is 0, but 5.0 / 9 is 0.556
        //Here is a sample run:
        //Enter a degree in Fahrenheit: 54
        //54 Fahrenheit is 12.22 Celsius


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Temperature in fahrenheit");
        float f = sc.nextFloat();
        float c = (float) ((f - 32)*(5.0/9.0));  //IMP here you have to give 5.0,9.0 ❤️❤️‍🔥💞
        System.out.println(f+" Fahrenheit is "+ c +" Celsius");
    }
}