
/**
 * class Assignment
 *
 * ©FLVS 2007
 *
 * @author R. Enger
 * @version 6/29/2007
 */
public class Assignment {
    // instance variables
    private String time;
    private String location;
    private String person;

    /**
     * Constructor for objects of class Assignment
     */
    public Assignment(String t, String l, String p) {
        // initialise instance variables
        time = t;
        location = l;
        person = p;
    }

    public void setTime(String t) {
        time = t;
    }

    public String getTime() {
        return time;
    }

    public void setLocation(String l) {
        location = l;
    }

    public String getLocation() {
        return location;
    }

    public void setPerson(String p) {
        person = p;
    }

    public String getPerson() {
        return person;
    }

    public String toString() {
        return String.format("%-18s", time) + "\t" + String.format("%-10s", location) + "\t"
                + String.format("%-15s", person);
    }

}
