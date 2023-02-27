public class Q5_Lab6 {
    public static void main(String[] args) {
        double area = getAreaOfRegularPolygon(6, 10.0);
        System.out.println("The area of the regular hexagon is " + area);
    }

    public static double getAreaOfRegularPolygon(int n, double sideLength) {
        double a = n * Math.pow(sideLength, 2);
        double b = 4 * Math.tan(Math.PI / n);
        double area = a / b;
        return area;
    }


    //area = 0.5 * apothem * perimeter
    //apothem = s / (2 * tan(pi/n))


}
