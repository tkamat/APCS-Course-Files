import java.util.*;

/**
 * TestInventory6 .
 *
 * FLVS 2007
 *
 * @author R. Enger
 * @version 6/18/2007
 */
public class TestInventory6 {

    public static void main(String[] args) {
        List<InventoryItem> inventory = new ArrayList<InventoryItem>();

        // create inventory
        inventory.add(new InventoryItem("Towel", 200));
        inventory.add(new InventoryItem("Cleaning Cart", 30));
        inventory.add(new InventoryItem("Toiletry Sets", 100));
        inventory.add(new InventoryItem("Coffee Set", 300));
        inventory.add(new InventoryItem("Pillows", 50));

        System.out.println("   Inventory List (before Insert) ");
        System.out.println("______________________________");
        System.out.println();
        printInventory(inventory);
        System.out.println();
        System.out.println();
        insertItem1(inventory, 2, "Relaxation Kit", 1000);
        System.out.println("    Inventory List (after insert)        ");
        System.out.println("______________________________");
        System.out.println();
        printInventory(inventory);
        System.out.println();
        System.out.println();
        insertItem2(inventory, "Towel", "Hair Dryer", 500);
        System.out.println("    Inventory List (after insert)        ");
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

    public static void insertItem1(List<InventoryItem> list, int location, String addN, int addS) {
        // insert item into ArrayList
        list.add(location, new InventoryItem(addN, addS));
    }

    public static void insertItem2(List<InventoryItem> list, String find, String addN, int addS) {
        int location = 0;

        // find location of item you want to insert before
        for (int index = 0; index < list.size(); index++)
            if (list.get(index).getName().equals(find))
                location = index;

        // insert item into ArrayList
        list.add(location, new InventoryItem(addN, addS));
    }

}
