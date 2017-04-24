
/**
 * The purpose of this program is to calculate the hypoteneuse
 * of a triangle and its area.  All calculations are done within
 * static methods which are invoked from the main method.
 * 
 * ©FLVS 2007
 * @author B. Jordan 
 * @version 5/20/07
 * Lesson: 08.03
 */

public class ShapesV2
{
    //calculate area of a triangle
    public static double calcTriArea(int s1, int s2)
    {
        return s1 * s2 * .5;
    }
    
    //calculate hypoteneuse
    public static double calcHypoteneuse(int s1, int s2)
    {
        return Math.sqrt(Math.pow(s1, 2) + Math.pow(s2, 2));
    }
    
    //main method
    public static void main(String[] args)
    {
        //declaration of variables
        int side1, side2, radius;
        double triArea, hypoteneuse;
        
        //initialization of variables
        side1 = 10; side2 = 5;
        triArea = 0; hypoteneuse = 0;
        
        //call methods
        triArea = calcTriArea(side1, side2);
        hypoteneuse = calcHypoteneuse(side1, side2);

        //print results
        System.out.printf(" Triangle Area = %8.2f%n", triArea);
        System.out.printf("   Hypoteneuse = %8.2f%n", hypoteneuse);
     
    }
}
