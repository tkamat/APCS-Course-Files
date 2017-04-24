/**
 * Calculates the fuel economy of the family car for one fill-up
 *
 * @author Tushaar
 * @version 9/7/2016
 */
public class CarV3 {

	//default constructor
	CarV3() {
	}

	//calculates the distance driven
	public int calcDistance(int sMiles, int eMiles) {
		return eMiles - sMiles;
	}

	//calculates the miles per gallon
	public double calcMPG(int dist, double gals) {
		return dist / gals;
	}

	public static void main(String[] args) {
		int startMiles1 = 131567, endMiles1 = 131836, distance1;
		double gallons1 = 15.3, mPG1;
		String carType = "07 Hyundai Santa Fe";

		//new car1 object
		CarV3 car1 = new CarV3();

		distance1 = car1.calcDistance(startMiles1, endMiles1);
		mPG1 = car1.calcMPG(distance1, gallons1);

		System.out.printf("%51s%n", "Gas Mileage Calculations");
		System.out.printf("%13s%23s%13s%12s%11s%13s%n", "Type of Car", "Start Miles", "End Miles", "Distance",
				"Gallons", "Miles/Gal");
		System.out.println("=======================================================================================");
		System.out.printf("%13s%16d%13d%12d%11.1f%13.1f%n", carType, startMiles1, endMiles1, distance1, gallons1, mPG1);
	}
}