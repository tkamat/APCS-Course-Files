import java.util.*;

/**
 * TestInventory4
 *
 * ©FLVS 2007
 *
 * @author R. Enger
 * @version 6/15/2007
 */

public class TestInventory4 {

    public static void main(String[] args) {
        List<InventoryItem> inventory = new ArrayList<InventoryItem>();

        // create inventory
        inventory.add(new InventoryItem("Towel", 200));
        inventory.add(new InventoryItem("Cleaning Cart", 30));
        inventory.add(new InventoryItem("Toiletry Sets", 100));
        inventory.add(new InventoryItem("Coffee Set", 300));
        inventory.add(new InventoryItem("Pillows", 50));

        System.out.println("   Inventory List (before change) ");
        System.out.println("______________________________");
        System.out.println();
        printInventory(inventory);
        System.out.println();
        System.out.println();

        changeItem(inventory, "Coffee Set", "Beverage Gift Set");
        System.out.println("    Inventory List (after change)        ");
        System.out.println("______________________________");
        System.out.println();
        printInventory(inventory);
    }

    public static void printInventory(List<InventoryItem> list) {
        for (InventoryItem item : list)
            System.out.println(item);
    }

    public static void changeItem(List<InventoryItem> list, String find, String replace) {
        for (int index = 0; index < list.size(); index++)
            if (list.get(index).getName().equals(find))
                list.get(index).setName(replace);
    }

}
