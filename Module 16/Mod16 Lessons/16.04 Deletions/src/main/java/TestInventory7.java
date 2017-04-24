
/**
 * TestInventory7 .
 *
 * ©FLVS 2007
 *
 * @author R. Enger
 * @version 6/20/2007
 */
public class TestInventory7 {

    public static void main(String[] args) {
        InventoryItem[] inventory = new InventoryItem[5];

        // create inventory
        inventory[0] = new InventoryItem("Towel", 200);
        inventory[1] = new InventoryItem("Cleaning Cart", 30);
        inventory[2] = new InventoryItem("Toiletry Sets", 100);
        inventory[3] = new InventoryItem("Coffee Set", 300);
        inventory[4] = new InventoryItem("Pillows", 50);

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
        System.out.println("    Inventory List (after deleteByName)        ");
        System.out.println("______________________________");
        System.out.println();
        printInventory(inventory);
    }

    public static void printInventory(InventoryItem[] list) {
        for (int i = 0; i < list.length; i++)
            if (list[i] != null)
                System.out.println(list[i]);
    }

    public static void changeItem(InventoryItem[] list, String find, String replace) {
        for (int index = 0; index < list.length; index++)
            if ((list[index] != null) && (list[index].getName().equals(find)))
                list[index].setName(replace);
    }

    public static void insertItem1(InventoryItem[] list, int location, String addN, int addS) {
        // move items down in the array - last item is lost
        for (int index = list.length - 1; index > location; index--)
            list[index] = list[index - 1];

        list[location] = new InventoryItem(addN, addS);
    }

    public static void insertItem2(InventoryItem[] list, String find, String addN, int addS) {
        int location = 0;

        // find location of item you want to insert before
        for (int index = 0; index < list.length; index++)
            if ((list[index] != null) && (list[index].getName().equals(find))) {
                location = index;
                break;
            }
            else if (list[index] == null) {
                location = index;
                break;
            }

        // move items down in the array - last item is lost
        for (int index = list.length - 1; index > location; index--)
            list[index] = list[index - 1];

        list[location] = new InventoryItem(addN, addS);
    }

    public static void deleteByLoc(InventoryItem[] list, int location) {
        if ((location > 0) && (location < list.length)) {
            // move items up in the array -
            for (int index = location; index < list.length - 1; index++)
                list[index] = list[index + 1];

            list[list.length - 1] = null;
        }
    }

    public static void deleteByName(InventoryItem[] list, String find) {
        int location = 0;
        int index;

        // find location of item you want to delete
        for (index = 0; index < list.length; index++)
            if ((list[index] != null) && (list[index].getName().equals(find))) {
                location = index;
                break;
            }
            else if (list[index] == null) {
                location = -1;
                break;
            }

        if ((index != list.length) && (location >= 0)) { // move items up in the
                                                         // array
            for (index = location; index < list.length - 1; index++)
                list[index] = list[index + 1];

            list[list.length - 1] = null;
        }
    }
}
