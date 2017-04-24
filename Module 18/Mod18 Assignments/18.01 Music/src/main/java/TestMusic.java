/**
 * Tests the Music class using a sequential search
 *
 * @author Tushaar Kamat
 * @version 03/06/2017
 */
public class TestMusic {
    public static void main(String args[]) {
        Music[] myMusic = { new Music("Pieces of You", 1994, "Jewel"),
                new Music("Jagged Little Pill", 1995, "Alanis Morissette"),
                new Music("What If It's You", 1995, "Reba McEntire"), new Music("Misunderstood", 2001, "Pink"),
                new Music("Laundry Service", 2001, "Shakira"), new Music("Taking the Long Way", 2006, "Dixie Chicks"),
                new Music("Under My Skin", 2004, "Avril Lavigne"), new Music("Let Go", 2002, "Avril Lavigne"),
                new Music("Let it Go", 2007, "Tim McGraw"), new Music("White Flag", 2004, "Dido") };

        System.out.println("Music library:");
        System.out.println("----------------");
        printMusic(myMusic);
        System.out.println();
        System.out.println("Seach - Title - Let Go");
        searchTitle(myMusic, "Let Go");
        System.out.println();
        System.out.println("Search - Title - Some Day");
        searchTitle(myMusic, "Some Day");
        System.out.println();
        System.out.println("Search - Year - 2001");
        searchYear(myMusic, 2001);
        System.out.println();
        System.out.println("Search - Year - 2003");
        searchYear(myMusic, 2003);
        System.out.println();
        System.out.println("Search - Singer - Avril Lavigne");
        searchSinger(myMusic, "Avril Lavigne");
        System.out.println();
        System.out.println("Search - Singer - Tony Curtis");
        searchSinger(myMusic, "Tony Curtis");
    }

    public static void printMusic(Music[] m) {
        for (Music song : m) {
            System.out.println(song);
        }
    }

    public static void searchTitle(Music[] m, String toFind) {
        int found = -1;

        for (int i = 0; i < m.length; i++)
            if (m[i].getTitle().compareTo(toFind) == 0) {
                found = i;
                break;
            }
        if (found != -1) {
            System.out.println("We found " + toFind + " in the library: ");
            System.out.println(m[found]);
        }
        else
            System.out.println(toFind + " is not in the library");
    }

    public static void searchYear(Music[] m, int toFind) {
        System.out.println("Find results:");
        int found = 0;
        for (int i = 0; i < m.length; i++) {
            if (m[i].getYear() == toFind) {
                found++;
                System.out.println(m[i]);
            }
        }
        if (found > 0)
            System.out.println("There were " + found + " listings for " + toFind);
        else
            System.out.println("There are no listings for " + toFind);
    }

    public static void searchSinger(Music[] m, String toFind) {
        System.out.println("Find results:");
        int found = 0;
        for (int i = 0; i < m.length; i++) {
            if (m[i].getSinger().compareTo(toFind) == 0) {
                found++;
                System.out.println(m[i]);
            }
        }
        if (found > 0)
            System.out.println("There were " + found + " listings for " + toFind);
        else
            System.out.println("There are no listings for " + toFind);
    }
}
