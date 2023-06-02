import java.util.Scanner;

class Student {
    int roll, DSA_Mark;
    String name;

    public Student(String name, int roll, int DSA_Mark) {
        this.roll = roll;
        this.name = name;
        this.DSA_Mark = DSA_Mark;
    }

    public void display() {
        System.out.println("My name is " + name + ", my roll number is " + roll + " and I secured a total of " + DSA_Mark + " marks in the DSA exam.");
    }
}

public class Q_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] stu = new Student[5];

        for (int k = 0; k < stu.length; k++) {
            System.out.println("Enter the data of " + k + "th Student");
            System.out.println("Enter the name");
            String name = sc.next();
            System.out.println("Enter the roll no");
            int roll = sc.nextInt();
            System.out.println("Enter the mark in DSA");
            int DSA_Mark = sc.nextInt();
            stu[k] = new Student(name, roll, DSA_Mark);
        }

        // Find the student with the highest DSA_Mark
        int max_mark = Integer.MIN_VALUE;
        Student max_student = null;
        for (Student student : stu) {
            if (student.DSA_Mark > max_mark) {
                max_mark = student.DSA_Mark;
                max_student = student;
            }
        }

        // Display the information of the student with the highest DSA_Mark
        System.out.println("Details of the student with the highest DSA Mark:");
        max_student.display();
    }
}
