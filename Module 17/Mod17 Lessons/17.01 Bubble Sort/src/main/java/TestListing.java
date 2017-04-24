
/**
 * class TestListing
 *
 * ©FLVS 2007
 *
 * @author R. Enger
 * @version 6/25/2007
 */
public class TestListing {
    public static void main(String[] args) {
        HouseListing[] houses = new HouseListing[5];

        houses[0] = new HouseListing("123 Any Street", "St. Cloud", "FL", "34769", 79000);
        houses[1] = new HouseListing("456 Cherry Lane", "St. Cloud", "FL", "34772", 110000);
        houses[2] = new HouseListing("1892 Ocean Blue", "Kissimmee", "FL", "34647", 212000);
        houses[3] = new HouseListing("339 Curry Ave", "Kissimee", "FL", "34647", 88000);
        houses[4] = new HouseListing("612 Orange Street", "Orlando", "FL", "32196", 451000);

        System.out.println("Before sorting: \n");
        for (int i = 0; i < houses.length; i++)
            System.out.println(houses[i]);

        bubbleSort(houses);

        System.out.println("\nAfter sorting: \n");
        for (int i = 0; i < houses.length; i++)
            System.out.println(houses[i]);
    }

    public static void bubbleSort(HouseListing[] a) {
        HouseListing temp;
        for (int out = a.length - 1; out > 0; out--) // outer loop (backward)
            for (int in = 0; in < out; in++) // inner loop (forward)
                if (a[in].getCost() > a[in + 1].getCost()) // out of order?
                { // swap them
                    temp = a[in + 1];
                    a[in + 1] = a[in];
                    a[in] = temp;
                }
    }

}
