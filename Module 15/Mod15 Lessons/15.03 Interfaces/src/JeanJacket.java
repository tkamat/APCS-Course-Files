
/**
 * jeanJacket
 * 
 * ©FLVS 2007
 * @author R. Enger 
 * @version 5/10/2007
 */
public class JeanJacket implements JeanEffects
{
	// instance variables - replace the example below with your own
	private int numBeads;
	private String pattern;
	private String holeLocation;
	private String fadeLevel;

	/**
	 * Constructor for objects of class jeanJacket
	 */
	public JeanJacket(int nb)
	{
		// initialise instance variables
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
        String out =  "This jacket has " + numBeads + " beads in a " + pattern + " with ";
        out = out + "\na fade level of " + fadeLevel + " and holes in the " + holeLocation;
        return out;
    }
    public void fadeJeans()
    {
        fadeLevel = "moderate";
    }
    public void addHoles()
    {
        holeLocation = "elbows";
    }
}
