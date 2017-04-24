/**
 * Tests the Contact class using different search algorithms
 *
 * @author Tushaar Kamat
 * @version 03/14/2017
 */
public class TestContact {
    public static void main(String args[]) {
        Contact[] myContacts = { new Contact("John Carter", "brother", "Mar 3", "(342) 555-7069", "jcarter@carter.com"),
                new Contact("Elise Carter", "mom", "Apr 19", "(342) 555-7011", "carterMom@carter.com"),
                new Contact("Ellie Carter", "me", "Jun 10", "(342) 555-8102", "ecarter@carter.com"),
                new Contact("Sue Ellen", "friend", "Mar 9", "(341) 555-9182", "susieE@hotmail.com"),
                new Contact("Frank Carter", "dad", "Dec 1", "(342) 555-7011", "carterDad@carter.com"),
                new Contact("Johnnie", "friend", "Jan 21", "(341) 555-7789", "jDawg5555@yahoo.com") };

        int low = 0;
        int high = myContacts.length - 1;

        System.out.println("Contact list");
        System.out.println();
        printContacts(myContacts);
        System.out.println();
        System.out.println("Find Name - Johnnie");
        findByName(myContacts, "Johnnie", low, high);
        System.out.println();
        System.out.println("Find Name - Sam Parker");
        findByName(myContacts, "Sam Parker", low, high);
        System.out.println();
        System.out.println("Find Relation - friend");
        findByRelation(myContacts, "friend");
        System.out.println();
        System.out.println("Find Relation - aunt");
        findByRelation(myContacts, "aunt");
        System.out.println();
        System.out.println("Find Phone - (333) 555-8989");
        findByPhone(myContacts, "(333) 555-8989");
        System.out.println();
        System.out.println("Find Phone - (342) 555-7011");
        findByPhone(myContacts, "(342) 555-7011");
        System.out.println();
        System.out.println("Find Bday - May");
        findByBMonth(myContacts, "May");
        System.out.println();
        System.out.println("Find Bday - Mar");
        findByBMonth(myContacts, "Mar");
        System.out.println();
        System.out.println("Find Email - rgoodman@hotmail.com");
        findByEmail(myContacts, "rgoodman@hotmail.com", low, high);
        System.out.println();
        System.out.println("Find Email - susieE@hotmail.com");
        findByEmail(myContacts, "susieE@hotmail.com", low, high);
    }

    /**
     * Prints each element in a Contact array
     *
     * @param c
     *            array to print
     */
    public static void printContacts(Contact[] c) {
        System.out.printf("%12s%14s%10s%19s%24s%n", "Name", "Relation", "Birthday", "Phone", "Email");
        System.out.println("---------------------------------------------------------------------------------");
        for (Contact con : c) {
            System.out.println(con);
        }
    }

    /**
     * Recursive method to sort an array using the mergeName method
     *
     * @param c
     *            array to sort
     * @param low
     *            first index
     * @param high
     *            last index
     */
    public static void mergeSortName(Contact[] c, int low, int high) {
        if (low == high)
            return;

        int mid = (low + high) / 2;

        mergeSortName(c, low, mid);
        mergeSortName(c, mid + 1, high);

        mergeName(c, low, mid, high);
    }

    /**
     * Merges an Array
     *
     * @param c
     *            array to merge
     * @param low
     *            first index
     * @param mid
     *            middle index
     * @param high
     *            last index
     */
    public static void mergeName(Contact[] c, int low, int mid, int high) {
        Contact[] temp = new Contact[high - low + 1];

        int i = low, j = mid + 1, n = 0;

        while (i <= mid || j <= high) {
            if (i > mid) {
                temp[n] = c[j];
                j++;
            }
            else if (j > high) {
                temp[n] = c[i];
                i++;
            }
            else if (c[i].getName().compareTo(c[j].getName()) < 0) {
                temp[n] = c[i];
                i++;
            }
            else {
                temp[n] = c[j];
                j++;
            }
            n++;
        }

        for (int k = low; k <= high; k++)
            c[k] = temp[k - low];
    }

    /**
     * Uses a binary search to find a name in a Contact array
     *
     * @param c
     *            array to search
     * @param toFind
     *            name to find
     * @param l
     *            lowest index of array
     * @param h
     *            highest index of array
     */
    public static void findByName(Contact[] c, String toFind, int l, int h) {
        mergeSortName(c, l, h);
        int high = c.length;
        int low = -1;
        int probe;
        int index;

        while (high - low > 1) {
            probe = (high + low) / 2;
            if (c[probe].getName().compareTo(toFind) > 0)
                high = probe;
            else
                low = probe;
        }
        if ((low >= 0) && (c[low].getName().compareTo(toFind) == 0))
            index = low;
        else
            index = -1;
        if (index == -1)
            System.out.println("Not Found.");
        else
            System.out.println("Found: " + c[index]);
    }

    /**
     *
     *
     * @param c
     *            array to search
     * @param toFind
     *            relation to find
     */
    public static void findByRelation(Contact[] c, String toFind) {
        int found = 0;
        System.out.println("Find results:");
        for (int i = 0; i < c.length; i++)
            if (c[i].getRelation().compareTo(toFind) == 0) {
                found++;
                System.out.println(c[i]);
            }
        if (found == 0)
            System.out.println("There are no listings for " + toFind);
        else
            System.out.println("There were " + found + " listings for " + toFind);
    }

    /**
     *
     *
     * @param c
     *            array to search
     * @param toFind
     *            phone to find
     */
    public static void findByPhone(Contact[] c, String toFind) {
        int found = 0;
        System.out.println("Find results:");
        for (int i = 0; i < c.length; i++)
            if (c[i].getPhone().compareTo(toFind) == 0) {
                found++;
                System.out.println(c[i]);
            }
        if (found == 0)
            System.out.println("There are no listings for " + toFind);
        else
            System.out.println("There were " + found + " listings for " + toFind);
    }

    /**
     *
     *
     * @param c
     *            array to search
     * @param toFind
     *           bday month to find
     */
    public static void findByBMonth(Contact[] c, String toFind) {
        int found = 0;
        System.out.println("Find results:");
        for (int i = 0; i < c.length; i++)
            if (c[i].getBday().substring(0, 3).compareTo(toFind) == 0) {
                found++;
                System.out.println(c[i]);
            }
        if (found == 0)
            System.out.println("There are no listings for " + toFind);
        else
            System.out.println("There were " + found + " listings for " + toFind);
    }

    /**
     * Recursive method to sort an array using the mergeEmail method
     *
     * @param c
     *            array to sort
     * @param low
     *            first index
     * @param high
     *            last index
     */
    public static void mergeSortEmail(Contact[] c, int low, int high) {
        if (low == high)
            return;

        int mid = (low + high) / 2;

        mergeSortEmail(c, low, mid);
        mergeSortEmail(c, mid + 1, high);

        mergeEmail(c, low, mid, high);
    }

    /**
     * Merges an Array
     *
     * @param c
     *            array to merge
     * @param low
     *            first index
     * @param mid
     *            middle index
     * @param high
     *            last index
     */
    public static void mergeEmail(Contact[] c, int low, int mid, int high) {
        Contact[] temp = new Contact[high - low + 1];

        int i = low, j = mid + 1, n = 0;

        while (i <= mid || j <= high) {
            if (i > mid) {
                temp[n] = c[j];
                j++;
            }
            else if (j > high) {
                temp[n] = c[i];
                i++;
            }
            else if (c[i].getEmail().compareTo(c[j].getEmail()) < 0) {
                temp[n] = c[i];
                i++;
            }
            else {
                temp[n] = c[j];
                j++;
            }
            n++;
        }

        for (int k = low; k <= high; k++)
            c[k] = temp[k - low];
    }

    /**
     * Uses a binary search to find an email in a Contact array
     *
     * @param c
     *            array to search
     * @param toFind
     *            email to find
     * @param l
     *            lowest index of array
     * @param h
     *            highest index of array
     */
    public static void findByEmail(Contact[] c, String toFind, int l, int h) {
        mergeSortName(c, l, h);
        int high = c.length;
        int low = -1;
        int probe;
        int index;

        while (high - low > 1) {
            probe = (high + low) / 2;
            if (c[probe].getEmail().compareTo(toFind) > 0)
                high = probe;
            else
                low = probe;
        }
        if ((low >= 0) && (c[low].getEmail().compareTo(toFind) == 0))
            index = low;
        else
            index = -1;
        if (index == -1)
            System.out.println("Not Found.");
        else
            System.out.println("Found: " + c[index]);
    }
}

