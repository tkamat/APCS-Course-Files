/**
 * Represents a Contact using their name, relation, birthday, phone, and email
 *
 * @author Tushaar Kamat
 * @version 03/14/2017
 */
public class Contact {
    private String name;
    private String relation;
    private String bday;
    private String phone;
    private String email;

    /**
     * Constructor for Contact class
     */
    public Contact(String name, String relation, String bday, String phone, String email) {
        this.name = name;
        this.relation = relation;
        this.bday = bday;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("%12s%14s%10s%19s%24s", this.name, this.relation, this.bday, this.phone, this.email);
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     *            the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the relation
     */
    public String getRelation() {
        return relation;
    }

    /**
     * @param relation
     *            the relation to set
     */
    public void setRelation(String relation) {
        this.relation = relation;
    }

    /**
     * @return the bday
     */
    public String getBday() {
        return bday;
    }

    /**
     * @param bday
     *            the bday to set
     */
    public void setBday(String bday) {
        this.bday = bday;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone
     *            the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     *            the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

}
