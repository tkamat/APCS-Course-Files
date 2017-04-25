public class Restock
 {
    public static void main(String[] args)
    {
        int year = 2006; //initial year
        int fishPop = 12500; //max fish population
        double decreaseRate = .224; //annual rate of decrease

        while(fishPop >= 2500)
        {
           fishPop -= (int)(fishPop* decreaseRate);
           year++;
        }
        System.out.print("In " + year 
                        + " the population will decrease to "
                        + fishPop ); 
    }//end of main method
 }//end of class