import java.util.Scanner;
import java.text.DecimalFormat;

public class TemperatureClass
{
	private float tempValue;
	private char scale;
	DecimalFormat df = new DecimalFormat("###0.0");

	// Create constructor methods
	public TemperatureClass(float newTempValue){ // set scale to default when only temp is specified
		tempValue = newTempValue;
		scale = 'C';}
	public TemperatureClass(char newScale){ // set tempValue to 0 when only scale is specified
		this.scale = newScale;
		tempValue = 0;}
	public TemperatureClass(float newTempValue, char newScale){ // set instance variables when both parameters are specified
		tempValue = newTempValue;
		scale = newScale;}
	public TemperatureClass() { // if no values are specified, go to default
		tempValue = 0;
		scale = 'C';}

	// create accessor methods to return temp in F or C
	public float getTempInF(){ // convert C to F and return a float
		if(scale == 'F')
			return(tempValue);
		else
			return((9*tempValue/5+32));}
	public float getTempInC(){ // convert F to C and return a float
		if(scale == 'C')
			return(tempValue);
		else
			return((5*(tempValue-32)/9));}
	public String convertGetTempInFToString(){ // convert C to F and return a string for display purposes
		if(scale == 'F')
			return((df.format(this.tempValue)) + 'F');
		else
			return((df.format(9*this.tempValue/5+32)) + 'F');}
	public String convertGetTempInCToString(){ // convert C to F and return a string for display purposes
		if(scale == 'C')
			return((df.format(this.tempValue)) + 'C');
		else
			return((df.format(5*(this.tempValue-32)/9)) + 'C');}

	// create mutator methods
	public void setTempValue(float newTempValue){ // set tempValue
		tempValue = newTempValue;}
	public void setScale(char newScale){ // set scale
		scale = newScale;}
	public void setTempandScale(float newTempValue, char newScale){ // set tempValue and scale
		tempValue = newTempValue;
		scale = newScale;}

	// create toString method 
	public String toString(){
		return(df.format(this.tempValue) + this.scale);}

	// create comparison methods
	public boolean equals(TemperatureClass otherTemp){ // see if temps are equal
		return(this.getTempInC() == otherTemp.getTempInC() ||
				this.getTempInF() == otherTemp.getTempInF());}
	public boolean greaterThan(TemperatureClass otherTemp){ // see if one temp is > than another
		return(this.getTempInC() > otherTemp.getTempInC() ||
				this.getTempInF() > otherTemp.getTempInF());}
	public boolean lessThan(TemperatureClass otherTemp){ // see if one temp is < than another
		return(this.getTempInC() < otherTemp.getTempInC() ||
				this.getTempInF() < otherTemp.getTempInF());}

}



