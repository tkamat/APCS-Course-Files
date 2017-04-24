
/**
 * Represents music using its title, year, and singer
 *
 * @author Tushaar Kamat
 * @version 03/05/2017
 */
public class Music2 {

    private String title;
    private int year;
    private String singer;

    /**
     * Constructor for the Music2 class
     */
    public Music2(String title, int year, String singer) {
        this.title = title;
        this.year = year;
        this.singer = singer;
    }

    /**
     * @return class variables in the format Title, Year, Singer
     */
    @Override
    public String toString() {
        return this.title + ", " + this.year + ", " + this.singer;
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
     * @return the singer
     */
    public String getSinger() {
        return singer;
    }

    /**
     * @param singer
     *            the singer to set
     */
    public void setSinger(String singer) {
        this.singer = singer;
    }

}
