
/**
 * test2 program for square - box
 * 
 * ©FLVS 2007
 * @author R. Enger 
 * @version 5/5/2007
 */
public class Test2
{
	public static void main (String []args)
	{
	    Rectangle one = new Rectangle(2, 4);
	    Box two = new Box(4,10,4);
	    
	    polyMorph(one);
	    System.out.println();
	    polyMorph(two);
	    
	    
	}
	
	public static void polyMorph(Rectangle r)
	{
	    System.out.println("For " + r.getClass().getName() + " : ");
	    System.out.println("The length is  " + r.getLength() );
	    System.out.println("The width is " + r.getWidth()); 

	}
}
