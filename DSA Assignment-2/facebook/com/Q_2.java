package facebook.com;

/*Define a class called Complex with instance variables real, imag and instance methods
setData(), display(), add(). Write a Java program to add two complex numbers.
The prototype of add method is:- public Complex add(Complex, Complex).*/
class Complex {
    private double real;
    private double imag;

    public void setData(double r, double i) {
        real = r;
        imag = i;
    }

    public void display() {
        if (imag < 0) {
            System.out.println(real + " - " + Math.abs(imag) + "i");
        } else {
            System.out.println(real + " + " + imag + "i");
        }
    }

    public Complex add(Complex c1, Complex c2) {
        Complex sum = new Complex();
        sum.real = c1.real + c2.real;
        sum.imag = c1.imag + c2.imag;
        return sum;
    }
}

public class Q_2 {
    public static void main(String[] args) {
        Complex c1 = new Complex();
        Complex c2 = new Complex();
        Complex sum = new Complex();

        c1.setData(3, 2);
        c2.setData(1, -4);

        sum = sum.add(c1, c2);

        c1.display();
        c2.display();
        System.out.print("Sum: ");
        sum.display();
    }
}
