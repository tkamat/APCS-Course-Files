
/**
 * class HouseListing
 *
 * ©FLVS 2007
 *
 * @author R. Enger
 * @version 6/25/2007
 */
public class HouseListing {
    // instance variables
    private double cost;
    private String address;
    private String city;
    private String state;
    private String zip;

    /**
     * Constructor for objects of class HouseListing
     */
    public HouseListing(String a, String ct, String s, String z, double c) {
        // initialise instance variables
        cost = c;
        address = a;
        city = ct;
        state = s;
        zip = z;
    }

    public String toString() {
        String listing;
        listing = address + "\n" + city + ", " + state + " " + zip;
        listing = listing + "\nCost: " + String.format("$%,10.2f", cost) + "\n";

        return listing;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String a) {
        address = a;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String c) {
        city = c;
    }

    public String getState() {
        return state;
    }

    public void setState(String s) {
        state = s;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String z) {
        zip = z;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double c) {
        cost = c;
    }

}
