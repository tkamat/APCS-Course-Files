
/**
 * Tests the Candidate class.
 *
 * @author Tushaar Kamat
 * @version 02/14/2017
 */
public class TestCandidate {
    public static void printVotes(Candidate[] election) {
        for (Candidate c : election) {
            System.out.println(c);
        }
    }

    public static int getTotal(Candidate[] election) {
        int total = 0;
        for (Candidate c : election) {
            total += c.getNumVotes();
        }
        return total;
    }

    public static void printResults(Candidate[] election) {
        double total = getTotal(election);
        System.out.printf("%-24s%-26s%s%n", "Candidate", "Votes Received", "% of Total Votes");
        for (Candidate c : election) {
            System.out.printf("%-24s%-26d%d%n", c.getName(), c.getNumVotes(), (int)((c.getNumVotes() / total) * 100));
        }
    }

    public static void main(String args[]) {
        Candidate[] election = new Candidate[5];
        election[0] = new Candidate("John Smith", 5000);
        election[1] = new Candidate("Mary Miller", 4000);
        election[2] = new Candidate("Michael Duffy", 6000);
        election[3] = new Candidate("Tim Robinson", 2500);
        election[4] = new Candidate("Hoe Ashtony", 1800);
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
