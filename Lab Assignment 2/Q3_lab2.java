import java.util.*;
public class Q3_lab2 {
    public static void main(String[] args) {
        //Q-1 Enter the basic salary of an employee of an organization through the keyboard. His dearness
        //allowance (DA) is 40% of basic salary, and house rent allowance (HRA) is 20% of basic
        //salary. Write a java program to calculate his gross salary. Print the DA, HRA and Gross
        //salary.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Salary ");
        float sl = sc.nextFloat();
        float da = (sl*40)/100;
        System.out.println("His DA is = "+ da);
        float hra = (sl * 20) / 100;
        System.out.println("His HRA is = "+ hra);
        float gross = sl - (da + hra);
        System.out.println("His Gross salary is = "+ gross);
    }
}
