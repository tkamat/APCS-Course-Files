
/**
 * This class contains the main method and creates an object of the ShapesV1 class.
 * The value of the base and height are passed to the private instance variables 
 * when the shapes object is constructed.
 * 
 * Notice that two different ways of dealing with the returned value are illustrated.
 * 
 * @author B. Jordan 
 * @version 05/29/07
 * Lesson: 08.06
 */
public class TriangleStatsTester
{
    public static void main(String[] args)
    {
        int base = 3;
        int height = 5;
        ShapesV1 shapes = new ShapesV1(base, height);
        
        //notice that the calcTriArea() method is invoked from within the argument of the print statement here.
        System.out.printf("Area = %4.1f%n", shapes.calcTriArea());
        
        //this is the way you have been invoking methods - assigning the returned value a variable, then printing the value of the variable. 
        double hypoteneuse = shapes.calcHypoteneuse();
        System.out.printf("Hypoeteneuse = %4.1f%n", hypoteneuse);
        
        //if the value returned is not needed again in the program, the first technique is more efficient,
        //but if the value returned is needed again by another method, use the second technique.
    }
}
