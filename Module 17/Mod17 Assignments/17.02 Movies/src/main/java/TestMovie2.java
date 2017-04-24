/**
 * Uses an insertion sort to test the Movie2 class
 *
 * @author Tushaar Kamat
 * @version 02/27/2017
 */
public class TestMovie2 {
    public static void main(String args[]) {
        Movie2[] myMovies = { new Movie2("The Muppets Take Manhattan", 2001, "Columbia Tristar"),
                new Movie2("Mulan Special Edition", 2004, "Disney"), new Movie2("Shrek 2", 2004, "Dreamworks"),
                new Movie2("The Incredibles", 2004, "Pixar"), new Movie2("Nanny McPhee", 2006, "Univeral"),
                new Movie2("The Curse of the Were-Rabbit", 2006, "Aardman"),
                new Movie2("Ice Age", 2002, "20th Century Fox"), new Movie2("Lilo and Stitch", 2002, "Disney"),
                new Movie2("Robots", 2005, "20th Century Fox"), new Movie2("Monsters Inc", 2001, "Pixar") };
        Movie2[] myMoviesSorted = new Movie2[myMovies.length];

        System.out.println("Before Sorting:");
        printMovies(myMovies);
        System.out.println();
        System.out.println("Sorted by Title - ascending:");
        myMoviesSorted = sortTitles(myMovies, 1);
        printMovies(myMoviesSorted);
        System.out.println();
        System.out.println("Sorted by Year - descending:");
        myMoviesSorted = sortYears(myMovies, 2);
        printMovies(myMoviesSorted);
        System.out.println();
        System.out.println("Sorted by Studio - ascending:");
        myMoviesSorted = sortStudios(myMovies, 1);
        printMovies(myMoviesSorted);
    }

    /**
     * Traverses array and prints each element
     *
     * @param movies
     *            array to print
     */
    public static void printMovies(Movie2[] movies) {
        for (Movie2 m : movies)
            System.out.println(m);
    }

    /**
     * Uses an insertion sort to sort a Movie2 array by title
     *
     * @param src
     *            original array
     * @param order
     *            1 for ascending and 2 for descending
     * @return sorted array
     */
    public static Movie2[] sortTitles(Movie2[] source, int order) {

        Movie2[] dest = new Movie2[source.length];
        if (order == 1) {
            for (int i = 0; i < source.length; i++) {
                Movie2 next = source[i];
                int insertindex = 0;
                int k = i;
                while (k > 0 && insertindex == 0) {
                    if (next.getTitle().compareTo(dest[k - 1].getTitle()) > 0) {
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
                Movie2 next = source[i];
                int insertindex = 0;
                int k = i;
                while (k > 0 && insertindex == 0) {
                    if (next.getTitle().compareTo(dest[k - 1].getTitle()) < 0) {
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
     * Uses an insertion sort to sort a Movie2 array by year
     *
     * @param src
     *            original array
     * @param order
     *            1 for ascending and 2 for descending
     * @return sorted array
     */
    public static Movie2[] sortYears(Movie2[] source, int order) {

        Movie2[] dest = new Movie2[source.length];
        if (order == 1) {
            for (int i = 0; i < source.length; i++) {
                Movie2 next = source[i];
                int insertindex = 0;
                int k = i;
                while (k > 0 && insertindex == 0) {
                    if (next.getYear() > dest[k - 1].getYear()) {
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
                Movie2 next = source[i];
                int insertindex = 0;
                int k = i;
                while (k > 0 && insertindex == 0) {
                    if (next.getYear() < dest[k - 1].getYear()) {
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
     * Uses an insertion sort to sort a Movie2 array by studio
     *
     * @param src
     *            original array
     * @param order
     *            1 for ascending and 2 for descending
     * @return sorted array
     */
    public static Movie2[] sortStudios(Movie2[] source, int order) {

        Movie2[] dest = new Movie2[source.length];
        if (order == 1) {
            for (int i = 0; i < source.length; i++) {
                Movie2 next = source[i];
                int insertindex = 0;
                int k = i;
                while (k > 0 && insertindex == 0) {
                    if (next.getStudio().compareTo(dest[k - 1].getStudio()) > 0) {
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
                Movie2 next = source[i];
                int insertindex = 0;
                int k = i;
                while (k > 0 && insertindex == 0) {
                    if (next.getStudio().compareTo(dest[k - 1].getStudio()) < 0) {
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
}
