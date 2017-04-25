/**
 * Tests the Catapult class with sample data.
 *
 * @version 10/14/16
 * @author Tushaar Kamat
 */
public class CatapultTesterV2 {

    public static void main(String args[]) {
        int[] launchDegrees = { 0, 25, 35, 45, 50, 55, 65, 75, 85, 90 };
        int[] launchSpeeds = { 20, 25, 30, 35, 40, 45, 50, 100, 200 };
        CatapultV2 launches = new CatapultV2(launchDegrees, launchSpeeds);
        launches.processAndPrintResults();
    }
}
