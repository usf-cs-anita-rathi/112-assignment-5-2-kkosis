import java.util.Scanner;

public class CS112_Assignment5_2_Q2_kkosis
{
	public static void main(String[] args)
	{
		// Create 'input' object from 'Scanner' class
		Scanner input = new Scanner(System.in);


		// Create the 'student' object in the class 'StudentRecordClass'
		StudentRecordClass student;
		student = new StudentRecordClass();


		/* --------------------------------------------------------- */
		// USER INPUT:
		// Ask user to input the student's quiz scores 1, 2, and 3
		System.out.println("Input the student's score for Quiz 1 (out of 10 points): ");
		student.setQuizScore1(input.nextDouble());
		System.out.println("Input the student's score for Quiz 2 (out of 10 points): ");
		student.setQuizScore2(input.nextDouble());
		System.out.println("Input the student's score for Quiz 3 (out of 10 points): ");
		student.setQuizScore3(input.nextDouble());

		// Ask user to input the student's midterm score
		System.out.println("Input the student's midterm score (out of 100 points): ");
		student.setMidtermScore(input.nextDouble());

		// Ask user to input the student's final exam score
		System.out.println("Input the student's final exam score (out of 100 points): ");
		student.setFinalExamScore(input.nextDouble());
		System.out.println();


		/* --------------------------------------------------------- */
		// PROGRAM OUTPUT
		// Calculate and display the student's numeric grade
		student.numericGrade();

		// Display the letter grade using equals/toString methods
		if(student.equals("A"))
			System.out.println("Student's letter grade: A");
		else if(student.equals("B"))
			System.out.println("Student's letter grade: B");
		else if(student.equals("C"))
			System.out.println("Student's letter grade: C");
		else if(student.equals("D"))
			System.out.println("Student's letter grade: D");
		else
			System.out.println("Student's letter grade: F");
		System.out.println();

	}
}