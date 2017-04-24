/**
 * Represents a Cash Register using cash on hand
 *
 * @author Tushaar Kamat
 * @version 03/31/2017
 */
public class CashRegister {

    private int cashOnHand;

    /**
     * Default constructor
     */
    public CashRegister() {
        cashOnHand = 500;
    }

    /**
     * @param cashOnHand
     */
    public CashRegister(int cashOnHand) {
        if (cashOnHand < 1)
            throw new IllegalArgumentException("Argument must be greater than 0!");
        this.cashOnHand = cashOnHand;
    }

    public void acceptAmount(int amount) {
        if (amount < 1)
            throw new IllegalArgumentException("Argument must be greater than 0!");
        cashOnHand += amount;
    }

    @Override
    public String toString() {
        return cashOnHand + " dollars on hand.";
    }

}

