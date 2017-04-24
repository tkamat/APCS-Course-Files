/**
 * Tests the CO@FootprintV1 Class.
 *
 * @author Tushaar K.
 * @version 9/14/2016
 */
public class CO2FootprintV1Tester {

	public static void main(String[] args) {

		//local variables and objects
		double gallonsUsed = 2132.0;
		CO2FootprintV1 emissions = new CO2FootprintV1(gallonsUsed);

		//calculate values
		emissions.calcTonsCO2();
		emissions.convertTonsToPoundsCO2();

		//print results
		System.out.printf("%32s%n", "CO2 Emissions");
		System.out.printf("%16s%16s%16s%n", "Gallons of Gas", "Pounds of Gas", "Tons from Gas");
		System.out.println("**************************************************");
		System.out.printf("%12.1f%17.2f%16.3f%n", gallonsUsed, emissions.getPoundsCO2(), emissions.getTonsCO2());
	}
}