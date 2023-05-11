/*Write a Java program to declare a Class named as Student which contains roll number,
name and course as instance variables and input_Student () and display_Student () as
instance methods. A derived class Exam is created from the class Student. The derived
class contains mark1, mark2, mark3 as instance variables representing the marks of three
subjects and input_Marks () and display_Result () as instance methods. Create an array of
objects of the Exam class and display the result of 5 students.*/
package facebook.com;

import java.util.*;

class Student {
    int roll;
    String name;
    String course;

    public void set_Student(int roll, String name, String course) {
        this.course = course;
        this.name = name;
        this.roll = roll;
    }

    public void displayStudent() {
        System.out.println("My Roll :- " + roll + " Name:- " + name + " Course:- " + course);

    }
}

class Exam extends Student {
    int mark1, mark2, mark3;

    public void setMark(int mark1, int mark2, int mark3) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    public void displayResult() {
        System.out.println("Mark1:- " + mark1 + " Mark2:-" + mark2 + " Mark3:- " + mark3);
    }
}


public class Q_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Exam[] e = new Exam[5];
        for (int k = 0; k < e.length; k++) {
            e[k] = new Exam();
            System.out.println("Enter the data of " + k + " th Student");
            System.out.println("roll");
            int roll = sc.nextInt();
            System.out.println("name");
            String name = sc.next();
            System.out.println("course");
            String course = sc.next();
            System.out.println("mark1");
            int Mark1 = sc.nextInt();
            System.out.println("mark2");
            int Mark2 = sc.nextInt();
            System.out.println("mark3");
            int Mark3 = sc.nextInt();

            e[k].set_Student(roll, name, course);
            e[k].setMark(Mark1, Mark2, Mark3);
        }
        for (Exam element : e) {
            element.displayStudent();
            element.displayResult();
        }
    }
}
