//Lab 1 - Exercise 4
//Christina Sosa
//Programming Fundamentals, Summer 2021

import java.util.Scanner;

public class AgeGuess {
	public static void main(String[]args) {
		Scanner scan = new Scanner (System.in);
		
		String name; 
		int ageGuess; 
		
		System.out.println("What is your name?"); //Asking user for name
		name = scan.nextLine(); 
		
		System.out.println("What is your age?"); //Asking user for age
		ageGuess = scan.nextInt(); 
		
		//Reading out name and age to user
		System.out.println("Hello, your name is " + name + " and your are " + ageGuess + " year's old.");
		
	}

}
