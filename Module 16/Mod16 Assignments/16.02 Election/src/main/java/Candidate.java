
/**
 * Class to represent a candidate using their name and number of votes.
 *
 * @author Tushaar Kamat
 * @version 02/14/2017
 */
public class Candidate {
    private String name;
    private int numVotes;

    public Candidate(String name, int numVotes) {
        this.name = name;
        this.numVotes = numVotes;
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
     * @return the numVotes
     */
    public int getNumVotes() {
        return numVotes;
    }

    /**
     * @param numVotes
     *            the numVotes to set
     */
    public void setNumVotes(int numVotes) {
        this.numVotes = numVotes;
    }

    public String toString() {
        return this.name + ": " + this.numVotes + " votes.";
    }

}
