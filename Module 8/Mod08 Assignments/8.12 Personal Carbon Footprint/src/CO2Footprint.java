/**
 * @author Tushaar K.
 * @version 9/19/2016
 * @purpose Finds the annual carbon footprint of a person based on gas, electricity, recycling, and light bulbs.
 */
public class CO2Footprint {

    private double myGasUsed, myElectricityBill, myElectricityPrice, myCO2GasTons, myCO2Gas, myCO2Electricity,
        myCO2Waste, myReductionWaste, myReductionBulbs, myCO2Bulbs, myCO2Footprint;
    private int myPeople, myBulbsReplaced;
    private boolean myPaper, myPlastic, myGlass, myCans;

    /**
     * Constructor for objects of type CO2Footprint.
     *
     * @param gas      annual amount of gas used
     * @param avgBill  monthly average electricity bill.
     * @param avgPrice monthly average price.
     * @param people   number of people in the household.
     * @param paper    recycles paper.
     * @param plastic  recycles plastic.
     * @param glass    recycles glass.
     * @param cans     recycles cans.
     * @param bulbs    how many light bulbs changed to incandescent.
     */
    public CO2Footprint(double gas, double avgBill, double avgPrice, int people, boolean paper, boolean plastic,
                        boolean glass, boolean cans, int bulbs) {
        myGasUsed = gas;
        myElectricityBill = avgBill;
        myElectricityPrice = avgPrice;
        myPeople = people;
        myPaper = paper;
        myPlastic = plastic;
        myGlass = glass;
        myCans = cans;
        myBulbsReplaced = bulbs;
        myCO2Gas = 0.0;
        myCO2Electricity = 0.0;
        myCO2Waste = 0.0;
        myReductionWaste = 0.0;
        myReductionBulbs = 0.0;
        myCO2Footprint = 0.0;
    }

    /**
     * Mutator method to calculate how many tons of CO2 are emitted for the gallons of gas used (no parameters).
     */
    public void calcTonsCO2() {
        myCO2GasTons = 8.78E-3 * myGasUsed;
    }

    /**
     * Mutator method to convert tons to pounds of CO2 (no parameters).
     */
    public void convertTonsToPoundsCO2() {
        myCO2Gas = 2204.62 * myCO2GasTons;
    }

    /**
     * Mutator method to calculate the CO2 emissions produced (no parameters).
     */
    public void calcElectricityCO2() {
        myCO2Electricity = (myElectricityBill / myElectricityPrice) * 1.37 * 12;
    }

    /**
     * Mutator method to calculate the total emissions, without any recycling (no parameters).
     */
    public void calcGrossWasteEmission() {
        myCO2Waste = 1018 * myPeople;
    }

    /**
     * Mutator method to calculate the emission reduction from recycling (no parameters).
     */
    public void calcWasteReduction() {
        if (myPaper) {
            myReductionWaste += (184.0 * myPeople);
        }

        if (myPlastic) {
            myReductionWaste += (25.6 * myPeople);
        }

        if (myGlass) {
            myReductionWaste += (46.6 * myPeople);
        }

        if (myCans) {
            myReductionWaste += (165.8 * myPeople);
        }

    }

    /**
     * Mutator method to calculate the emission reduction from replacing lightbulbs (no parameters).
     */
    public void calcBulbReduction() {
        myReductionBulbs = myBulbsReplaced * 1.37 * 73;
    }

    /**
     * Mutator method to calculate the total carbon footprint (no parameters).
     */
    public void calcCO2Footprint() {
        myCO2Footprint = (myCO2Gas + myCO2Electricity + myCO2Waste) - (myReductionWaste + myReductionBulbs);
    }

    /**
     * Getter method to return myCO2Gas
     *
     * @return pounds of CO2
     */
    public double getMyCO2Gas() {
        return myCO2Gas;
    }

    /**
     * Getter method to return myCO2Electricity
     *
     * @return pounds of CO2
     */
    public double getMyCO2Electricity() {
        return myCO2Electricity;
    }

    /**
     * Getter method to return myCO2Waste
     *
     * @return pounds of CO2
     */
    public double getMyCO2Waste() {
        return myCO2Waste;
    }

    /**
     * Getter method to return myReductionWaste
     *
     * @return pounds of CO2 reduced
     */
    public double getMyReductionWaste() {
        return myReductionWaste;
    }

    /**
     * Getter method to return myReductionBulbs
     *
     * @return pounds of CO2 reduced
     */
    public double getMyReductionBulbs() {
        return myReductionBulbs;
    }

    /**
     * Getter method to return myCO2Footprint
     *
     * @return pounds of CO2
     */
    public double getMyCO2Footprint() {
        return myCO2Footprint;
    }
}
