
/**
 * class TestListing4
 *
 * ©FLVS 2007
 *
 * @author R. Enger
 * @version 6/25/2007
 */
public class TestListing4 {
    public static void main(String[] args) {
        HouseListing[] houses = new HouseListing[5];
        HouseListing[] sorted = new HouseListing[5];

        houses[0] = new HouseListing("123 Any Street", "St. Cloud", "FL", "34769", 79000);
        houses[1] = new HouseListing("456 Cherry Lane", "St. Cloud", "FL", "34772", 110000);
        houses[2] = new HouseListing("1892 Ocean Blue", "Kissimmee", "FL", "34647", 212000);
        houses[3] = new HouseListing("339 Curry Ave", "Kissimee", "FL", "34647", 88000);
        houses[4] = new HouseListing("612 Orange Street", "Orlando", "FL", "32196", 451000);

        System.out.println("Original Array: \n");
        for (int i = 0; i < houses.length; i++)
            System.out.println(houses[i]);

        selectionSort(houses);

        System.out.println("\nSorted Array: \n");
        for (int i = 0; i < houses.length; i++)
            System.out.println(houses[i]);

    }

    public static void bubbleSort(HouseListing[] a) {
        int out, in;
        HouseListing temp;

        for (out = a.length - 1; out > 1; out--) // outer loop (backward)
            for (in = 0; in < out; in++) // inner loop (forward)
                if (a[in].getCost() > a[in + 1].getCost()) // out of order?
                { // swap them
                    temp = a[in + 1];
                    a[in + 1] = a[in];
                    a[in] = temp;
                }
    }

    public static void insertionSort(HouseListing[] source, HouseListing[] dest) {

        for (int i = 0; i < source.length; i++) {
            HouseListing next = source[i];
            int insertindex = 0;
            int k = i;
            while (k > 0 && insertindex == 0) {
                if (next.getCost() > dest[k - 1].getCost()) {
                    insertindex = k;
                }
                else {
                    dest[k] = dest[k - 1];
                }
                k--;
            }

            dest[insertindex] = next;
        } // end of for

    }

    public static void selectionSort(HouseListing[] source) {
        int i;
        int k;
        int posmax;
        HouseListing temp;

        for (i = source.length - 1; i >= 0; i--) {
            // find largest element in the i elements
            posmax = 0;
            for (k = 0; k <= i; k++) {
                if (source[k].getCost() > source[posmax].getCost())
                    posmax = k;
            }
            // swap the largest with the position i
            // now the item is in its proper location
            temp = source[i];
            source[i] = source[posmax];
            source[posmax] = temp;
        }
    }
} // end of class
