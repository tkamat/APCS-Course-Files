/**
 *  LargestInStock2
 *
 * FLVS 2007
 * @author R. Enger
 * @version 6/10/2007
 */
import java.util.*;

public class LargestInStock2 {
    public static void main(String[] args) {
        List<InventoryItem> inventory = new ArrayList<InventoryItem>();

        // create inventory
        inventory.add(new InventoryItem("Towel", 200));
        inventory.add(new InventoryItem("Cleaning Cart", 30));
        inventory.add(new InventoryItem("Toiletry Sets", 100));
        inventory.add(new InventoryItem("Coffee Set", 300));
        inventory.add(new InventoryItem("Pillows", 50));

        largest(inventory);
    }

    public static void largest(List<InventoryItem> List) {
        double max;
        int index;

        if (List.size() != 0) {
            max = List.get(0).NumInStock();
            index = 0;

            for (int i = 1; i < List.size(); i++) {
                if (max < List.get(i).NumInStock()) {
                    max = List.get(i).NumInStock();
                    index = i;
                }
            }

            System.out.println(List.get(index));
            return;
        }

        System.out.println("There are no items in stock.");
    }
}
