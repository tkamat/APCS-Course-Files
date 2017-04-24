/**
 * Tests the terrain classes.
 *
 * @author Tushaar Kamat
 * @version 11/12/2016
 */
public class TestTerrain {

    public static void main(String args[]) {
        Forest fLand = new Forest(100, 200, 100);
        Mountain mLand = new Mountain(300, 400, 25);
        WinterMountain wmLand = new WinterMountain(500, 600, 15, 10.0);

        System.out.println("Forest " + fLand.terrainSize() + " and has " + fLand.getTrees() + " trees.");
        System.out.println("Mountain " + mLand.terrainSize() + " and has " + mLand.getMountains() + " mountains.");
        System.out.println("Winter Mountain " + wmLand.terrainSize() + " and has temperature " + wmLand.getTemperature()
                + " and " + wmLand.getMountains() + " mountains.");
    }
}