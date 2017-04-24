/**
 * Tests the Item class using different sorting algorithms.
 *
 * @author Tushaar Kamat
 * @version 03/02/2017
 */
public class TestItem {
    public static void main(String args[]) {
        Item[] hardware = { new Item("1011", "Air Filters", 200, 10.5), new Item("1034", "Door Knobs", 60, 21.5),
                new Item("1101", "Hammers", 90, 9.99), new Item("1600", "Levels", 80, 19.99),
                new Item("1500", "Ceiling Fans", 100, 59), new Item("1201", "Wrench Sets", 55, 80) };
        Item[] dest = new Item[hardware.length];
        System.out.println("Original Array:");
        System.out.println();
        printInventory(hardware);
        System.out.println();
        System.out.println("Sorted by ID:");
        dest = sortID(hardware, 1);
        System.out.println();
        printInventory(dest);
        System.out.println();
        System.out.println("Sorted by Name:");
        dest = sortName(hardware, 1);
        System.out.println();
        printInventory(dest);
        System.out.println();
        System.out.println("Sorted by inStore");
        sortInStore(hardware, 1);
        System.out.println();
        printInventory(hardware);
        System.out.println();
        System.out.println("Sorted by Price");
        sortPrice(hardware, 0, hardware.length - 1);
        System.out.println();
        printInventory(hardware);
    }

    public static void printInventory(Item[] inventory) {
        System.out.printf("%s%11s%14s%9s%n", "itemID", "itemName", "inStore", "price");
        System.out.println("--------------------------------------------");

        for (Item item : inventory) {
            System.out.println(item);
        }
    }

    /**
     * Uses an insertion sort to sort a Item array by ID
     *
     * @param src
     *            original array
     * @param order
     *            1 for ascending and 2 for descending
     * @return sorted array
     */
    public static Item[] sortID(Item[] source, int order) {

        Item[] dest = new Item[source.length];
        if (order == 1) {
            for (int i = 0; i < source.length; i++) {
                Item next = source[i];
                int insertindex = 0;
                int k = i;
                while (k > 0 && insertindex == 0) {
                    if (next.getItemID().compareTo(dest[k - 1].getItemID()) > 0) {
                        insertindex = k;
                    }
                    else {
                        dest[k] = dest[k - 1];
                    }
                    k--;
                }

                dest[insertindex] = next;
            }
            return dest;
        }
        else if (order == 2) {
            for (int i = 0; i < source.length; i++) {
                Item next = source[i];
                int insertindex = 0;
                int k = i;
                while (k > 0 && insertindex == 0) {
                    if (next.getItemID().compareTo(dest[k - 1].getItemID()) < 0) {
                        insertindex = k;
                    }
                    else {
                        dest[k] = dest[k - 1];
                    }
                    k--;
                }

                dest[insertindex] = next;
            }
            return dest;
        }
        else {
            System.out.println("Please enter a valid order number!");
        }
        return dest;
    }

    /**
     * Uses an insertion sort to sort an Item array by name
     *
     * @param src
     *            original array
     * @param order
     *            1 for ascending and 2 for descending
     * @return sorted array
     */
    public static Item[] sortName(Item[] source, int order) {

        Item[] dest = new Item[source.length];
        if (order == 1) {
            for (int i = 0; i < source.length; i++) {
                Item next = source[i];
                int insertindex = 0;
                int k = i;
                while (k > 0 && insertindex == 0) {
                    if (next.getItemName().compareTo(dest[k - 1].getItemName()) > 0) {
                        insertindex = k;
                    }
                    else {
                        dest[k] = dest[k - 1];
                    }
                    k--;
                }

                dest[insertindex] = next;
            }
            return dest;
        }
        else if (order == 2) {
            for (int i = 0; i < source.length; i++) {
                Item next = source[i];
                int insertindex = 0;
                int k = i;
                while (k > 0 && insertindex == 0) {
                    if (next.getItemName().compareTo(dest[k - 1].getItemName()) < 0) {
                        insertindex = k;
                    }
                    else {
                        dest[k] = dest[k - 1];
                    }
                    k--;
                }

                dest[insertindex] = next;
            }
            return dest;
        }
        else {
            System.out.println("Please enter a valid order number!");
        }
        return dest;
    }

    /**
     * Uses an selection sort to sort a Item array by inStore
     *
     * @param src
     *            original array
     * @param order
     *            1 for ascending and 2 for descending
     */
    public static void sortInStore(Item[] source, int order) {
        if (order == 1) {
            int posmax;
            Item temp;

            for (int i = source.length - 1; i > 0; i--) {
                posmax = 0;
                for (int k = 1; k <= i; k++) {
                    if (source[k].getInStore() > source[posmax].getInStore())
                        posmax = k;
                }
                temp = source[i];
                source[i] = source[posmax];
                source[posmax] = temp;
            }
        }
        else if (order == 2) {
            int posmax;
            Item temp;

            for (int i = source.length - 1; i > 0; i--) {
                posmax = 0;
                for (int k = 1; k <= i; k++) {
                    if (source[k].getInStore() < source[posmax].getInStore())
                        posmax = k;
                }
                temp = source[i];
                source[i] = source[posmax];
                source[posmax] = temp;
            }
        }
        else {
            System.out.println("Please enter a valid order number!");
        }
    }

    /**
     * Recursive method to sort an array using the mergePrice method
     *
     * @param movies
     *            array to sort
     * @param low
     *            first index
     * @param high
     *            last index
     */
    public static void sortPrice(Item[] movies, int low, int high) {
        if (low == high)
            return;

        int mid = (low + high) / 2;

        sortPrice(movies, low, mid);
        sortPrice(movies, mid + 1, high);

        mergePrice(movies, low, mid, high);
    }

    /**
     * Merges an array
     *
     * @param a
     *            array to merge
     * @param low
     *            first index
     * @param mid
     *            middle index
     * @param high
     *            last index
     */
    public static void mergePrice(Item[] a, int low, int mid, int high) {
        Item[] temp = new Item[high - low + 1];

        int i = low, j = mid + 1, n = 0;

        while (i <= mid || j <= high) {
            if (i > mid) {
                temp[n] = a[j];
                j++;
            }
            else if (j > high) {
                temp[n] = a[i];
                i++;
            }
            else if (a[i].getPrice() < a[j].getPrice()) {
                temp[n] = a[i];
                i++;
            }
            else {
                temp[n] = a[j];
                j++;
            }
            n++;
        }

        for (int k = low; k <= high; k++)
            a[k] = temp[k - low];

    }

}
