/**
 * Represents a movie using its title, year, and studio.
 *
 * @author Tushaar Kamat
 * @version 02/27/2017
 */
public class Movie2 {
    private String title;
    private int year;
    private String studio;

    public Movie2(String title, int year, String studio) {
        this.title = title;
        this.year = year;
        this.studio = studio;
    }

    /**
     * Returns information about the movie in the format Title, Year, Studio
     */
    public String toString() {
        return this.title + ", " + this.year + ", " + this.studio;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     *            the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year
     *            the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return the studio
     */
    public String getStudio() {
        return studio;
    }

    /**
     * @param studio
     *            the studio to set
     */
    public void setStudio(String studio) {
        this.studio = studio;
    }
}
