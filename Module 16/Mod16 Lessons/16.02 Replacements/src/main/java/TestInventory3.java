
/**
 * TestInventory3 .
 *
 * ©FLVS 2007
 *
 * @author R. Enger
 * @version 6/15/2007
 */
public class TestInventory3 {

    public static void main(String[] args) {
        InventoryItem[] inventory = new InventoryItem[5];

        // create inventory
        inventory[0] = new InventoryItem("Towel", 200);
        inventory[1] = new InventoryItem("Cleaning Cart", 30);
        inventory[2] = new InventoryItem("Toiletry Sets", 100);
        inventory[3] = new InventoryItem("Coffee Set", 300);
        inventory[4] = new InventoryItem("Pillows", 50);

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

    public static void printInventory(InventoryItem[] list) {
        for (int i = 0; i < list.length; i++)
            System.out.println(list[i]);
    }

    public static void changeItem(InventoryItem[] list, String find, String replace) {
        for (int index = 0; index < list.length; index++)
            if (list[index].getName().equals(find))
                list[index].setName(replace);
    }

}
