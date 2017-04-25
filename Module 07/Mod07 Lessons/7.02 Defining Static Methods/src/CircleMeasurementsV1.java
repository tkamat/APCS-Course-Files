/**
 * This program uses methods to calculate the volume of a cylinder.
 * Also illustrates use of Math class methods.
 * 
 * �FLVS 2007
 * @author B. Jordan 
 * @version 05/12/07
 */
public class CircleMeasurementsV1
{   

    //calculate the area of a circle
    public static double calcArea(double r)
    {
        //return statement to calculate area goes here
        return Math.PI * Math.pow(r, 2);
    }

    //calc the diameter of a circle
    public static double calcDiameter(double r) {

        //remove comments in front of the statement below after you write the method header
        return 2 * r;
    }

    //calculate the circumference of a circle
    public static double calcCircumference(double r) {

        return (2 * r) * Math.PI;
    }
 
    //NOTE TO STUDENT: Start at the main method
    //main method
    public static void main(String[] args)
    {
        double radius = 7.42;
        double area = calcArea(radius);
        double diameter = calcDiameter(radius);
        double circumference = calcCircumference(radius);
        
        System.out.printf("Area of Circle = %5.1f%n", area);
        System.out.printf("Diameter of Circle = %5.1f%n", diameter);
        System.out.printf("Circumference of Circle =  %5.1f%n", circumference);     
     }
}