
/**
 * OvalCylinder class extends Oval.
 * 
 * ©FLVS 2007
 * @author R. Enger 
 * @version 5/5/2007
 */
public class OvalCylinder extends Oval
{
	// instance variables 
	private int height;

	/**
	 * Constructor for objects of class ovalCylinder
	 */
	public OvalCylinder(int x, int y, int rad1, int rad2, int h)
	{
		super(x, y, rad1, rad2);
	    // initialise instance variables
		height = h;
	}

	
	public int getHeight()
	{
		
		return height;
	}
}
