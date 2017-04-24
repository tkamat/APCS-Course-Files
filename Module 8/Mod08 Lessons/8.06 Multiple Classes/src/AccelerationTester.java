
/**
 * This class contains the main method and creates an object of the ShapesV1 class.
 * The value of the base and height are passed to the private instance variables 
 * when the shapes object is constructed.
 * 
 * @author B. Jordan 
 * @version 05/29/07
 * Lesson: 08.06
 */
public class AccelerationTester
{
    public static void main(String[] args)
    {
        int base = 4;
        int height = 8;
        ShapesV1 shapes = new ShapesV1(base, height);
        
        System.out.printf("Distance Traveled = %5.2f feet%n", shapes.calcTriArea());
        double acceleration = height / base;
        System.out.printf("Acceleration = %3.1f feet per second squared%n", acceleration);
    }
}
