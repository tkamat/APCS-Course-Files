/**
 * Tests the Dispenser and CashRegister classes
 *
 * @author Tushaar Kamat
 * @version 03/31/2017
 */
public class CandyMachine {
    public static void main(String args[]) {
        Dispenser d = new Dispenser(100, 99);
        CashRegister c = new CashRegister();
        System.out.println("Original dispenser:");
        System.out.println(d);
        System.out.println();
        System.out.println("Original cash register:");
        System.out.println(c);
        System.out.println();
        System.out.println("Selling 3 items:");
        sellProduct(d, c, 3);
    }

    public static void sellProduct(Dispenser d, CashRegister c, int amount) {
        for (int i = 0; i < amount; i++) {
            if (d.getNumberOfItems() == 0) {
                System.out.println("Dispenser is out of items, sorry.");
                return;
            }
            else {
                d.makeSale();
                c.acceptAmount(d.getCost());
            }
        }
        System.out.println("Collect your item(s) at the bottom and enjoy!");
    }
}
