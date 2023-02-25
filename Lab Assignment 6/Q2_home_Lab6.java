public class Q2_home_Lab6 {
    public class VolumeCalculator {
        // calculate the volume of a sphere
        public static double calculateVolume(double radius) {
            return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        }

        // calculate the volume of a cuboid
        public static double calculateVolume(double length, double width, double height) {
            return length * width * height;
        }

        // calculate the volume of a cube
        public static double calculateVolume(double side) {
            return Math.pow(side, 3);
        }

        public static void main(String[] args) {
            double radius = 2.5;
            double length = 3.0;
            double width = 4.0;
            double height = 5.0;
            double side = 2.0;

            // calculate the volume of a sphere
            double sphereVolume = calculateVolume(radius);
            System.out.println("Volume of sphere with radius " + radius + " = " + sphereVolume);

            // calculate the volume of a cuboid
            double cuboidVolume = calculateVolume(length, width, height);
            System.out.println("Volume of cuboid with length " + length + ", width " + width + ", and height " + height
                    + " = " + cuboidVolume);

            // calculate the volume of a cube
            double cubeVolume = calculateVolume(side);
            System.out.println("Volume of cube with side " + side + " = " + cubeVolume);
        }
    }
//    Volume of sphere with radius 2.5 = 65.44984694978736
//    Volume of cuboid with length 3.0, width 4.0, and height 5.0 = 60.0
//    Volume of cube with side 2.0 = 8.0

}
