public class Q5_Lab6 {
    //A regular polygon is an n-sided polygon in which all sides are of the same length and all angles
    //have the same degree (i.e., the polygon is both equilateral and equiangular). The formula for
    //computing the area of a regular polygon is
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



}
