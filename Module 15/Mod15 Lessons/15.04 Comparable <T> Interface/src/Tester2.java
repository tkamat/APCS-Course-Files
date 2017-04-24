

/**
 * Tester2 tests the BeadedJava2 class.
 * <p>
 * <p>
 * <p>
 * �FLVS 2007
 *
 * @author R. Enger
 * @version 6/1/07
 */

public class Tester2

{

    public static void main(String[] args)

    {


        BeadedJean2 pair1 = new BeadedJean2(3, 10, 10);

        BeadedJean2 pair2 = new BeadedJean2(3, 30, 10);


        pair1.design();

        pair2.design();


        System.out.println(pair1);

        System.out.println(pair2);


        if (pair1.compareTo(pair2) == 0)

            System.out.println("\nThey are the same size using compareTo().");

        else

            System.out.println("\nThey are not the same size using compareTo().");

    }

}

