/**
 * Calculates the trajectory of a projectile based on angles and launch
 * velocities
 *
 * @version 10/14/16
 * @author Tushaar Kamat
 */

public class CatapultV2 {

    private int[] launchDegrees;
    private int[] launchSpeeds;

    /**
     * Constructor for the Catapult class
     *
     * @param launchDegrees
     *            An array containing the angles of elevation for each launch in
     *            degrees.
     * @param launchSpeeds
     *            An array containing the launch speeds in Miles Pre Hour
     */
    public CatapultV2(int[] launchDegrees, int[] launchSpeeds) {
        this.launchDegrees = launchDegrees;
        this.launchSpeeds = launchSpeeds;
    }

    /**
     * A static method to calculate the trajectory of an individual launch.
     *
     * @param launchSpeedMilesPerHour
     *            The speed launched in Miles Per Hour.
     * @param launchAngleDegrees
     *            The angle of elevation in degrees.
     * @return The trajectory in feet.
     */
    public double calcTrajectory(int launchSpeedMilesPerHour, int launchAngleDegrees) {
        double gravityAccel = 9.8;
        double launchSpeedMetersPerSecond = 0.44704 * launchSpeedMilesPerHour;
        double launchAngleRadians = Math.toRadians(launchAngleDegrees);
        double launchDistance = 3.2808
                * (Math.pow(launchSpeedMetersPerSecond, 2) * Math.sin(2 * launchAngleRadians) / gravityAccel);
        return launchDistance;
    }

    /**
     * A static method to process the data into an array, and print the results.
     *
     */
    public void processAndPrintResults() {
        double distances[][] = new double[launchSpeeds.length][launchDegrees.length];
        for (int row = 0; row < launchSpeeds.length; row++) {
            for (int col = 0; col < launchDegrees.length; col++) {
                distances[row][col] = calcTrajectory(launchSpeeds[row], launchDegrees[col]);
            }
        }

        System.out.printf("%60s%n", "Projectile Distance (feet)");
        System.out.printf("%6s", "MPH");
        for (int value : launchDegrees) {
            System.out.printf("%13s", value + " deg");
        }
        System.out.println();
        System.out.println(
                "=====================================================================================================================================");
        for (int row = 0; row < launchSpeeds.length; row++) {
            System.out.printf("%6d", launchSpeeds[row]);
            for (int col = 0; col < launchDegrees.length; col++) {
                System.out.printf("%13.3f", distances[row][col]);
            }
            System.out.println();
        }
    }
}
