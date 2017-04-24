/**
 * Extends Terrain Class to create mountain terrain.
 *
 * @author Tushaar Kamat
 * @version 11/12/2016
 */
public class Mountain extends Terrain {

    private int mountains;

    /**
     * Constructor for objects of class terrain.
     */
    public Mountain(int l, int w, int mountains) {
        super(l, w);
        this.mountains = mountains;
    }

    /**
     * @return the mountains.
     */
    public int getMountains() {
        return mountains;
    }
}