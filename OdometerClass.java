import java.util.Scanner;

public class OdometerClass
{
	private int milesDriven;
	private int fuelEfficiency;

	public OdometerClass(int startMilesDriven, int startFuelEfficiency)
	{
		milesDriven = startMilesDriven;
		fuelEfficiency = startFuelEfficiency;
	}

	public void resetMiles()
	{
		milesDriven = 0;
	}

	public void setFuelEfficiency(int newFuelEfficiency)
	{
		fuelEfficiency = newFuelEfficiency;
	}

	public void addTripMiles(int tripMiles)
	{
		milesDriven += tripMiles;
	}

	public int consumedGasoline()
	{
		return(milesDriven/fuelEfficiency);
	}

	public String toString()
	{
		return("\nOdometer Reading: " + milesDriven + "\nSet Fuel Efficiency: " + fuelEfficiency);
	}


}