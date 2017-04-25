/**
 * Displays the average temperature and the annual precipitation for Jacksonville.
 *
 * @author: Tushaar Kamat
 * @version: 8/28/16
 *
 */

import java.util.Scanner;
class AnnualClimate
{

   	public static void main (String [ ] args)
	{

		//Declare and intialize variables - programmer to provide initial values
		Scanner in = new Scanner(System.in);
		String city = "Jacksonville";
		String state = "Florida";

		String month [] ={"Jan", "Feb", "Mar", "Apr", "Mat", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		double temperature [] ={53.1, 55.8, 61.6, 66.6, 73.4, 79.1,
								81.6, 80.8, 77.8, 69.4, 61.7, 55.0}; 		//initialize with Fahrenheit values
		double precipitation [] ={3.7, 3.2, 3.9, 3.1, 3.5, 5.4,
								  6.0, 6.9, 7.9, 3.9, 2.3, 2.6}; 			//initialize with inches values

		//double temperatureTest [] = {58.4, 60.0, 64.7, 68.9, 74.8, 79.7, 81.7, 81.5, 79.9, 74.0, 67.0, 60.8 };
		//double precipitationTest [] = {3.1, 2.7, 3.8, 2.5, 3.3, 5.7, 5.2, 6.1, 6.6, 4.5, 3.0, 2.7};

		String tempLabel = "F";   //initialize to F
		String precipLabel = "cm"; //initialize to cm

		double average;
		double sumAverage = 0;
		double annual = 0;
		for (int index = 0; index < temperature.length; index++) {
			sumAverage += temperature[index];
		}
		average = sumAverage/temperature.length;
		average = (int)(average * 10) / 10.0;
		for (int index = 0; index < precipitation.length; index++) {
			annual += precipitation[index];
		}
		annual = (int)(annual * 10) / 10.0;


		//INPUT - ask user for temp and preciptation scale choice
		System.out.print("Choose the temperature scale (F = Fahrenheit, C = Celsius): ");
		String tempChoice = in.next();
		System.out.print("Choose the precipitation scale (i = inches, c = centimeteres): ");
		String precipChoice = in.next();


		//PROCESSING - convert from F to C and in to cm based on user's choices
		// remember 5/9 = 0, 5.0/9 = .5555

		if(tempChoice.equalsIgnoreCase("C"))
		{
			tempLabel="(C)";
			for( int index = 0; index < temperature.length; index++)
			{
				//code for assigning new C values to the temperature array
			}

		}

		//Convert in values to cm; replace the current values in precipitation
		if(precipChoice.equalsIgnoreCase("c"))
		{
			precipLabel="(cm)";


		}

		//OUTPUT - print table using printf to format and align data

		System.out.println();
		System.out.println("Climate Data");
		System.out.println("Location: " + city +", " + state);
		System.out.printf("%5s %18s %s %18s %s","Month","Temperature",tempLabel,"Precipitation",precipLabel);
		System.out.println();
		for (int i = 0; i < temperature.length && i < precipitation.length; i++) {
			System.out.print("\t" + temperature[i]);
			System.out.print("\t" + precipitation[i]);
			System.out.println();
		}
		System.out.println();
		System.out.printf("***************************************************");
		System.out.println();
		System.out.println("Average: " + average + "\t" + "Annual: " + annual);




	}//end main
}//end Annual Climate
