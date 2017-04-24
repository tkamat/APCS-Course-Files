

import java.util.ArrayList;
import java.util.List;

/**
 * Tests the Candidate class.
 *
 * @author Tushaar Kamat
 * @version 02/14/2017
 */
public class TestCandidate2 {
    public static void printVotes(List<Candidate> election) {
        for (Candidate c : election) {
            System.out.println(c);
        }
    }

    public static int getTotal(List<Candidate> election) {
        int total = 0;
        for (Candidate c : election) {
            total += c.getNumVotes();
        }
        return total;
    }

    public static void printResults(List<Candidate> election) {
        double total = getTotal(election);
        System.out.printf("%-24s%-26s%s%n", "Candidate", "Votes Received", "% of Total Votes");
        for (Candidate c : election) {
            System.out.printf("%-24s%-26d%d%n", c.getName(), c.getNumVotes(), (int)((c.getNumVotes() / total) * 100));
        }
    }

    public static void main(String args[]) {
        List<Candidate> election = new ArrayList<Candidate>();
        election.add(new Candidate("John Smith", 5000));
        election.add(new Candidate("Mary Miller", 4000));
        election.add(new Candidate("Michael Duffy", 6000));
        election.add(new Candidate("Tim Robinson", 2500));
        election.add(new Candidate("Hoe Ashtony", 1800));
        System.out.println("Results per Candidate");
        System.out.println();
        System.out.println();
        printVotes(election);
        System.out.println();
        printResults(election);
        System.out.println();
        System.out.println("Total number of votes in election: " + getTotal(election));
    }
}
