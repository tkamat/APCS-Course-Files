/**
 * Box2 demo.
 * 
 * ©FLVS 2007
 * @author R. Enger 
 * @version 5/5/2007
 */
public class Box2 extends Rectangle2
{
	// instance variables 
	private int height;

	/**
	 * Constructor for objects of class box
	 */
	public Box2(int l, int w, int h)
	{
		// call superclass
		super(l, w);
	    // initialise instance variables
		height = h;
	}

	// return the height
	public int getHeight()
	{
		return height;
	}
	
	public String toString()
	{
	    return "The box's dimensions are " + getLength() + " X " + getWidth() + " X " + height;
	}

}
