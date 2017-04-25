
/**
 * This class tests the ShapesV8 class. 
 * An ArrayList of shapes objects is created to hold the four private instance variables.
 * The add() method is used to add the objects to the ArrayList as they are instantitated.
 * 
 * 
 * A for loop is used to call the calcTriArea() and calcHypoteneuse() methods on each object in the ArrayList.
 * A second for loop is used to print the values of the instance variables for each object.
 * 
 * @author B. Jordan 
 * @version 06/01/07
 */
import java.util.ArrayList;
public class ShapesV11Tester
{   
    public static void main(String[] args)
    {
        ArrayList<ShapesV11> shapes = new ArrayList<ShapesV11>();
        shapes.add(new ShapesV11(10, 5));
        shapes.add(new ShapesV11(7, 13));
        shapes.add(new ShapesV11(2, 4));
        shapes.add(new ShapesV11(28, 3));

        ShapesV11 dataRecord;                   //creates a new dataRecord object of type ShapesV11
        
        for(int index = 0; index < shapes.size(); index++)
        {
            dataRecord = shapes.get(index);
            dataRecord.calcTriArea();
            dataRecord.calcHypoteneuse();
        }
                
        //print table headings
        System.out.println("        Side 1    Side 2     Hypoteneuse       Area");
        
        //call methods
        for(int index = 0; index < shapes.size(); index++)
        {
            dataRecord = shapes.get(index);
            
            System.out.printf("%12d %9d %15.2f %12.2f%n", 
                      dataRecord.getSide1(), dataRecord.getSide2(), 
                      dataRecord.getHypoteneuse(), dataRecord.getTriArea());

        }
    }
}