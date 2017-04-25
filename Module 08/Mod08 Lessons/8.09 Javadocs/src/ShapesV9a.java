
/**
 * This class instantiates shapes objects with four private instance variables.
 * It contains two mutator methods to calculate the area of a triangle and the
 * hypoteneuse of a triangle.  There are getter methods for each private instance
 * variable. Private instance variables include mySide1, mySide2, myArea, and myHypoteneuse.
 * 
 * @author B. Jordan 
 * @version 06/01/07
 */
class ShapesV9a
{
    //declaration of private instance variables
    private int mySide1;            //side 1 of a triangle
    private int mySide2;            //side 2 of a triangle
    private double myArea;          //area of a triangle
    private double myHypoteneuse;   //hypoteneuse of a triangle
    
    /**
     * Constructor for ojbects of type ShapesV9
     * @param s1 side 1 of a triangle
     * @param s2 side 2 of a triangle
     */
    ShapesV9a(int s1, int s2)
    {
        mySide1 = s1;
        mySide2 = s2;
        myArea = 0.0;
        myHypoteneuse = 0.0;
    }
    
    /**
     * Mutator method to calculate the area of a triangle (no paramters). 
     */
    public void calcTriArea()
    {
        myArea = mySide1 * mySide2 * .5;
    }
    
    /**
     * Getter method to return the value of the area of a triangle (no paramters).
     * @return the area of a triangle.
     */
    public double getTriArea()
    {
        return myArea;
    }
    
    /** 
     * Mutator method to calculate the hypoteneuse of a triangle (no paramters).
     */
    public void calcHypoteneuse()
    {
        myHypoteneuse = Math.sqrt(Math.pow(mySide1, 2) + Math.pow(mySide2, 2));
    }
    
    /**
     * Getter method to return the value of the hypoteneuse of a triangle (no paramters).
     * @return the hypotenenuse of a triagnle.
     */
    public double getHypoteneuse()
    {
        return myHypoteneuse;
    }
    
    /**
     * Getter method to return the value of side 1 of a triangle (no paramters).
     * @return side 1 of a triangle.
     */
    public int getSide1()
    {
        return mySide1;
    }
    
    /**
     * Getter method to return the value of side 2 of a triangle (no paramters).
     * @return side 2 of a triangle.
     */
    public int getSide2()
    {
        return mySide2;
    }
}    