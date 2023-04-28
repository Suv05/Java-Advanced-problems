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
}

public class Q_3 {
    public static void main(String[] args) {

        Student[] stu = new Student[5];
        stu[0] = new Student();
        stu[1] = new Student();
        stu[2] = new Student();
        stu[3] = new Student();
        stu[4] = new Student();

        stu[0].setName("Suv");
        stu[0].setRoll(5);
        stu[0].setDSA_Mark(45);

        stu[1].setName("ram");
        stu[1].setRoll(6);
        stu[1].setDSA_Mark(74);

        for (Student element:stu) {
            System.out.println(element);
        }

    }

}
