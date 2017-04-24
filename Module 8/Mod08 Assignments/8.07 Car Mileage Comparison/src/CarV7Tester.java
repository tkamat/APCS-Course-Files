/**
 * Instantiates different car objects using the car class.
 *
 * @author Tushaar K.
 * @version 9/12/2016
 */
public class CarV7Tester {
	public static void main(String[] args) {
		//car 1 data
		String carType1 = "07 Hyundai Santa Fe";
		int startMiles1 = 131567, endMiles1 = 131836, distance1;
		double gallonsUsed1 = 15.3, pricePerGallon1 = 1.99, mPG1, gPM1, totalCost1;

		//car 2 data
		String carType2 = "13 Ferrari Italia";
		int startMiles2 = 75245, endMiles2 = 75514, distance2;
		double gallonsUsed2 = 18, pricePerGallon2 = 2.01, mPG2, gPM2, totalCost2;

		//car 3 data
		String carType3 = "16 Lexus CT ";
		int startMiles3 = 120002, endMiles3 = 120271, distance3;
		double gallonsUsed3 = 6.4, pricePerGallon3 = 2.03, mPG3, gPM3, totalCost3;


		//new objects
		CarV7 car1 = new CarV7(carType1, startMiles1, endMiles1, gallonsUsed1, pricePerGallon1);
		CarV7 car2 = new CarV7(carType2, startMiles2, endMiles2, gallonsUsed2, pricePerGallon2);
		CarV7 car3 = new CarV7(carType3, startMiles3, endMiles3, gallonsUsed3, pricePerGallon3);

		//call methods
		distance1 = car1.calcDistance();
		mPG1 = car1.calcMPG(distance1);
		gPM1 = car1.calcGPM(distance1);
		totalCost1 = car1.totalCost();

		distance2 = car2.calcDistance();
		mPG2 = car2.calcMPG(distance2);
		gPM2 = car2.calcGPM(distance2);
		totalCost2 = car2.totalCost();

		distance3 = car3.calcDistance();
		mPG3 = car3.calcMPG(distance3);
		gPM3 = car3.calcGPM(distance3);
		totalCost3 = car3.totalCost();

		//print table
		System.out.printf("%72s%n", "Gas Mileage Calculations");
		System.out.printf("%13s%23s%13s%12s%11s%9s%8s%13s%13s%n", "Type of Car", "Start Miles", "End Miles", "Distance",
				"Gallons", "Price", "Cost", "Miles/Gal", "Gal/Mile");
		System.out.println("========================================================================================" +
				"=============================");
		System.out.printf("%-19s%16d%13d%12d%11.1f%10.2f%9.2f%10.1f%13.3f%n",
				carType1, startMiles1, endMiles1, distance1, gallonsUsed1, pricePerGallon1, totalCost1, mPG1, gPM1);
		System.out.printf("%-19s%16d%13d%12d%11.1f%10.2f%9.2f%10.1f%13.3f%n",
				carType2, startMiles2, endMiles2, distance2, gallonsUsed2, pricePerGallon2, totalCost2, mPG2, gPM2);
		System.out.printf("%-19s%16d%13d%12d%11.1f%10.2f%9.2f%10.1f%13.3f%n",
				carType3, startMiles3, endMiles3, distance3, gallonsUsed3, pricePerGallon3, totalCost3, mPG3, gPM3);
	}
}