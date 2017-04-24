/**
 * FadedJean is a basic pair of jeans
 * <p>
 * �FLVS 2007
 *
 * @author R. Enger
 * @version 5/10/2007
 */
public class FadedJean extends BasicJean implements JeanEffects {

    // instance variables - replace the example below with your own
    private String fadeLocation;

    /**
     * Constructor for objects of class fadedJean
     */

    public FadedJean(int n) {
        // initialise instance variables
        super(n);
    }

    public void design() {
        fadeJeans();
    }

    public void fadeJeans() {
        fadeLocation = "knees";
    }

    public void addHoles() {
        // do nothing
    }

    public String toString() {
        return "This pair of jeans has " + getNumPockets() + " pockets" + "\n and has faded " + fadeLocation;
    }

}