/*The body mass index (BMI) is commonly used by health and nutrition professionals to estimate
human body fat in populations. It is computed by taking the individual's weight (mass) in
kilograms and dividing it by the square of their height in meters*/

import java.util.*;
public class Q_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your mass in kg");
        double x = sc.nextDouble();
        System.out.println("Enter your Height in meters");
        double y = sc.nextDouble();
        double bmi = x / (y * y);
        if (bmi <= 18.5) {
            System.out.println("Under Weight");
        } else if (bmi >= 18.5 && bmi <= 24.5) {
            System.out.println("Normal weight");
        } else if (bmi > 24.5 && bmi <= 29.9) {
            System.out.println("over Weight");
        }else {
            System.out.println("OBESE");
        }
    }
}
