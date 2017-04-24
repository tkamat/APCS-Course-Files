public class TestMusic2 {

    public static void main(String args[]) {
        Music2[] myMusic = { new Music2("Pieces of You", 1994, "Jewel"),
                new Music2("Jagged Little Pill", 1995, "Alanis Morissette"),
                new Music2("What If It's You", 1995, "Reba McEntire"), new Music2("Misunderstood", 2001, "Pink"),
                new Music2("Laundry Service", 2001, "Shakira"), new Music2("Taking the Long Way", 2006, "Dixie Chicks"),
                new Music2("Under My Skin", 2004, "Avril Lavigne"), new Music2("Let Go", 2002, "Avril Lavigne"),
                new Music2("Let it Go", 2007, "Tim McGraw"), new Music2("White Flag", 2004, "Dido") };

        int low = 0;
        int high = myMusic.length - 1;
        int index;
        System.out.println("Music library:");
        System.out.println("----------------");
        printMusic(myMusic);
        System.out.println();
        System.out.println("Search - Title - Misunderstood");
        mergeSortTitle(myMusic, low, high);
        index = searchTitle(myMusic, "Misunderstood");
        if (index == -1)
            System.out.println("Not found.");
        else
            System.out.println("Found: " + myMusic[index]);
        System.out.println();
        System.out.println("Search - Title - Under Paid");
        mergeSortTitle(myMusic, low, high);
        index = searchTitle(myMusic, "Under Paid");
        if (index == -1)
            System.out.println("Not found.");
        else
            System.out.println("Found: " + myMusic[index]);
        System.out.println();
        System.out.println("Search - Year - 2005");
        mergeSortYear(myMusic, low, high);
        index = searchYear(myMusic, 2005);
        if (index == -1)
            System.out.println("Not found.");
        else
            System.out.println("Found: " + myMusic[index]);
        System.out.println();
        System.out.println("Search - Year - 2006");
        mergeSortYear(myMusic, low, high);
        index = searchYear(myMusic, 2006);
        if (index == -1)
            System.out.println("Not found.");
        else
            System.out.println("Found: " + myMusic[index]);
        System.out.println();
        System.out.println("Search - Singer - Darth Maul");
        mergeSortSinger(myMusic, low, high);
        index = searchSinger(myMusic, "Darth Maul");
        if (index == -1)
            System.out.println("Not found.");
        else
            System.out.println("Found: " + myMusic[index]);
        System.out.println();
        System.out.println("Search - Singer - Dido");
        mergeSortSinger(myMusic, low, high);
        index = searchSinger(myMusic, "Dido");
        if (index == -1)
            System.out.println("Not found.");
        else
            System.out.println("Found: " + myMusic[index]);
    }

    /**
     * Traverses an array and prints each element
     *
     * @param m
     *            the array
     */
    public static void printMusic(Music2[] m) {
        for (Music2 song : m) {
            System.out.println(song);
        }
    }

    /**
     * Recursive method to sort an array using the mergeTitle method
     *
     * @param m
     *            array to sort
     * @param low
     *            first index
     * @param high
     *            last index
     */
    public static void mergeSortTitle(Music2[] m, int low, int high) {
        if (low == high)
            return;

        int mid = (low + high) / 2;

        mergeSortTitle(m, low, mid);
        mergeSortTitle(m, mid + 1, high);

        mergeTitle(m, low, mid, high);
    }

    /**
     * Merges an Array
     *
     * @param m
     *            array to merge
     * @param low
     *            first index
     * @param mid
     *            middle index
     * @param high
     *            last index
     */
    public static void mergeTitle(Music2[] m, int low, int mid, int high) {
        Music2[] temp = new Music2[high - low + 1];

        int i = low, j = mid + 1, n = 0;

        while (i <= mid || j <= high) {
            if (i > mid) {
                temp[n] = m[j];
                j++;
            }
            else if (j > high) {
                temp[n] = m[i];
                i++;
            }
            else if (m[i].getTitle().compareTo(m[j].getTitle()) < 0) {
                temp[n] = m[i];
                i++;
            }
            else {
                temp[n] = m[j];
                j++;
            }
            n++;
        }

        for (int k = low; k <= high; k++)
            m[k] = temp[k - low];
    }

    /**
     * Recursive method to sort an array using the mergeYear method
     *
     * @param m
     *            array to sort
     * @param low
     *            first index
     * @param high
     *            last index
     */
    public static void mergeSortYear(Music2[] m, int low, int high) {
        if (low == high)
            return;

        int mid = (low + high) / 2;

        mergeSortYear(m, low, mid);
        mergeSortYear(m, mid + 1, high);

        mergeYear(m, low, mid, high);
    }

    /**
     * Merges an Array
     *
     * @param m
     *            array to merge
     * @param low
     *            first index
     * @param mid
     *            middle index
     * @param high
     *            last index
     */
    public static void mergeYear(Music2[] m, int low, int mid, int high) {
        Music2[] temp = new Music2[high - low + 1];

        int i = low, j = mid + 1, n = 0;

        while (i <= mid || j <= high) {
            if (i > mid) {
                temp[n] = m[j];
                j++;
            }
            else if (j > high) {
                temp[n] = m[i];
                i++;
            }
            else if (m[i].getYear() < m[j].getYear()) {
                temp[n] = m[i];
                i++;
            }
            else {
                temp[n] = m[j];
                j++;
            }
            n++;
        }

        for (int k = low; k <= high; k++)
            m[k] = temp[k - low];
    }

    /**
     * Recursive method to sort an array using the mergeSinger method
     *
     * @param m
     *            array to sort
     * @param low
     *            first index
     * @param high
     *            last index
     */
    public static void mergeSortSinger(Music2[] m, int low, int high) {
        if (low == high)
            return;

        int mid = (low + high) / 2;

        mergeSortSinger(m, low, mid);
        mergeSortSinger(m, mid + 1, high);

        mergeSinger(m, low, mid, high);
    }

    /**
     * Merges an Array
     *
     * @param m
     *            array to merge
     * @param low
     *            first index
     * @param mid
     *            middle index
     * @param high
     *            last index
     */
    public static void mergeSinger(Music2[] m, int low, int mid, int high) {
        Music2[] temp = new Music2[high - low + 1];

        int i = low, j = mid + 1, n = 0;

        while (i <= mid || j <= high) {
            if (i > mid) {
                temp[n] = m[j];
                j++;
            }
            else if (j > high) {
                temp[n] = m[i];
                i++;
            }
            else if (m[i].getSinger().compareTo(m[j].getSinger()) < 0) {
                temp[n] = m[i];
                i++;
            }
            else {
                temp[n] = m[j];
                j++;
            }
            n++;
        }

        for (int k = low; k <= high; k++)
            m[k] = temp[k - low];
    }

    /**
     * Uses a binary search to find a title in a Music2 array
     *
     * @param m
     *            array to search
     * @param toFind
     *            title to find
     * @return index of search if found, -1 if not found
     */
    public static int searchTitle(Music2[] m, String toFind) {
        int high = m.length;
        int low = -1;
        int probe;

        while (high - low > 1) {
            probe = (high + low) / 2;
            if (m[probe].getTitle().compareTo(toFind) > 0)
                high = probe;
            else
                low = probe;
        }
        if ((low >= 0) && (m[low].getTitle().compareTo(toFind) == 0))
            return low;
        else
            return -1;
    }

    /**
     * Uses a binary search to find a year in a Music2 array
     *
     * @param m
     *            array to search
     * @param toFind
     *            year to find
     * @return index of search if found, -1 if not found
     */
    public static int searchYear(Music2[] m, int toFind) {
        int high = m.length;
        int low = -1;
        int probe;

        while (high - low > 1) {
            probe = (high + low) / 2;
            if (m[probe].getYear() > toFind)
                high = probe;
            else
                low = probe;
        }
        if ((low >= 0) && (m[low].getYear() == toFind))
            return low;
        else
            return -1;
    }

    /**
     * Uses a binary search to find a singer in a Music2 array
     *
     * @param m
     *            array to search
     * @param toFind
     *            singer to find
     * @return index of search if found, -1 if not found
     */
    public static int searchSinger(Music2[] m, String toFind) {
        int high = m.length;
        int low = -1;
        int probe;

        while (high - low > 1) {
            probe = (high + low) / 2;
            if (m[probe].getSinger().compareTo(toFind) > 0)
                high = probe;
            else
                low = probe;
        }
        if ((low >= 0) && (m[low].getSinger().compareTo(toFind) == 0))
            return low;
        else
            return -1;
    }
}
