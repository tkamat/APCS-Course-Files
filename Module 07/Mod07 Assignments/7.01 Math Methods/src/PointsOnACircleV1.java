/**
 * Calculates the x and y coordinates of points on a circle.
 *
 * @author Tushaar Kamat
 * @version 9/3/2016
 */
public class PointsOnACircleV1 {
    public static void main(String[] args) {

        //local variables
        double radius = 1.0;
        double increment = 0.1;
        double x1 = 0.0;
        double y1 = 0.0;
        double y2 = 0.0;

        //table heading
        System.out.println("    Points on a Circle of Radius " + radius);
        System.out.printf("%6s%8s%13s%8s%n", "x1", "y1", "x1", "y2");
        System.out.println(" -------------------------------------");

        //processing loop to find and print coordinates
        for (x1 = 1.00; x1 >= -1.00; x1 -= increment) {
            y1 = Math.sqrt(Math.pow(radius, 2) - Math.pow(x1, 2));
            y2 = 0 - Math.abs(y1);
            System.out.printf("%7.2f%8.2f%13.2f%8.2f%n", x1, y1, x1, y2);
        }
    }
}