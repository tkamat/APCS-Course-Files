
/**
 * Tests the Candidate class.
 *
 * @author Tushaar Kamat
 * @version 02/14/2017
 */
public class TestCandidate3 {
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
            System.out.printf("%-24s%-26d%d%n", c.getName(), c.getNumVotes(), (int) ((c.getNumVotes() / total) * 100));
        }
    }

    public static void replaceVotes(Candidate[] election, String findName, int replaceVotes) {
        for (int i = 0; i < election.length; i++) {
            if (election[i].getName().equals(findName)) {
                election[i].setNumVotes(replaceVotes);
            }
        }
    }

    public static void replaceCandidate(Candidate[] election, String findName, String replaceName, int replaceVotes) {
        for (int i = 0; i < election.length; i++) {
            if (election[i].getName().equals(findName)) {
                election[i].setName(replaceName);
                election[i].setNumVotes(replaceVotes);
            }
        }
    }

    public static void main(String args[]) {
        Candidate[] election = new Candidate[10];
        election[0] = new Candidate("John Smith", 5000);
        election[1] = new Candidate("Mary Miller", 4000);
        election[2] = new Candidate("Michael Duffy", 6000);
        election[3] = new Candidate("Tim Robinson", 2500);
        election[4] = new Candidate("Hoe Ashtony", 1800);
        election[5] = new Candidate("Mickey Jones", 3000);
        election[6] = new Candidate("Rebecca Morgan", 2000);
        election[7] = new Candidate("Kathleen Turner", 8000);
        election[8] = new Candidate("Tory Parker", 500);
        election[9] = new Candidate("Ashton Davis", 10000);
        System.out.println("Original Results:");
        System.out.println();
        printResults(election);
        System.out.println();
        System.out.println("Total number of votes in election: " + getTotal(election));
        System.out.println();
        System.out.println("Changing Michael Duffy to John Elmos");
        replaceCandidate(election, "Michael Duffy", "John Elmos", election[2].getNumVotes());
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
