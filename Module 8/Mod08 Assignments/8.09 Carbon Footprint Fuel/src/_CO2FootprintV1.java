/**
 * Calculates the amount of carbon dioxide emitted for each gallon of gas consumed.
 *
 * @author Tushaar K.
 * @version 9/14/2016
 */
class CO2FootprintV1 {

	//private instance variables
	private double gallonsUsed;
	private double tonsCO2;
	private double poundsCO2;

	/**
	 * Constructor for objects of type CO2FootprintV1.
	 * @param gallonsUsed amount of gallons used
	 */
	CO2FootprintV1(double gallonsUsed) {
		this.gallonsUsed = gallonsUsed;
		this.tonsCO2 = 0.0;
		this.poundsCO2 = 0.0;
	}

	/**
	 * Mutator method to calculate how many tons of CO2 are emitted for the gallons of gas used.
	 */
	public void calcTonsCO2() {
		this.tonsCO2 = 8.78E-3 * this.gallonsUsed;
	}

	/**
	 * Mutator method to convert tons to pounds of CO2.
	 */
	public void convertTonsToPoundsCO2() {
		this.poundsCO2 = 2204.62 * this.tonsCO2;
	}

	/**
	 * Getter method to return the value of tons of CO2.
	 * @return tons of CO2
	 */
	public double getTonsCO2() {
		return this.tonsCO2;
	}

	/**
	 * Getter method to return value of pounds of CO2.
	 * @return pounds of CO2
	 */
	public double getPoundsCO2() {
		return this.poundsCO2;
	}
}