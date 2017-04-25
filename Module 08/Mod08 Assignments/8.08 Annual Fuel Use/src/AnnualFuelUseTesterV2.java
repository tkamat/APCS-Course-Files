/**
 * Tests the AnnualFuelUseV2 class with 3 fill-ups
 *
 * @author Tushaar K.
 * @version 9/13/2016
 */
public class AnnualFuelUseTesterV2 {

	public static void main(String[] args) {
		//local variables
		int distMin = Integer.MAX_VALUE;
		int distMax = Integer.MIN_VALUE;
		double minMPG = Double.MAX_VALUE;
		double maxMPG = Double.MIN_VALUE;
		double minPrice = Double.MAX_VALUE;
		double maxPrice = Double.MIN_VALUE;
		int distTotal = 0;
		double gallonTotal = 0.0;
		double costTotal = 0.0;
		double mPGTotal = 0.0;
		int distProjection = 0;
		double gallonProjection = 0.0;
		double mPGProjection = 0.0;
		double costProjection = 0.0;

		//sets array of fillUps
		AnnualFuelUseV2[] fillUps = {new AnnualFuelUseV2(1, 1, 131567, 131836, 17.6, 1.99),
				new AnnualFuelUseV2(2, 4, 131836, 132156, 19.9, 2.01),
				new AnnualFuelUseV2(3, 7, 132156, 132323, 15.61, 2.01)
		};

		//prints table header
		System.out.printf("%51s%n", "Gas Mileage Calculations");
		System.out.printf("%-7s%7s%6s%14s%12s%11s%10s%8s%7s%n", "Fill Up", "Days", "MPG", "Start Miles", "End Miles",
				"Distance", "Gallons", "Price", "Cost");

		//prints and calculates table data
		int i = 1;
		for (AnnualFuelUseV2 fillUp : fillUps) {
			fillUp.setMyDistance();
			fillUp.setMyGallons();
			fillUp.setMyCost();
			distMin = fillUp.findDistanceMin(distMin);
			distMax = fillUp.findDistanceMax(distMax);
			minMPG = fillUp.findMPGMin(minMPG);
			maxMPG = fillUp.findMPGMax(maxMPG);
			minPrice = fillUp.findPriceMin(minPrice);
			maxPrice = fillUp.findPriceMax(maxPrice);
			distTotal = fillUp.findDistanceTotal(distTotal);
			gallonTotal = fillUp.findGallonsTotal(gallonTotal);
			costTotal = fillUp.findCostTotal(costTotal);
			mPGTotal = fillUp.findMPGTotal(mPGTotal);
			distProjection = fillUp.findDistanceProjection(distTotal);
			gallonProjection = fillUp.findGallonsProjection(gallonTotal);
			mPGProjection = fillUp.findMPGProjection(mPGTotal);
			costProjection = fillUp.findCostProjection(costTotal);

			System.out.printf("%4d%9d%7.1f%12d%13d%9d%11.1f%9.2f%8.2f%n", fillUp.getMyFill(), fillUp.getMyDays(), fillUp.getMyMPG(),
					fillUp.getMyStartMiles(), fillUp.getMyEndMiles(), fillUp.getMyDistance(), fillUp.getMyGallons(),
					fillUp.getMyPrice(), fillUp.getMyCost());
			i++;
		}

		//prints minimums and maximums
		System.out.println();
		System.out.printf("%8s%12.1f%34d%20.2f%n", "Minimum:", minMPG,
				distMin, minPrice);
		System.out.printf("%8s%12.1f%34d%20.2f%n", "Maximum:", maxMPG,
				distMax, maxPrice);

		//prints totals and projections
		System.out.println();
		System.out.printf("%7s%47d%11.1f%17.2f%n", "Totals:", distTotal,
				gallonTotal, costTotal);
		System.out.printf("%11s%8.1f%34d%11.1f%18.2f%n", "Projections:", mPGProjection,
				distProjection, gallonProjection,
				costProjection);
	}
}