
/**
 * The ShapesV1 class calcualtes the area and the
 * hypoteneuse of a triangle.
 * 
 * @author B. Jordan 
 * @version 05/31/07
 * Lesson: 08.06
 */
public class ShapesV1
{
    private int myBase;
    private int myHeight;
    
    ShapesV1(int b, int h)
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
    
    
}