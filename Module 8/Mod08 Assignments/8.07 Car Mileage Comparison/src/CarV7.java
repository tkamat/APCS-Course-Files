/**
 * Calculates the fuel economy of the a cra object in terms of gallons per mile and the total cost for
 * one fill-up.
 *
 * @author Tushaar K.
 * @version 9/11/2016
 */
class CarV7 {

	//private instance variables
	private String myCarType;
	private int myStartMiles, myEndMiles;
	private double myGallonsUsed, myPricePerGallon;

	CarV7(String type, int sMiles, int eMiles, double gallons, double gallonPrice) {
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


}