/**
 * LargestInStock
 *
 * FLVS 2007
 * @author R. Enger
 * @version 6/10/2007
 */
import java.util.*;

public class LargestInStock {
    public static void main(String[] args) {
        InventoryItem[] inventory = new InventoryItem[5];

        // create inventory
        inventory[0] = new InventoryItem("Towel", 200);
        inventory[1] = new InventoryItem("Cleaning Cart", 30);
        inventory[2] = new InventoryItem("Toiletry Sets", 100);
        inventory[3] = new InventoryItem("Coffee Set", 300);
        inventory[4] = new InventoryItem("Pillows", 50);

        largest(inventory);
    }

    public static void largest(InventoryItem[] List) {
        double max;
        int index;

        if (List.length != 0) {
            max = List[0].NumInStock();
            index = 0;

            for (int i = 1; i < List.length; i++) {
                if (max < List[i].NumInStock()) {
                    max = List[i].NumInStock();
                    index = i;
                }
            }

            System.out.println(List[index]);
            return;
        }

        System.out.println("There are no items in stock.");
    }
}
