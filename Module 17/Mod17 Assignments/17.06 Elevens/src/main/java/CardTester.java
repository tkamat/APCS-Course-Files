/**
 * This is a class that tests the Card class.
 */
public class CardTester {

    /**
     * The main method in this class checks the Card operations for consistency.
     *
     * @param args
     *            is not used.
     */
    public static void main(String[] args) {
        Card aceOfSpades = new Card("ace", "spades", 1);
        Card aceOfSpades2 = new Card("ace", "spades", 1);
        Card queenOfDiamonds = new Card("queen", "diamonds", 12);
        System.out.println("Ace of Spades:");
        System.out.println(aceOfSpades);
        System.out.println(aceOfSpades.rank());
        System.out.println(aceOfSpades.suit());
        System.out.println(aceOfSpades.pointValue());
        System.out.println();
        System.out.println("Queen of Diamonds:");
        System.out.println(queenOfDiamonds);
        System.out.println(queenOfDiamonds.rank());
        System.out.println(queenOfDiamonds.suit());
        System.out.println(queenOfDiamonds.pointValue());
        System.out.println();
        System.out.println("Comparisons:");
        System.out.println(aceOfSpades.matches(aceOfSpades2));
        System.out.println(aceOfSpades.matches(queenOfDiamonds));
    }
}
