/**
 * Represents a dispenser using the number of items and cost
 *
 * @author Tushaar Kamat
 * @version 03/31/2017
 */
public class Dispenser {
    private int numberOfItems;
    private int cost;

    /**
     * Default constructor
     */
    public Dispenser() {
        numberOfItems = 50;
        cost = 50;
    }

    /**
     * @param numberOfItems
     * @param cost
     */
    public Dispenser(int numberOfItems, int cost) {
        if (numberOfItems < 0 || cost < 0)
            throw new IllegalArgumentException("Negative numbers are not allowed!");
        this.numberOfItems = numberOfItems;
        this.cost = cost;
    }

    public void makeSale() {
        numberOfItems--;
    }


    @Override
    public String toString() {
        return numberOfItems + " items costing " + cost + " cents each.";
    }

    /**
     * @return the numberOfItems
     */
    public int getNumberOfItems() {
        return numberOfItems;
    }

    /**
     * @param numberOfItems
     *            the numberOfItem to set
     */
    public void setNumberOfItems(int numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    /**
     * @return the cost
     */
    public int getCost() {
        return cost;
    }

    /**
     * @param cost
     *            the cost to set
     */
    public void setCost(int cost) {
        this.cost = cost;
    }

}
