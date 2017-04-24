
/**
 * This source file contains two separate classes: ShapesV1 and TriangleStatsTesterAlternative.
 * When you combine classes in one file, the file name must be the same as the name of the class 
 * containing the main() method.  And, the class with the main() method is public, but the others 
 * are not designated as public.
 * 
 * @author (B. Jordan 
 * @version 05/31/07
 * Lesson: 08.06
 */
class ShapesV2
{
    private int myBase;
    private int myHeight;
    
    ShapesV2(int b, int h)
    {
        myBase = b;
        myHeight = h;
    }
    
    public double calcTriArea()
    {
        return myBase * myHeight * .5;    
    }
    
    public double calcHypoteneuse()
    {
        return Math.sqrt(Math.pow(myBase, 2) + Math.pow(myHeight, 2));
    }   
}//end of the ShapesV2 class


public class TriangleStatsTesterAlternative
{
    public static void main(String[] args)
    {
        int base = 3;
        int height = 5;
        ShapesV2 shapes = new ShapesV2(base, height);
        
        //notice that the calcTriArea() method is invoked from within the argument of the print statement here.
        System.out.printf("Area = %4.1f%n", shapes.calcTriArea());
        
        //this is the way you have been invoking methods - assigning the returned value a variable, then printing the value of the variable. 
        double hypoteneuse = shapes.calcHypoteneuse();
        System.out.printf("Hypoeteneuse = %4.1f%n", hypoteneuse);
        
        //if the value returned is not needed again in the program, the first technique is more efficient,
        //but if the value returned is needed again by another method, use the second technique.
    }
}
