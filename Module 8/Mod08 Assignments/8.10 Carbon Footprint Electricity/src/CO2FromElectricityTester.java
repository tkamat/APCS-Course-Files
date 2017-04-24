/**
 * @purpose: Calculate yearly CO2 emissions from electricity 8.10
 * @author: Tushaar K.
 * @version: 9/18/2016
 */

import java.util.ArrayList;

public class CO2FromElectricityTester {
	public static void main(String[] args) {
		CO2FromElectricity CO2 = new CO2FromElectricity();

		ArrayList<Double> monthlyBill = new ArrayList<Double>(3);
		ArrayList<Double> monthlyPrice = new ArrayList<Double>(3);

		double[] billArray = {117.11, 105.21, 112.19};
		double[] priceArray = {(117.11 / 1029), (105.21 / 926), (112.19 / 985)};

		for (int i = 0; i < billArray.length; i++) {
			monthlyBill.add(i, billArray[i]);
		}

		for (int i = 0; i < billArray.length; i++) {
			monthlyPrice.add(i, priceArray[i]);
		}

		double avgBill = CO2.calcAverageBill(monthlyBill);
		double avgPrice = CO2.calcAveragePrice(monthlyPrice);

		double emissions = CO2.calcElectricityCO2(avgBill, avgPrice);

		System.out.printf("Average Monthly Electricity Bill: %6.2f%n", avgBill);
		System.out.printf("Average Monthly Electricity Price: %4.2f%n", avgPrice);
		System.out.printf("Annual CO2 Emissions from Electricity Usage:   %7.1f pounds", emissions);
	}
}

