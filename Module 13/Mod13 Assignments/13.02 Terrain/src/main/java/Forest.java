/**
 * Extends the Terrain Class to create a Forest.
 *
 * @author Tushaar Kamat
 * @version 11/12/2016
 */

public class Forest extends Terrain {

    private int trees;

    /**
     * Constructor for the Forest Class
     */
    public Forest(int l, int w, int trees) {
        super(l, w);
        this.trees = trees;
    }

    /**
     * @return the trees
     */
    public int getTrees() {
        return trees;
    }
}