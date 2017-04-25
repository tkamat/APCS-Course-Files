
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

public class ShapesV9bTester
{   
    public static void main(String[] args)
    {
        //declaration of variables
        int side1A = 10;
        int side2A = 5;
        int side1B = 7;
        int side2B = 13; 
        double hypoteneuseA = 0;
        double triAreaA = 0;
        double hypoteneuseB = 0;
        double triAreaB = 0;
        
        //Invoke default constructor
        ShapesV9b shapesB = new ShapesV9b();
        
        //call methods
        triAreaA = shapesB.calcTriArea(side1A, side2A);
        hypoteneuseA = shapesB.calcHypoteneuse(side1A, side2A);
        triAreaB = shapesB.calcTriArea(side1B, side2B);
        hypoteneuseB = shapesB.calcHypoteneuse(side1B, side2B);

                
        //print results
        System.out.println("        Side 1    Side 2     Hypoteneuse       Area");

            System.out.printf("%12d %9d %14.1f %13.1f%n", side1A, side2A, hypoteneuseA, triAreaA);
            System.out.printf("%12d %9d %14.1f %13.1f%n", side1B, side2B, hypoteneuseB, triAreaB);
        
    }
}