/**
 * Extends the Mountain Class to create a Winter Mountain.
 *
 * @author Tushaar Kamat
 * @version 11/12/2016
 */
public class WinterMountain extends Mountain {

    private double temperature;

    /**
     * Constructor for WinterMountain Class.
     */
    public WinterMountain(int l, int w, int mountains, double temperature) {
        super(l, w, mountains);
        this.temperature = temperature;
    }

    /**
     * @return the temperature
     */
    public double getTemperature() {
        return temperature;
    }
}