/*Create an abstract class Shape and the derived classes Square, Triangle and Circle. Write a
java program to display area of different shapes.*/
abstract class Shape {
    abstract double getArea();
}

class Square extends Shape {
    double length;

    Square(double length) {
        this.length = length;
    }

    @Override
    double getArea() {
        return length * length;
    }
}

class triangle extends Shape {
    double base, height;

    triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double getArea() {
        return 0.5 * base * height;
    }
}

class Cricle extends Shape {
    double radius;

    Cricle(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
}

public class Q_6 {
    public static void main(String[] args) {
        Square sq = new Square(7.5);
        Cricle c = new Cricle(5);
        triangle t = new triangle(5, 8);
        System.out.println("Area of the Square:- " + sq.getArea());
        System.out.println("Area of the Square:- " + c.getArea());
        System.out.println("Area of the Square:- " + t.getArea());
    }
}
