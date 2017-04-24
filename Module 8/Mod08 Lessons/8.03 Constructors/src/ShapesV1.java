
/**
 * The purpose of this program is to calculate the hypoteneuse
 * of a triangle and its area.  All calculations are done within
 * the main method.
 * 
 * ©FLVS 2007
 * @author B. Jordan 
 * @version 5/20/07
 * Lesson: 08.03
 */

public class ShapesV1
{
    //main method
    public static void main(String[] args)
    {
        //declaration of variables
        int side1, side2;
        double triArea, hypoteneuse;
        
        //initialization of variables
        side1 = 10; side2 = 5; 
        triArea = 0; hypoteneuse = 0;
        
        //calculations
        triArea = side1 * side2 * .5;
        hypoteneuse = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
        
        //print results
        System.out.printf(" Triangle Area = %8.2f%n", triArea);
        System.out.printf("   Hypoteneuse = %8.2f%n", hypoteneuse);
     
    }
}
