import java.util.Scanner;
import java.text.DecimalFormat;
public class StudentRecordClass
{
	public double quizScore1;
	public double quizScore2;
	public double quizScore3;
	public double midtermScore;
	public double finalExamScore;
	private double numericGrade;
	DecimalFormat formattingObject = new DecimalFormat("#0.0#");

	// create 'set' methods to let the user set each score
	public void setQuizScore1(double newQuizScore1){
		quizScore1 = newQuizScore1;}
	public void setQuizScore2(double newQuizScore2){
		quizScore2 = newQuizScore2;}
	public void setQuizScore3(double newQuizScore3){
		quizScore3 = newQuizScore3;}
	public void setMidtermScore(double newMidtermScore){
		midtermScore = newMidtermScore;}
	public void setFinalExamScore(double newFinalExamScore){
		finalExamScore = newFinalExamScore;}

	public void numericGrade(){ // create mutator method to calculate and display numeric grade
		numericGrade = (((((quizScore1 + quizScore2 + quizScore3)/30)*57.5) + 
						((midtermScore/100)*80.5) +  
						((finalExamScore/100)*92.0))/230)*100;
		System.out.println("Student's numeric grade as a %: " + formattingObject.format(numericGrade) + "%");}

	public void displayLetterGrade(){ // accessor method to use the private variable 'numericGrade' and display the letter grade
		if(numericGrade >= 90)
			System.out.println("Student's letter grade: A");
		else if(numericGrade >=80)
			System.out.println("Student's letter grade: B");
		else if(numericGrade >= 70)
			System.out.println("Student's letter grade: C");
		else if(numericGrade >= 60)
			System.out.println("Student's letter grade: D");
		else
			System.out.println("Student's letter grade: F");}

	public String toString(double numericGradeDouble){ // toString method to convert int numeric grades into string letter grades
		if(numericGradeDouble >= 90)
			return("A");
		else if(numericGradeDouble >= 80)
			return("B");
		else if(numericGradeDouble >= 70)
			return("C");
		else if(numericGradeDouble >= 60)
			return("D");
		else
			return("F");}

	public boolean equals(String otherLetterGrade) { // equals method using the toString method to compare grades
		return(toString(numericGrade).equals(otherLetterGrade));} 
}




