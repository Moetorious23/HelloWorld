package com.bptn.course;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
//		System.out.println("Whats good");
//		
//		System.out.print("bro"); // ln acts as an enter 
//		
//		System.out.println("tm");
//		
//		System.out.println("LR");
//		
		
	/*
		double[] prices = {0.99,0.5,0.4,0.3,0.2};
		System.out.println(prices[2]);
		
		int x = 2; 
		if (x < 0 ) {
			System.out.println("you succcccck"); // 
		// POINT 1     else  {
		//System.out.println("you dont") // 
		}
		
		else {
			System.out.println("you dont"); // if you actually place the else statement or nest it in the if block, it would be an error in this case
											// this is bc, if statements print only if it is true , otherwise it wont print (look at point 1) so you cant
											// go into a nested if the condition is false. it will pop up as Syntax error , look at text.java if you dont understand syntax errors
			
		int b= 85;
		if (b<74) {
			System.out.println("you pass");
		}
			else if (b> 76) {
				System.out.println(" you get an A");  // an else if statement can actually be nested in the if block , even if the if block fails, 
			}
			else {
				System.out.println("you got a 75");
			}
		
		Scanner value = new Scanner (System.in); // you are creating the scanner
		
		System.out.println("Enter number here:");
		
		int number; // this is the type of input we see
		
		number = value. nextInt();     // we use value.nextInt bc we need to know where nextInt is actually gonna be used in. when we say value. it will be used from the scanner 
		
		if (number>= 0) {
			System.out.println("number is positive");
		}
		else 
			System.out.println("number is negative"); */

//			char letter = 'A';
//			int value = (int) letter; 
//			System.out.println(value);
			
			// print numbers between 1-10 on console
			
			//for (int x= 0 ;x <= 10 ; x= x+2) {
			//	System.out.println(x);
		
//									// TRY TO CREATE FIBANACCI SERIES WITH 3 VARIABLES UP T0 10
//		int a = 0;
//		int b = 1;  
//		for (int c = a+b ; c < 50 ; c++) {
//			System.out.println(c);
//			a=b ;
//			b=c;
//				
//			// double num= Math.random(); Math.random is used to generate random numbers between 0 and 1. 
//			
//			
//								// Reverse a number
//			
//			System.out.println("reverse of " + " " + s + " "+ "is" + " " + n);
//				obj.close ();
//				Scanner obj = new Scanner(System.in);
//				System.out.println("Enter the number here: ");
//				int s = obj.nextInt(); //Int is capitalized bc the value is stored to an address 
//				int j=0 ;// 
//				int n= s; 
//				
//			while (n>0) {
//				int rev= n%10 ; //you want to create another variable to store remainders
//				n= n/10; 
//				j=(10*j)+ rev ;
//			}
	
				
		
				//FOR PRINTING EVEN NUMBERS FROM 1-100
			for (int i=1 ; i<=10 ;i++) {
				if(i % 2==0) {
					System.out.println(i);
					
				}
			}
			String original = in.nextLine();
			String reverse = "";
			for(int i =original.length()-1; i>=0 ; i--) {
				
			}
				boolean palindrome = true;
				for (int i =0 ;i < original.length();i--) {
					if(original.charAt(i)!= reverse.charAt(i)) {
						palindrome = false;
						
					}
					if (palindrome) {
						System.out.println("it is a palindrome!");
					}
					else {
						System.out.println("it is not a palindrome!");
					}
				}
			   
			
	}
}



			
			
			
			
		
	


		
		
		
				
		

