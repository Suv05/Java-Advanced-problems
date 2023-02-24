public class Q5_Lab6 {
    public static double getAreaOfRegularPolygon(int n, double sideLength) {
        double apothem = sideLength / (2 * Math.tan(Math.PI / n));
        double perimeter = n * sideLength;
        double area = 0.5 * apothem * perimeter;
        return area;
    }
    //double area = getAreaOfRegularPolygon(6, 10.0);
//System.out.println("The area of the regular hexagon is "+area);

    //area = 0.5 * apothem * perimeter
    //apothem = s / (2 * tan(pi/n))


}
