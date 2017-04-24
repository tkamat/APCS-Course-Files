/**
 * InventoryItem
 *
 * FLVS 2007
 *
 * @author R. Enger
 * @version 6/10/2007
 */
public class InventoryItem {
    // instance variables
    private int inStock;
    private String name;

    /**
     * Constructor for objects of class InventoryItem
     */
    public InventoryItem(String n, int s) {
        // initialise instance variables
        name = n;
        inStock = s;
    }

    public int NumInStock() {
        return inStock;
    }

    public void setStock(int num) {
        inStock = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public String toString() {
        return name + ": " + inStock + " in Stock";
    }

}
