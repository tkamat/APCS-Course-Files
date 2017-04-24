
/**
 * TestInventory5 .
 *
 * FLVS 2007
 *
 * @author R. Enger
 * @version 6/18/2007
 */
public class TestInventory5 {

    public static void main(String[] args) {
        InventoryItem[] inventory = new InventoryItem[5];

        // create inventory
        inventory[0] = new InventoryItem("Towel", 200);
        inventory[1] = new InventoryItem("Cleaning Cart", 30);
        inventory[2] = new InventoryItem("Toiletry Sets", 100);
        inventory[3] = new InventoryItem("Coffee Set", 300);
        inventory[4] = new InventoryItem("Pillows", 50);

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

    public static void printInventory(InventoryItem[] list) {
        for (int i = 0; i < list.length; i++)
            System.out.println(list[i]);
    }

    public static void changeItem(InventoryItem[] list, String find, String replace) {
        for (int index = 0; index < list.length; index++)
            if (list[index].getName().equals(find))
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
            if (list[index].getName().equals(find))
                location = index;

        // move items down in the array - last item is lost
        for (int index = list.length - 1; index > location; index--)
            list[index] = list[index - 1];

        list[location] = new InventoryItem(addN, addS);
    }

}
