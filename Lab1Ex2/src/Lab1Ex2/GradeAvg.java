//Lab 1 - Exercise 2
//Christina Sosa
//Programming Fundamentals, Summer 2021

package Lab1Ex2;

public class GradeAvg {
	public static void main (String[]args) {
		double quizScore1 = 67; 
		System.out.println("Quiz Score 1 is " + quizScore1 + "%"); 
	
		double quizScore2 = 71; 
		System.out.println("Quiz Score 2 is " + quizScore2 + "%");
		
		double quizScore3 = 73; 
		System.out.println("Quiz Score 3 is " + quizScore3 + "%"); 
		
		double testScore1 = 78; 
		System.out.println("Test Score 1 is " + testScore1 + "%"); 
		
		double testScore2 = 88; 
		System.out.println("Test Score 2 is " + testScore2 + "%")
		
		double quizScoreAvg = ((quizScore1+quizScore2+quizScore3)/3); 
		System.out.println("Quiz Score Average is " + quizScoreAvg + "%"); 
		
		double testScoreAvg = ((testScore1+testScore2)/2); 
		System.out.println("Test Score Average is " + testScoreAvg + "%"); 
		

		
	}

}
