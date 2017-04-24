
/**
* class Account
*
* ©FLVS 2007
* @author R. Enger
* @version 7/9/2007
*/
import java.text.NumberFormat;

public class Account {
    private NumberFormat fmt = NumberFormat.getCurrencyInstance();

    private final double RATE = 0.035; // interest rate of 3.5%

    private long acctNumber;
    private double balance;
    private String name;

    // -----------------------------------------------------------------
    // Sets up the account by defining its owner, account number,
    // and initial balance.
    // -----------------------------------------------------------------
    public Account(String owner, long account, double initial) {
        name = owner;
        acctNumber = account;
        if (initial < 0)
            throw new RuntimeException("Initial Balance can't be less than zero");
        else
            balance = initial;
    }

    // -----------------------------------------------------------------
    // Validates the transaction, then deposits the specified amount
    // into the account. Returns the new balance.
    // -----------------------------------------------------------------
    public double deposit(double amount) {
        String msg;

        if (amount < 0) // deposit value is negative
        {
            msg = "Error: Deposit amount is invalid. ";
            msg = msg + acctNumber + "  " + fmt.format(amount);
            throw new IllegalArgumentException(msg);
        }
        else
            balance = balance + amount;

        return balance;
    }

    // -----------------------------------------------------------------
    // Validates the transaction, then withdraws the specified amount
    // from the account. Returns the new balance.
    // -----------------------------------------------------------------
    public double withdraw(double amount, double fee) {
        String msg;
        amount += fee;

        if (amount < 0) // withdraw value is negative
        {

            msg = "Error: Withdraw amount is invalid.";
            msg = msg + " Account: " + acctNumber;
            msg = msg + " Requested: " + fmt.format(amount);
            throw new IllegalArgumentException(msg);
        }
        else if (amount > balance) // withdraw value exceeds balance
        {

            msg = "Error: Insufficient funds.";
            msg = msg + " Account: " + acctNumber;
            msg = msg + " Requested: " + fmt.format(amount);
            msg = msg + " Available: " + fmt.format(balance);
            throw new RuntimeException(msg);
        }
        else
            balance = balance - amount;

        return balance;
    }

    // -----------------------------------------------------------------
    // Adds interest to the account and returns the new balance.
    // -----------------------------------------------------------------
    public double addInterest() {
        balance += (balance * RATE);
        return balance;
    }

    // -----------------------------------------------------------------
    // Returns the current balance of the account.
    // -----------------------------------------------------------------
    public double getBalance() {
        return balance;
    }

    // -----------------------------------------------------------------
    // Returns the account number.
    // -----------------------------------------------------------------
    public long getAccountNumber() {
        return acctNumber;
    }

    // -----------------------------------------------------------------
    // Returns a one-line description of the account as a string.
    // -----------------------------------------------------------------
    public String toString() {
        return (acctNumber + "\t" + name + "\t" + fmt.format(balance));
    }
}
