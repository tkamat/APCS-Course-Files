/**
 * Calculates the fuel economy of the family car in terms of gallons per mile and the total cost for
 * one fill-up.
 *
 * @author Tushaar K.
 * @version 9/11/2016
 */
public class CarV5 {

	//private instance variables
	private String myCarType;
	private int myStartMiles, myEndMiles;
	private double myGallonsUsed, myPricePerGallon;

	CarV5(String type, int sMiles, int eMiles, double gallons, double gallonPrice) {
		myCarType = type;
		myStartMiles = sMiles;
		myEndMiles = eMiles;
		myGallonsUsed = gallons;
		myPricePerGallon = gallonPrice;
	}

	//calculates the distance driven
	public int calcDistance() {
		return myEndMiles - myStartMiles;
	}

	//calculates the miles per gallon
	public double calcMPG(int dist) {
		return dist / myGallonsUsed;
	}

	//calculates gallons per mile
	public double calcGPM(int dist) {
		return myGallonsUsed / dist;
	}

	public double totalCost() {
		return myPricePerGallon * myGallonsUsed;
	}

	public static void main(String[] args) {
		int startMiles1 = 131567, endMiles1 = 131836, distance1;
		double gallonsUsed1 = 15.3, pricePerGallon1 = 1.99, mPG1, gPM1, totalCost1;
		String carType1 = "07 Hyundai Santa Fe";

		//new car1 object
		CarV5 car1 = new CarV5(carType1, startMiles1, endMiles1, gallonsUsed1, pricePerGallon1);

		//call methods
		distance1 = car1.calcDistance();
		mPG1 = car1.calcMPG(distance1);
		gPM1 = car1.calcGPM(distance1);
		totalCost1 = car1.totalCost();

		//print table
		System.out.printf("%72s%n", "Gas Mileage Calculations");
		System.out.printf("%13s%23s%13s%12s%11s%9s%8s%13s%13s%n", "Type of Car", "Start Miles", "End Miles", "Distance",
				"Gallons", "Price", "Cost", "Miles/Gal", "Gal/Mile");
		System.out.println("========================================================================================" +
				"=============================");
		System.out.printf("%13s%16d%13d%12d%11.1f%10.2f%9.2f%10.1f%13.3f%n",
				carType1, startMiles1, endMiles1, distance1, gallonsUsed1, pricePerGallon1, totalCost1, mPG1, gPM1);
	}
}