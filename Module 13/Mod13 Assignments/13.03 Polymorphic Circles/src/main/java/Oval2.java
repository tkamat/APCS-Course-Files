
/**
 * Oval class extends circle.
 *
 * @author R. Enger
 * @version 5/5/2007
 */
public class Oval2 extends Circle2 {

    // instance variables
    private int radius2;

    /**
     * Constructor for objects of class oval
     */
    public Oval2(int x, int y, int rad1, int rad2) {
        super(x, y, rad1);
        // initialise instance variables
        radius2 = rad2;
    }

    public int getRadius2() {

        return radius2;
    }
}
