import java.util.Scanner;

class Student {
    int roll, DSA_Mark;
    String name;

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public int getDSA_Mark() {
        return DSA_Mark;
    }

    public void setDSA_Mark(int DSA_Mark) {
        this.DSA_Mark = DSA_Mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name,int roll,int DSA_Mark) {
        this.roll = roll;
        this.name = name;
        this.DSA_Mark = DSA_Mark;

    }

    public void display(){
        System.out.println("My name is "+name+",my roll number is "+roll+" and i secured total "+DSA_Mark+" mark in Dsa exam 🥲");
    }
}

public class Q_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] stu = new Student[5];
        /*stu[0] = new Student();
        stu[1] = new Student();
        stu[2] = new Student();
        stu[3] = new Student();
        stu[4] = new Student();*/

       /* stu[0].setName("Suv");
        stu[0].setRoll(5);
        stu[0].setDSA_Mark(45);
        stu[0].display();*/

        //Setting value using the loop....
        for (int k = 0; k < stu.length; k++) {
            System.out.println("Enter the data of "+k+" th employee");
            String name= sc.next();
            int roll= sc.nextInt();
            int DSA_Mark = sc.nextInt();
            stu[k] = new Student(name, roll, DSA_Mark);
        }
        for (Student student : stu) {
            student.display();
        }
    }

}
