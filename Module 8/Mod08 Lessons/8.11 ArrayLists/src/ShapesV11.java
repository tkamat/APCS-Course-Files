
/**
 * This class instantiates shapes objects with four private instance variables.
 * It contains two mutator methods to calculate the area of a triangle and the
 * hypoteneuse of a triangle.  There are getter methods for each private instance
 * variable.
 * 
 * @author B. Jordan 
 * @version 06/01/07
 */
//import java.util.ArrayList;
class ShapesV11
{
    //declaration of private instance variables
    private int mySide1, mySide2;
    private double myArea, myHypoteneuse;
    
    
    //constructor for ojbects of type ShapesV8
    ShapesV11(int s1, int s2)
    {
        mySide1 = s1;
        mySide2 = s2;
        myArea = 0.0;
        myHypoteneuse = 0.0;
    }
    
    //mutator method to calculate the area of a triangle
    public double calcTriArea()
    {
        myArea = mySide1 * mySide2 * .5;
        return myArea;
    }
    
    //getter method to return the value of the area of a triangle
    public double getTriArea()
    {
        return myArea;
    }
    
    //mutator method to calculate the hypoteneuse of a triangle
    public void calcHypoteneuse()
    {
        myHypoteneuse = Math.sqrt(Math.pow(mySide1, 2) + Math.pow(mySide2, 2));
    }
    
    //getter method to return the value of the hypoteneuse of a triangle
    public double getHypoteneuse()
    {
        return myHypoteneuse;
    }
    
    //getter method to return the value of side 1 of a triangle
    public int getSide1()
    {
        return mySide1;
    }
    
    //getter method to return the value of side 2 of a triangle
    public int getSide2()
    {
        return mySide2;
    }
    
    
}    