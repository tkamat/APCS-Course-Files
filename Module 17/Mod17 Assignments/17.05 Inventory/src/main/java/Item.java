/**
 * Represents an item in the inventory of a hardware store with its ID, name,
 * quantity, and price
 *
 * @author Tushaar Kamat
 * @version 03/02/2017
 */
public class Item {
    private String itemID;
    private String itemName;
    private int inStore;
    private double price;

    public Item(String itemID, String itemName, int inStore, double price) {
        this.itemID = itemID;
        this.itemName = itemName;
        this.inStore = inStore;
        this.price = price;
    }

    public String toString() {
        return String.format("%s%16s%9d%6s%6.2f", itemID, itemName, inStore, "$", price);
    }

    /**
     * @return the itemID
     */
    public String getItemID() {
        return itemID;
    }

    /**
     * @param itemID
     *            the itemID to set
     */
    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    /**
     * @return the itemName
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * @param itemName
     *            the itemName to set
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * @return the inStore
     */
    public int getInStore() {
        return inStore;
    }

    /**
     * @param inStore
     *            the inStore to set
     */
    public void setInStore(int inStore) {
        this.inStore = inStore;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price
     *            the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }
}
