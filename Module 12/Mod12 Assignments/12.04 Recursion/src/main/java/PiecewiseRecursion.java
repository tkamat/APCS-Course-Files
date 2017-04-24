
/**
 * Translates Piecewise Functions into recursive methods.
 *
 * @author Tushaar Kamat
 * @version 10/29/16
 */

public class PiecewiseRecursion {

    /**
     * Solves Question 1
     *
     * @param x
     * @return f(x)
     */
    public int solvePiecewise1(int x) {
        if (x <= 10) {
            return -7;
        }
        else {
            return solvePiecewise1(x - 4) + 2;
        }
    }

    /**
     * Solves Question 2
     *
     * @param x
     * @return f(x)
     */
    public int solvePiecewise2(int x) {
        if (x <= 25) {
            return 20;
        }
        else {
            return solvePiecewise2(x / 12 + 5) - 3;
        }
    }

    /**
     * Solves Question 4
     *
     * @param x
     * @return f(x)
     */
    public int solvePiecewise4(int x) {
        if (x > 20) {
            return -100;
        }
        else {
            return solvePiecewise4(x * 2) - 4;
        }
    }
}