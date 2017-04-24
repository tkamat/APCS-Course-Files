/**
 * This program uses methods to calculate the volume of a cylinder.
 * Also illustrates use of Math class methods.
 * 
 * ©FLVS 2007
 * @author B. Jordan 
 * @version 05/12/07
 */
public class CylinderVolume
{   
    //calculate the area of a circle
    public static double calcCircleArea(double r)
    {
        return Math.PI * Math.pow(r, 2);
    }
    
    //calculate the volume of a cylnder
    public static double calcCylinderVol(double a, double h)
    {
        return a * h;
    }

    public static void main(String[ ] args)
    {
        double radius = 1.0;
        double height = 1;

        double area = calcCircleArea(radius);
        double cylinderVol = calcCylinderVol(area, height);
        System.out.println("Cylinder Volume = " + cylinderVol);     
     }
}
