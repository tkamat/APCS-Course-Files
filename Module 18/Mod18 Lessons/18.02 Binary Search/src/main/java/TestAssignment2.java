
/**
 * class TestAssignment2
 *
 * ©FLVS 2007
 *
 * @author R. Enger
 * @version 6/29/2007
 */
public class TestAssignment2 {
    public static void main(String[] args) {
        int test;
        Assignment[] roster = new Assignment[15];

        roster[0] = new Assignment("8:00 AM - 4:00 PM", "Safe Mart", "John Tiller");
        roster[1] = new Assignment("4:00 PM - 12:00 AM", "Safe Mart", "Mary Ellen");
        roster[2] = new Assignment("12:00 AM - 8:00 AM", "Safe Mart", "DJ Turtle");
        roster[3] = new Assignment("8:00 AM - 4:00 PM", "Wally World", "Sue Manny");
        roster[4] = new Assignment("4:00 PM - 12:00 AM", "Wally World", "Julia Torte");
        roster[5] = new Assignment("12:00 AM - 8:00 AM", "Wally World", "Angela Ayres");
        roster[6] = new Assignment("8:00 AM - 4:00 PM", "Stay Inn", "Tom Beaumont");
        roster[7] = new Assignment("4:00 PM - 12:00 AM", "Stay Inn", "Larry Vibe");
        roster[8] = new Assignment("12:00 AM - 8:00 AM", "Stay Inn", "Emily Rose");
        roster[9] = new Assignment("8:00 AM - 4:00 PM", "Castle Land", "Aron Tropic");
        roster[10] = new Assignment("4:00 PM - 12:00 AM", "Castle Land", "Kyle Haney");
        roster[11] = new Assignment("12:00 AM - 8:00 AM", "Castle Land", "Mark Kennedy");
        roster[12] = new Assignment("8:00 AM - 4:00 PM", "Kool Karts", "Nina Rose");
        roster[13] = new Assignment("4:00 PM - 12:00 AM", "Kool Karts", "Natalee Michaels");
        roster[14] = new Assignment("12:00 AM - 8:00 AM", "Kool Karts", "Manny Rodriquez");

        printRoster(roster);
        System.out.println("\n\nSearching for Nina Rose: ");
        bubbleSort(roster);
        test = binarySearch(roster, "Nina Rose");
        if (test != -1)
            System.out.println("Found: " + roster[test]);
        else
            System.out.println("Not found. ");
        System.out.println("\n\nSearching for Mickey Mouse: ");
        test = binarySearch(roster, "Mickey Mouse");
        if (test != -1)
            System.out.println("Found: " + roster[test]);
        else
            System.out.println("Not found. ");
        System.out.println("\n\nSearching for Castle Land: ");
        bubbleSort2(roster);
        binarySearch2(roster, "Castle Land");
        System.out.println("\n\nSearching for Magic Island: ");
        binarySearch2(roster, "Magic Island");
    }

    public static void printRoster(Assignment[] r) {
        System.out.println("Time                     Location        Person");
        System.out.println("---------------------------------------------------");
        for (int i = 0; i < r.length; i++)
            System.out.println(r[i]);
    }

    public static void findPerson(Assignment[] r, String toFind) {
        int found = -1;

        for (int i = 0; i < r.length; i++)
            if (r[i].getPerson().compareTo(toFind) == 0) {
                found = i;
                break;
            }
        if (found != -1) { // we have found the person
            System.out.println("We found " + toFind + " in the roster: ");
            System.out.println(r[found]);
        }
        else
            System.out.println(toFind + " is not in the roster");
    }

    public static int binarySearch(Assignment[] r, String toFind) {
        int high = r.length;
        int low = -1;
        int probe;

        while (high - low > 1) {
            probe = (high + low) / 2;
            if (r[probe].getPerson().compareTo(toFind) > 0)
                high = probe;
            else
                low = probe;
        }
        if ((low >= 0) && (r[low].getPerson().compareTo(toFind) == 0))
            return low;
        else
            return -1;
    }

    public static void binarySearch2(Assignment[] r, String toFind) {
        int high = r.length;
        int low = -1;
        int probe;

        while (high - low > 1) {
            probe = (high + low) / 2;

            if (r[probe].getLocation().compareTo(toFind) > 0)
                high = probe;
            else {
                low = probe;
                if (r[probe].getLocation().compareTo(toFind) == 0) {
                    break;
                }
            }
        }
        if ((low >= 0) && (r[low].getLocation().compareTo(toFind) == 0)) {
            linearPrint(r, low, toFind);
        }
        else
            System.out.println("Not found: " + toFind);
    }

    public static void linearPrint(Assignment[] r, int low, String toFind) {
        int i;
        int start = -1;
        int end = -1;

        // find starting point of matches
        i = low - 1;
        while ((i >= 0) && (r[i].getLocation().compareTo(toFind) == 0)) {
            start = i;
            i--;
        }
        // find ending point of matches
        i = low + 1;
        while ((i < r.length) && (r[i].getLocation().compareTo(toFind) == 0)) {
            end = i;
            i++;
        }
        // now print out the matches
        for (i = start; i <= end; i++)
            System.out.println(r[i]);
    }

    public static void findLocation(Assignment[] r, String toFind) {
        int found = 0;

        System.out.println("Find results: ");
        for (int i = 0; i < r.length; i++)
            if (r[i].getLocation().compareTo(toFind) == 0) {
                System.out.println(r[i]);
                found++;
                if (found == 3)
                    break;
            }
        if (found == 0) { // we have not found the location
            System.out.println(toFind + " is not in the roster");
        }
    }

    public static void bubbleSort(Assignment[] a) {
        int out, in;
        Assignment temp;

        for (out = a.length - 1; out > 1; out--) // outer loop (backward)
            for (in = 0; in < out; in++) // inner loop (forward)
                if (a[in].getPerson().compareTo(a[in + 1].getPerson()) > 0) // out
                                                                            // of
                                                                            // order?
                { // swap them
                    temp = a[in + 1];
                    a[in + 1] = a[in];
                    a[in] = temp;
                }
    }

    public static void bubbleSort2(Assignment[] a) {
        int out, in;
        Assignment temp;

        for (out = a.length - 1; out > 1; out--) // outer loop (backward)
            for (in = 0; in < out; in++) // inner loop (forward)
                if (a[in].getLocation().compareTo(a[in + 1].getLocation()) > 0) // out
                                                                                // of
                                                                                // order?
                { // swap them
                    temp = a[in + 1];
                    a[in + 1] = a[in];
                    a[in] = temp;
                }
    }
}
