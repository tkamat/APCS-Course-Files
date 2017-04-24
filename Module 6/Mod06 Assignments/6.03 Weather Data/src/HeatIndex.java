/**
 * Calculates heat index for a specific city
 *
 * @author Tushaar Kamat
 * @version: 8/29/16
 *
 */

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import  java.io.PrintWriter;

public class HeatIndex
{
    public static void main(String[] args) throws IOException
    {
    	//initialize and declare vars

        String location = "Key West, Florida";
        File fileNameTemp = new File("KeyWestTemp.txt");
        File fileNameHumid = new File("KeyWestHumid.txt");

        Scanner inFileTemp = new Scanner(fileNameTemp);
        Scanner inFileHumid = new Scanner(fileNameHumid);
        PrintWriter outFile = new PrintWriter(new File("KeyWestHeatIndex.txt"));

        String [] month = {"January", "February", "March", "April", "May", "June",
                            "July", "August", "September", "October", "November", "December"};
        int length = month.length;
        double [] temperature = new double[length];
        int [] humidity = new int[length];
        double [] hI = new double[length];


		//INPUT - read in data for temp and humidity from files

		int n = 0; //index value for arrays
        while( inFileTemp.hasNextDouble() )
        {
            temperature[n] = inFileTemp.nextDouble( );
            //System.out.println (temperature[n]); //debug statement - uncomment to see values assignned to temperature
            n++;
        }
        inFileTemp.close();


        n = 0; //reset index to 0
        while (inFileHumid.hasNextDouble())
        {
                humidity[n] = inFileHumid.nextInt( );
                //System.out.println (humidity[n]);  //debug statement - uncomment to see values assignned to humidity
                n++;
        }
        inFileHumid.close();

		//PROCESSING - calculate Heat Index if needed- see lecture notes for details, formula is incomplete

		double t = 0.0;
		int h = 0;

        for(n = 0; n < hI.length; n++)
        {
            if( temperature[n] >= 80.0  ) //determine if HI should be calculated, complete the condition based on Lecture notes
            {
            	t = temperature[n];
            	h = humidity[n];

                hI[n] = -42.379 + (2.04901523 * t) + (10.14333127 * h) - (0.22475541 * t * h) - (6.83783E-3 * t * t)
                        - (5.481717E-2 * h * h) + (1.22874E-3 * t * t * h) + (8.5282E-4 * t * h * h) - (1.99E-6 * t * t * h * h);    //complete formula found in lecture notes
            }
            else  // HI is the temperature value
            {
                hI[n] = temperature[n];
            }
        }


        //calculate averages for temperature, humidity and HI

        double tempSum = 0.0;
        double humidSum = 0.0;
        double hISum = 0.0;

        for(n = 0; n < temperature.length; n++)
        {
        	tempSum += temperature[n];
        }
        for (n = 0; n < humidity.length; n++) {
            humidSum += humidity[n];
        }
        for (n = 0; n < hI.length; n++) {
            hISum += hI[n];
        }

        double tempAvg = tempSum/temperature.length;
        double humidAvg = humidSum / humidity.length;
        double hIAvg = hISum / hI.length;


        //OUTPUT - print table. Use enhanced for loops to print the months, temp, humidity and HI

        System.out.printf("               Heat Index: %15s \n ", location);
        System.out.println();


        System.out.println("                           Months ");
        System.out.print("            ");
        for(String m : month)
        {
            System.out.printf("   %3.3s", m);
        }


        System.out.println("  Avg");
        System.out.println("******************************************************************************************");


        System.out.print("Temp (F)    ");
         //for:each loop to print temperature
        for (double tempSingle : temperature) {
            System.out.printf("%6.1f", tempSingle);
        }

		//print average
        System.out.printf("%6.1f", tempAvg);
        System.out.println();

        System.out.print("Humidity (%)");
        //for:each loop to print humidity
        for (int humidSingle : humidity) {
            System.out.printf("%6d", humidSingle);
        }

        //print average
        System.out.printf("%6.1f", humidAvg);
        System.out.println();

        System.out.print("HI (F)      ");
        //for:each loop to print HI
        for (double hISingle : hI) {
            System.out.printf("%6.1f", hISingle);
        }

        //print average
        System.out.printf("%6.1f", hIAvg);
        System.out.println();

        //heat index written to a file
        for (double hISingle : hI) {
            outFile.printf("%3.1f%n", hISingle);
        }
        outFile.close();
    } //end main()
}//end HeatIndex
