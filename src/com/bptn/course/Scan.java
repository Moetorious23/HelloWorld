package com.bptn.course;

import java.util.Scanner;

public class Scan {

	
	public static void main(String[] args) {

	/*	Scanner scan = new Scanner(System.in); //Creates a Scanner object. (System.in) represents the keyboard
		
		System.out.println("Enter Username: ");
		
		System.out.println("Enter Username: "); // Reads a String from the console.
		// At this point we see in the console Enter username: . At this point
		// we can write in the console , lets say you write Mohamed and press enter. the info in the console is
		//stored in the username string variable 
		// different types of reading next, e.g reading nextint , for reading a number
		
		System.out.println("Hello" + username); // (the information is now updated in the console/termination
		// not used in interview but used in desktop application */
		
		
		
//(Scanner scan = new Scanner(System.in)) {
//	System.out.println("Enter Username: ");
//	
//	int age = scan.nextInt(); 
//	
//	System.out.println("Hello" + age);
//} 
	
		

// USING ASCII an encoding system which a char has a number, only for english language
//UNICODE works with any language in the world
//	char car = 'A';
//	int i = car;
//	System.out.println(i);
//	// We could also do int i = (int)'K'; and the same answer will pop up 
//	
//	
//				//FLOW CONTROL STATEMENT e.g if statement bc we control flow of the statement another example
//				//is the flow loop
//	

				//EXAMPLE FOR SCAN TO USE//
		
	Scanner value = new Scanner (System.in); // you are creating the scanner
	
	System.out.println("Enter number here:");
	
	int number; // this is the type of input we see
	
	number = value. nextInt();     // we use value.nextInt bc we need to know where nextInt is actually gonna be used in. when we say value. it will be used from the scanner 
	
	if (number>= 0) {
		System.out.println("number is positive");
	}
	else 
		System.out.println("number is negative");

	
	Scanner pal= new Scanner (System.in);
	System.out.println("Enter the number:");
	int var= pal.nextInt();
	
	
											// creating a calculator for distance and time 
			Scanner value = new Scanner (System.in); 
	
			System.out.println("Input distance in meters and time in HH:MM:SS format:");
			
		
	}
        
    
}






