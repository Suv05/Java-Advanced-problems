//Create 2 package Q10Pack1 and Q10Pack2
//create Q_10.java in pack1 and sports.java in Pack2

//This is the 1st part of pack1 and Q_10.java
package Q10Pack1;

import Q10Pack2.Sports;

import java.util.Scanner;

class Student {
    protected String name;
    protected int roll;

    public void inputa() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        name = sc.next();
        System.out.println("Enter roll number:");
        roll = sc.nextInt();
    }

    public void output() {
        System.out.println("Name: " + name);
        System.out.println("Roll number: " + roll);
    }
}

class Test extends Student {
    protected int mark1;
    protected int mark2;

    public void input() {
        super.inputa();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks in subject 1:");
        mark1 = sc.nextInt();
        System.out.println("Enter marks in subject 2:");
        mark2 = sc.nextInt();
    }

    public void output() {
        super.output();
        System.out.println("Marks in subject 1: " + mark1);
        System.out.println("Marks in subject 2: " + mark2);
    }
}

public class Q_10 implements Sports {
    public static void main(String[] args) {
        Test t = new Test();
        t.input();
        t.output();

        int grandTotal = t.mark1 + t.mark2 + score1 + score2;
        System.out.println("Score 1: " + score1);
        System.out.println("Score 2: " + score2);
        System.out.println("Grand total marks: " + grandTotal);
    }
}
