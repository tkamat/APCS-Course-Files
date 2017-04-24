
/**
 * The purpose of this program is to calculate the hypoteneuse
 * of a triangle and its area.  All calculations are done within
 * methods.  An object is instantiated and all methods are invoked
 * on the object.
 * 
 * ©FLVS 2007
 * @author (your name) 
 * @version (a version number or a date)
 */

public class ShapesV3
{
    //default constructor
    ShapesV3()
    {
    }
    
    //calculate area of a triangle
    public double calcTriArea(int s1, int s2)
    {
        return s1 * s2 * .5;
    }
    //calculate the hypoteneuse of a right triangle
    public double calcHypoteneuse(int s1, int s2)
    {
        return Math.sqrt(Math.pow(s1, 2) + Math.pow(s2, 2));
    }
    
    //main method
    public static void main(String[] args)
    {
        //declaration of variables
        int side1, side2;
        double triArea, hypoteneuse;
        
        //initialization of variables
        side1 = 10; side2 = 5; 
        triArea = 0; hypoteneuse = 0; 
        
        ShapesV3 shapes = new ShapesV3();
        
        //call methods
        triArea = shapes.calcTriArea(side1, side2); 
        hypoteneuse = shapes.calcHypoteneuse(side1, side2);

        //print results
        System.out.printf(" Triangle Area = %8.2f%n", triArea);
        System.out.printf("   Hypoteneuse = %8.2f%n", hypoteneuse);
    }
}
