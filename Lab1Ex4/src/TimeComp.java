//Lab 1 - Exercise 4
//Christina Sosa
//Programming Fundamentals, Summer 2021

import java.util.Scanner;

public class TimeComp {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		int sec=0; //seconds
		int min=0; //minutes
		int hr=0; //hours
				
		System.out.print("What is the total number of Seconds?");
		sec=scan.nextInt(); 
		if(sec>= 60) {
			min=sec/60; 
			sec=sec-min*60; 
		}
		if(min>=60) {
			hr=min/60; 
			min=min-hr*60; 
		}
		System.out.println("Hours:" + hr + " Minutes:" + min + " Seconds:" + sec); 
	}

}