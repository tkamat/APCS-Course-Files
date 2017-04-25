
/**
 * This class instantiates shapes objects with four private instance variables.
 * It contains two mutator methods to calculate the area of a triangle and the
 * hypoteneuse of a triangle.  There are getter methods for each private instance
 * variable. Private instance variables include mySide1, mySide2, myArea, and myHypoteneuse.
 * 
 * @author B. Jordan 
 * @version 06/01/07
 */
class ShapesV9b
{   
    /**
     * Default constructor for ojbects of type ShapesV9
     */
    ShapesV9b()
    {
    }
    
    /**
     * Accessor method to calculate and return the area of a triangle. 
     * @param s1 side 1 of a triangle.
     * @param s2 side 2 of a triangle,
     * @return the area of a triangle.
     */
    public double calcTriArea(int s1, int s2)
    {
        return s1 * s2 * .5;
    }
       
    /** 
     * Accessor method to calculate and return the hypoteneuse of a triangle.
     * @param s1 side 1 of a triangle.
     * @param s2 side 2 of a triangle,
     * @return the hypoteneuse of a triangle.
     */
    public double calcHypoteneuse(int s1, int s2)
    {
        return Math.sqrt(Math.pow(s1, 2) + Math.pow(s2, 2));
    }
}    