
import java.util.ArrayList;
import java.util.List;

/**
 * Tests the Candidate class.
 *
 * @author Tushaar Kamat
 * @version 02/14/2017
 */
public class TestCandidate4 {
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
            System.out.printf("%-24s%-26d%d%n", c.getName(), c.getNumVotes(), (int) ((c.getNumVotes() / total) * 100));
        }
    }

    public static void replaceVotes(List<Candidate> election, String findName, int replaceVotes) {
        for (int i = 0; i < election.size(); i++) {
            if (election.get(i).getName().equals(findName)) {
                election.get(i).setNumVotes(replaceVotes);
            }
        }
    }

    public static void replaceCandidate(List<Candidate> election, String findName, String replaceName,
            int replaceVotes) {
        for (int i = 0; i < election.size(); i++) {
            if (election.get(i).getName().equals(findName)) {
                election.get(i).setName(replaceName);
                election.get(i).setNumVotes(replaceVotes);
            }
        }
    }

    public static void main(String args[]) {
        List<Candidate> election = new ArrayList<Candidate>();
        election.add(new Candidate("John Smith", 5000));
        election.add(new Candidate("Mary Miller", 4000));
        election.add(new Candidate("Michael Duffy", 6000));
        election.add(new Candidate("Tim Robinson", 2500));
        election.add(new Candidate("Hoe Ashtony", 1800));
        election.add(new Candidate("Mickey Jones", 3000));
        election.add(new Candidate("Rebecca Morgan", 2000));
        election.add(new Candidate("Kathleen Turner", 8000));
        election.add(new Candidate("Tory Parker", 500));
        election.add(new Candidate("Ashton Davis", 10000));
        System.out.println("Original Results:");
        System.out.println();
        printResults(election);
        System.out.println();
        System.out.println("Total number of votes in election: " + getTotal(election));
        System.out.println();
        System.out.println("Changing Michael Duffy to John Elmos");
        replaceCandidate(election, "Michael Duffy", "John Elmos", election.get(2).getNumVotes());
        System.out.println();
        printResults(election);
        System.out.println();
        System.out.println("Total number of votes in election: " + getTotal(election));
        System.out.println();
        System.out.println("Changing Mickey Jones votes to 2500:");
        replaceVotes(election, "Mickey Jones", 2500);
        System.out.println();
        printResults(election);
        System.out.println();
        System.out.println("Total number of votes in election: " + getTotal(election));
        System.out.println();
        System.out.println("Replacing Kathleen Turner with John Kennedy");
        replaceCandidate(election, "Kathleen Turner", "John Kennedy", 8500);
        System.out.println();
        printResults(election);
        System.out.println();
        System.out.println("Total number of votes in election: " + getTotal(election));
        System.out.println();
    }
}
