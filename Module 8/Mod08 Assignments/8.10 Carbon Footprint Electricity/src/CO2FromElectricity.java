/**
 * @purpose: Calculate yearly CO2 emissions from electricity (8.10)
 * @author: Tushaar K.
 * @version: 9/18/2016
 */

import java.util.ArrayList;

public class CO2FromElectricity

{
	CO2FromElectricity() {
		//default constructor to be used
	}

	/**
	 * A mutator method to calculate the average monthly electricity bill.
	 * @param monthlyBill an ArrayList containing the monthly bills for home electricity use.
	 * @return The average monthly electricity bill.
	 */
	public double calcAverageBill(ArrayList<Double> monthlyBill) {
		double sum = 0.0;
		double average = 0.0;
		for (double bill : monthlyBill) {
			sum += bill;
		}
		average = sum / monthlyBill.size();
		return average;
	}

	/**
	 * A mutator mrthod to calculate the average monthly price of electricity.
	 * @param monthlyPrice an ArrayList containing the monthly prices for home electricity use.
	 * @return The average monthly price for electricity,
	 */
	public double calcAveragePrice(ArrayList<Double> monthlyPrice) {
		double sum = 0.0;
		double average = 0.0;
		for (double bill : monthlyPrice) {
			sum += bill;
		}
		average = sum / monthlyPrice.size();
		return average;
	}

	/**
	 * A mutator method to calculate the CO2 emissions produced.
	 * @param avgBill the average monthly bill for home electricity usage.
	 * @param avgPrice the average monthly price for home electricity usage.
	 * @return The annual amount of C)2 emissions produced.
	 */
	public double calcElectricityCO2(double avgBill, double avgPrice) {
		double emissions = (avgBill / avgPrice) * 1.37 * 12;
		return emissions;
	}
}

