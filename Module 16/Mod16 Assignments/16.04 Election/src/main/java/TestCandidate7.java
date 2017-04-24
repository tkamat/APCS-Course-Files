
/**
 * Tests the Candidate class.
 *
 * @author Tushaar Kamat
 * @version 02/14/2017
 */
public class TestCandidate7 {
    public static void printVotes(Candidate[] election) {
        for (Candidate c : election) {
            if (c != null) {
                System.out.println(c);
            }
        }
    }

    public static int getTotal(Candidate[] election) {
        int total = 0;
        for (Candidate c : election) {
            if (c != null) {
                total += c.getNumVotes();
            }
        }
        return total;
    }

    public static void printResults(Candidate[] election) {
        double total = getTotal(election);
        System.out.printf("%-24s%-26s%s%n", "Candidate", "Votes Received", "% of Total Votes");
        for (Candidate c : election) {
            if (c != null) {
                System.out.printf("%-24s%-26d%d%n", c.getName(), c.getNumVotes(),
                        (int) ((c.getNumVotes() / total) * 100));
            }
        }
    }

    public static void replaceVotes(Candidate[] election, String findName, int replaceVotes) {
        for (int i = 0; i < election.length; i++) {
            if (election[i] != null && election[i].getName().equals(findName)) {
                election[i].setNumVotes(replaceVotes);
            }
        }
    }

    public static void replaceCandidate(Candidate[] election, String findName, String replaceName, int replaceVotes) {
        for (int i = 0; i < election.length; i++) {
            if (election[i] != null && election[i].getName().equals(findName)) {
                election[i].setName(replaceName);
                election[i].setNumVotes(replaceVotes);
            }
        }
    }

    public static void insertPosition(Candidate[] election, int location, String addN, int addV) {
        for (int i = election.length - 1; i > location; i--)
            election[i] = election[i - 1];

        election[location] = new Candidate(addN, addV);
    }

    public static void insertCandidate(Candidate[] election, String findN, String addN, int addV) {
        int location = -1;
        for (int i = 0; i < election.length; i++) {
            if (election[i] != null && election[i].getName().equals(findN)) {
                location = i;
                break;
            }
        }
        if (location >= 0) {
            for (int i = election.length - 1; i > location; i--) {
                election[i] = election[i - 1];
            }

            election[location] = new Candidate(addN, addV);
        }
    }

    public static void deleteByLoc(Candidate[] election, int location) {
        if ((location >= 0) && (location < election.length)) {
            for (int i = location; i < election.length - 1; i++) {
                election[i] = election[i + 1];
            }
            election[election.length - 1] = null;
        }
    }

    public static void deleteByName(Candidate[] election, String findN) {
        int location = -1;
        int i;

        for (i = 0; i < election.length; i++) {
            if ((election[i] != null) && (election[i].getName().equals(findN))) {
                location = i;
                break;
            }
        }

        if (location >= 0) {
            for (i = location; i < election.length - 1; i++) {
                election[i] = election[i + 1];
            }
            election[election.length - 1] = null;
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
        System.out.println("Changing Michael Duffy to John Elmos:");
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
        System.out.println("Replacing Kathleen Turner with John Kennedy:");
        replaceCandidate(election, "Kathleen Turner", "John Kennedy", 8500);
        System.out.println();
        printResults(election);
        System.out.println();
        System.out.println("Total number of votes in election: " + getTotal(election));
        System.out.println();
        System.out.println("Added Woody Pride, 19300 votes:");
        insertPosition(election, 5, "Woody Pride", 19300);
        System.out.println();
        printResults(election);
        System.out.println();
        System.out.println("Total number of votes in election: " + getTotal(election));
        System.out.println();
        System.out.println("Added Joy Anderson, 1100 votes");
        insertCandidate(election, "John Kennedy", "Joy Anderson", 1100);
        System.out.println();
        printResults(election);
        System.out.println();
        System.out.println("Total number of votes in election: " + getTotal(election));
        System.out.println();
        System.out.println("Deleting location 6: ");
        deleteByLoc(election, 6);
        System.out.println();
        printResults(election);
        System.out.println();
        System.out.println("Total number of votes in election: " + getTotal(election));
        System.out.println();
        System.out.println("Deleting John Kennedy: ");
        deleteByName(election, "John Kennedy");
        System.out.println();
        printResults(election);
        System.out.println();
        System.out.println("Total number of votes in election: " + getTotal(election));
    }
}
