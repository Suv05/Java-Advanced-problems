import java.util.*;

class MarksOutOfBoundException extends Exception {
    public MarksOutOfBoundException(String message) {
        super(message);
    }
}

class Student {
    private String name;
    private double mark;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) throws MarksOutOfBoundException {
        if (mark > 100) {
            throw new MarksOutOfBoundException("Mark can't be greater than 100");
        }
        this.mark = mark;
    }
}

public class Q_3 {
    public static void main(String[] args) {
        Student student = new Student();

        // Get input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the student:");
        String name = scanner.nextLine();
        System.out.println("Enter marks:");
        double mark = Double.parseDouble(scanner.nextLine());

        // Set the student's name and mark
        student.setName(name);
        try {
            student.setMark(mark);
            System.out.println(student.getName() + " has got " + student.getMark());
        } catch (MarksOutOfBoundException e) {
            System.out.println("MarksOutOfBoundException: " + e.getMessage());
        }
    }
}
