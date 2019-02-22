import java.util.Scanner;

public class CS112_Assignment5_2_Q3_kkosis
{
	public static void main(String[] args)
	{
	  TemperatureClass temp1, temp2, temp3, temp4, temp5, testTemp1, testTemp2, testTemp3;
	  temp1 = new TemperatureClass(); // call the no args constructor
	  temp2 = new TemperatureClass(30); // call the tempValue constructor
	  temp3 = new TemperatureClass('F'); // call the scale constructor
	  temp4 = new TemperatureClass(100,'C'); // call the tempValue+scale constructor
	  testTemp1 = new TemperatureClass(0,'C');
	  testTemp2 = new TemperatureClass(-40,'F');
	  testTemp3 = new TemperatureClass(212, 'F');
	
	  // TESTING TEMP1
	  System.out.println("\nTests on Temp 1:");
	  System.out.println("Preset temperature: " + temp1.toString()); // show the preset temperature
	  temp1.setTempValue(24); // use the setTempValue method
	  System.out.println("Temp after using the setTempValue method to set the temp to 24: " + temp1.toString()); // see if setTempValue method worked
	  System.out.println("Temp in F when using the getTempinF/convertGetTempInFToString method: " + temp1.convertGetTempInFToString()); // see if convertGetTempInFToString worked
	  temp1.setTempandScale(-40,'C'); // use setTempandScale method
	  System.out.print("Testing the equals method: ");
	  if(temp1.equals(testTemp2)) // test the equals method
	  	System.out.println(temp1 + " equals " + testTemp2);
	  else
	  	System.out.println(temp1 + " does not equal " + testTemp2);
	  System.out.print("Testing the greaterThan method: ");
	  if(temp1.greaterThan(testTemp2)) // test the greaterThan method
	  	System.out.println(temp1 + " is greater than " + testTemp2);
	  else
	  	System.out.println(testTemp2 + " is greater than or equal to " + temp1);
	  System.out.print("Testing the lessThan method: ");
	  if(temp1.lessThan(testTemp2)) // test the lessThan method
	  	System.out.println(temp1 + " is less than " + testTemp2);
	  else
	  	System.out.println(testTemp2 + " is less than or equal to " + temp1);

	  // TESTING TEMP2
	  System.out.println("\nTests on Temp 2:");
	  System.out.println("Preset temperature: " + temp2.toString()); // show the preset temperature
	  temp2.setScale('F'); // use the setScale method
	  System.out.println("Temp after using the setScale method to set the scale to F: " + temp2.toString()); // see if setScale method worked
	  System.out.println("Temp in C when using the getTempinC/convertGetTempInCToString method: " + temp2.convertGetTempInCToString()); // see if convertGetTempInCToString worked
	  temp2.setTempandScale(100, 'C'); // use setTempandScale method
	  System.out.print("Testing the equals method: ");
	  if(temp2.equals(testTemp3)) // test the equals method
	  	System.out.println(temp2 + " equals " + testTemp3);
	  else
	  	System.out.println(temp2 + " does not equal " + testTemp3);
	  System.out.print("Testing the greaterThan method: ");
	  if(temp1.greaterThan(testTemp3)) // test the greaterThan method
	  	System.out.println(temp2 + " is greater than " + testTemp3);
	  else
	  	System.out.println(testTemp3 + " is greater than or equal to " + temp2);
	  System.out.print("Testing the lessThan method: ");
	  if(temp1.lessThan(testTemp3)) // test the lessThan method
	  	System.out.println(temp2 + " is less than " + testTemp3);
	  else
	  	System.out.println(testTemp3 + " is less than or equal to " + temp2);

	  // TESTING TEMP3
	  System.out.println("\nTests on Temp 3:");
	  System.out.println("Preset temperature: " + temp3.toString()); // show the preset temperature
	  temp3.setTempValue(32); // use the setTempValue method
	  System.out.println("Temp after using the setTempValue method to set the temp to 32: " + temp3.toString()); // see if setTempValue method worked
	  System.out.println("Testing the equals method:");
	  if(temp3.equals(testTemp1)) // test the equals method
	  	System.out.println(temp3 + " equals " + testTemp1);
	  else
	  	System.out.println(temp3 + " does not equal " + testTemp1);
	  System.out.println("Testing the greaterThan method:");
	  if(temp3.greaterThan(testTemp1)) // test the greaterThan method
	  	System.out.println(temp3 + " is greater than " + testTemp1);
	  else
	  	System.out.println(testTemp1 + " is greater than or equal to " + temp3);

	  // TESTING TEMP4
	  System.out.println("\nTests on Temp 4:");
	  System.out.println("Preset temperature: " + temp4.toString()); // show the preset temperature
	  temp4.setTempandScale(130,'C');
	  
	}
}