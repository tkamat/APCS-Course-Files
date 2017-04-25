/**
 * @purpose: Calculate the CO2 from household waste 8.11
 * @author: Tushaar Kamat
 * @version: 9/19/16
 */

import java.util.ArrayList;

public class CO2FromWasteTester {

	public static void main(String[] args) {
		ArrayList<CO2FromWaste> cO2 = new ArrayList<CO2FromWaste>();
		cO2.add(new CO2FromWaste(4, true, true, true, true));
		cO2.add(new CO2FromWaste(1, false, false, false, false));
		cO2.add(new CO2FromWaste(2, true, false, true, true));
		cO2.add(new CO2FromWaste(3, false, false, false, true));
		cO2.add(new CO2FromWaste(7, true, true, true, false));
		cO2.add(new CO2FromWaste(2, false, true, false, false));

		for (CO2FromWaste dataRecord : cO2) {
			dataRecord.calcGrossWasteEmission();
			dataRecord.calcWasteReduction();
			dataRecord.calcNetWasteReduction();
		}

		System.out.println("|       |        |                                         |             Pounds of CO2             |");
		System.out.println("|       |        |       Household Waste Recycled          |   Total    |             |     Net    |");
		System.out.println("| Index | People |  Paper   |  Plastic |  Glass  |  Cans   |  Emission  |  Reduction  |  Emission  |");
		System.out.println("|-------|--------|----------|----------|---------|---------|------------|-------------|------------|");

		CO2FromWaste dataRecord;

		for (int index = 0; index < cO2.size(); index++) {
			dataRecord = cO2.get(index);
			System.out.printf("|   %1d   |    %2d  |   %-5b  |  %-5b   |  %-5b  |  %-5b  |  %8.2f  |   %7.2f   |   %8.2f |%n", index, dataRecord.getNumPeople(), dataRecord.getPaper(), dataRecord.getPlastic(), dataRecord.getGlass(), dataRecord.getCans(), dataRecord.getEmissions(), dataRecord.getReduction(), dataRecord.getNetEmissions());
		}
	}
}

