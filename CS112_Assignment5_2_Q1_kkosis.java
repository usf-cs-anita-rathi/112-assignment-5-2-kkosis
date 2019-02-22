import java.util.Scanner;

public class CS112_Assignment5_2_Q1_kkosis
{
	public static void main(String[] args)
	{
	  OdometerClass trip1, trip2, trip3, trip4;
	  trip1 = new OdometerClass(0,12);
	  trip2 = new OdometerClass(300,40);
	  trip3 = new OdometerClass(245,22);
	  trip4 = new OdometerClass(53215,18);

	  // TESTING TRIP1
	  System.out.println();
	  System.out.println("Tests on Trip 1:");
	  System.out.println("Trip Presets: " + trip1.toString());
	  trip1.setFuelEfficiency(16); // set a new fuel efficiency 
	  System.out.println("You have consumed " + trip1.consumedGasoline() + 
	  						" gallons of gas since you last reset your odometer.");

	  // TESTING TRIP2
	  System.out.println();
	  System.out.println("Tests on Trip 2:");
	  System.out.println("Trip Presets: " + trip2.toString());
	  trip2.addTripMiles(223); // add trip miles with addTripMiles method
	  System.out.println("New Odo reading after using addTripMiles method: " + trip2.toString());
	  System.out.println("You have consumed " + trip2.consumedGasoline() + 
	  						" gallons of gas since you last reset your odometer.");

	  // TESTING TRIP3
	  System.out.println();
	  System.out.println("Tests on Trip 3:");
	  System.out.println("Trip Presets: " + trip3.toString());
	  System.out.println("You have consumed " + trip3.consumedGasoline() + 
	  						" gallons of gas since you last reset your odometer.");
	  // TESTING TRIP4
	  System.out.println();
	  System.out.println("Tests on Trip 4:");
	  System.out.println("Trip Presets: " + trip4.toString());
	  trip4.resetMiles();
	  System.out.println("New Odo reading after using resetMiles method: " + trip4.toString());
	  trip4.addTripMiles(1000);
	  System.out.println("New Odo reading after using addTripMiles method: " + trip4.toString());
	  System.out.println("You have consumed " + trip4.consumedGasoline() + 
	  						" gallons of gas since you last reset your odometer.");
	}
}