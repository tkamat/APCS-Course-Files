/**
 * Projects annual fuel usage based on at least three fill ups of the family car.
 *
 * @author Tushaar K.
 * @version 9/13/2016
 */
public class AnnualFuelUseV2 {

	//private instance variables
	private int myDays, myStartMiles, myEndMiles, myDistance, myFill;
	private double myGallons, myMPG, myPrice, myCost;

	//constructor
	AnnualFuelUseV2(int fill, int days, int sMiles, int eMiles, double mPG, double price) {
		myFill = fill;
		myDays = days;
		myStartMiles = sMiles;
		myEndMiles = eMiles;
		myMPG = mPG;
		myPrice = price;
		myDistance = 0;
		myGallons = 0.0;
		myCost = 0.0;
	}

	//method to set distance
	public void setMyDistance() {
		myDistance = myEndMiles - myStartMiles;
	}

	//method to set gallons
	public void setMyGallons() {
		setMyDistance();
		myGallons = myDistance / myMPG;
	}

	//method to set price
	public void setMyCost() {
		setMyGallons();
		myCost = myPrice * myGallons;
	}

	//method to get distance
	public int getMyDistance() {
		return myDistance;
	}

	//method to get MPG
	public double getMyMPG() {
		return myMPG;
	}

	//method to get price
	public double getMyPrice() {
		return myPrice;
	}

	//method to get gallons
	public double getMyGallons() {
		return myGallons;
	}

	//method to get costs
	public double getMyCost() {
		return myCost;
	}

	//method to get days
	public int getMyDays() {
		return myDays;
	}

	//method to get start miles
	public int getMyStartMiles() {
		return myStartMiles;
	}

	//method to get end miles
	public int getMyEndMiles() {
		return myEndMiles;
	}

	//method to get fill
	public int getMyFill() {
		return myFill;
	}

	//finds minimum of distance
	public int findDistanceMin(int min) {
		if (myDistance < min) {
			min = myDistance;
		}
		return min;
	}

	//finds maximum of distance
	public int findDistanceMax(int max) {
		if (myDistance > max) {
				max = myDistance;
			}
		return max;
	}

	//finds minimum of MPG
	public double findMPGMin(double min) {
		if (myMPG < min) {
				min = myMPG;
			}
		return min;
	}

	//finds the maximum of MPG
	public double findMPGMax(double max) {
		if (myMPG > max) {
				max = myMPG;
			}
		return max;
	}

	//finds minimum of price
	public double findPriceMin(double min) {
		if (myPrice < min) {
				min = myPrice;
			}
		return min;
	}

	//finds the maximum of price
	public double findPriceMax(double max) {
		if (myPrice > max) {
				max = myPrice;
			}
		return max;
	}

	//finds the distance total
	public int findDistanceTotal(int sum) {
		sum += myDistance;
		return sum;
	}

	//finds the gallons total
	public double findGallonsTotal(double sum) {
		sum += myGallons;
		return sum;
	}

	//finds the cost total
	public double findCostTotal(double sum) {
		sum += myCost;
		return sum;
	}

	//find the mpg total
	public double findMPGTotal(double sum) {
		sum += myMPG;
		return sum;
	}

	//finds annual projection for distance
	public int findDistanceProjection(int distanceTotal) {
		return (365 / myDays) * distanceTotal;
	}

	//finds annual projection for gallons
	public double findGallonsProjection(double gallonsTotal) {
		return (365 / myDays) * gallonsTotal;
	}

	//finds annual projection for MPG
	public double findMPGProjection(double mPGTotal) {
		return mPGTotal / myFill;
	}

	//finds annual projection for cost
	public double findCostProjection(double costTotal) {
		return  (365 / myDays) * costTotal;

	}
}