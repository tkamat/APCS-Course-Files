
/**
 * This class tests the ShapesV8 class. 
 * 
 * An array of shapes objects is created to hold the four private instance variables.
 * 
 * A for loop is used to call the calcTriArea() and calcHypoteneuse() methods on each object.
 * A second for loop is used to print the values of the instance variables for each object.
 * 
 * @author B. Jordan 
 * @version 06/01/07
 */

public class ShapesV9aTester
{   
    public static void main(String[] args)
    {
        //declaration of variables
        int side1A, side2A, side1B, side2B; 
        double hypoteneuseA, triAreaA, hypoteneuseB, triAreaB;
        
        //initialization of array of objects
        ShapesV9a[] shapes = {new ShapesV9a(10, 5),
                             new ShapesV9a(7, 13)};
        
        //call methods
        for(int index = 0; index < shapes.length; index++)
        {
            shapes[index].calcTriArea();
            shapes[index].calcHypoteneuse();
        }
                
        //print results
        System.out.println("        Side 1    Side 2     Hypoteneuse       Area");
        for(int index = 0; index < shapes.length; index++)
        {
            System.out.printf("%12d %9d %14.1f %13.1f%n", 
                      shapes[index].getSide1(), shapes[index].getSide2(), 
                      shapes[index].getHypoteneuse(), shapes[index].getTriArea());
        }
    }
}