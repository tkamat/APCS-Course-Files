
/**
 * BeadedJean2 is a BasicJean with beads designed in a pattern
 * 
 * ©FLVS 2007
 * @author R. Enger 
 * @version 6/1/2007
 */
public class BeadedJean2 extends BasicJean2
{
	// instance variables - replace the example below with your own
	private int numBeads;
	private String pattern;

	/**
	 * Constructor for objects of class beadedJean2
	 */
	public BeadedJean2(int np, int nb, int s)
	{
		// initialise instance variables
		super(np, s);
		numBeads = nb;
	}

	
    public void design()
    {
        if (numBeads == 10)
           pattern = "circle";
        else if (numBeads == 20)
            pattern = "heart";
        else if (numBeads == 30)
            pattern = "spiral";
        else 
            pattern = "random";
    }
    public int getNumBeads() 
    {
        return numBeads;
    }
    public String getPattern()
    {
        return pattern;
    }
    public String toString()
    {
        return "This pair of size " + getSize() + " Jeans uses " + numBeads + " in a " + pattern;
    }
    
    public boolean equals(BeadedJean2 obj) 
    {
        if ((compareTo(obj) == 0) && (pattern.equals(obj.pattern)))
            return true;
        else
            return false;
    }
}