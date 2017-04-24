
/**
 * BasicJean2 is a basic pair of jeans
 * 
 * ©FLVS 2007
 * @author R. Enger 
 * @version 6/1/2007
 */
public abstract class BasicJean2 implements Comparable<BasicJean2>
{
	// instance variables - replace the example below with your own
	private int numPockets;
	private int pantSize;

	/**
	 * Constructor for objects of class basicJean
	 */
	public BasicJean2(int n, int s)
	{
		// initialise instance variables
		numPockets = n;
		pantSize = s;
	}
    public abstract void design();
	
	public int getNumPockets()
	{
		return numPockets;
	}
	public void setNumPockets(int n)
	{
	    numPockets = n;
	}
	public int getSize()
	{
	    return pantSize;
	}
	public int compareTo(BasicJean2 obj)
	{
	    if (pantSize < obj.pantSize)
	        return -1;
	    else if (pantSize == obj.pantSize)
	        return 0;
	    else
	        return 1;
	}
	
}
