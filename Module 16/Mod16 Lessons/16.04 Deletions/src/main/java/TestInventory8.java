import java.util.*;

/**
 * TestInventory8 .
 *
 * ©FLVS 2007
 *
 * @author R. Enger
 * @version 6/20/2007
 */
public class TestInventory8 {

    public static void main(String[] args) {
        List<InventoryItem> inventory = new ArrayList<InventoryItem>();

        // create inventory
        inventory.add(new InventoryItem("Towel", 200));
        inventory.add(new InventoryItem("Cleaning Cart", 30));
        inventory.add(new InventoryItem("Toiletry Sets", 100));
        inventory.add(new InventoryItem("Coffee Set", 300));
        inventory.add(new InventoryItem("Pillows", 50));

        System.out.println("   Inventory List (before deletions) ");
        System.out.println("______________________________");
        System.out.println();
        printInventory(inventory);
        System.out.println();
        System.out.println();
        deleteByLoc(inventory, 2);
        System.out.println("    Inventory List (after deleteByLoc)        ");
        System.out.println("______________________________");
        System.out.println();
        printInventory(inventory);
        System.out.println();
        System.out.println();
        deleteByName(inventory, "Towel");
        deleteByName(inventory, "Power");
        System.out.println("    Inventory List (after deleteByName)        ");
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

    public static void deleteByLoc(List<InventoryItem> list, int location) {
        // delete item from ArrayList
        list.remove(location);
    }

    public static void deleteByName(List<InventoryItem> list, String find) {
        int location = 0;
        int index;

        // find location of item you want to delete
        for (index = 0; index < list.size(); index++)
            if (list.get(index).getName().equals(find)) {
                location = index;
                break;
            }

        // delet item from ArrayList
        if (index != list.size())
            list.remove(location);
    }

}
