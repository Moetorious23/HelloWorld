package com.bptn.course;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		
	/*	Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number here: ");
		int s = obj.nextInt(); //Int is capitalized bc the value is stored to an address 
		int j=0 ;// 
		int n= s; 
		
	while (n>0) {
		int rev= n%10 ; //you want to create another variable to store remainders
		n= n/10; 
		j=(10*j)+ rev ;
	}
		
	if (j==s ) {
		System.out.println("number is a palindrome");
	}
	else {
		System.out.println("it is not");
	obj.close(); // to close while loop as it will run inifinitely if not*/   
		//Below is a palindrome for strings
		
		
							// To reverse a number method 1
		int inputNumber =143;
		int valueReversed = 0 ;
		int remainderValue = 0;

		while (inputNumber>0)   {
		valueReversed= (valueReversed*10) +inputNumber%10 ;
		inputNumber= inputNumber/10;
		System.out.println(valueReversed );
		}
		

		}
	
		// To reverse a number method 2
		//number = 1234
		//remainder = 1234 % 10 = 4
		//reverse = 0 * 10 + 4 = 0 + 4 = 4
		//number = 1234 / 10 = 123
	//ALGORITHM : first we need to find a way to grab the last number =4
	 			// then grab the next number without 3, without including number 4
				// then grab 2 without 3 and 4
				// then grab 1 without including 2,3 ,4 . leaving that number to now be 0
	/*
		int num = 1234;
		int rem = 0; // gives 4
		
		int rev= 0 ; // initially reverse =0 , algorithm will finish when  number =0 the abover process has to be completed multiople times till the number =o , so we use a while loop
		
		while (num!=0) { // or we could use num>0 ,
			rem= 1234%10;    // gives 4
			rev = (rev*10 )+ rem; // gives 4 
			num = num/10 ; // here we prepare the number for next iteration
		}
		System.out.println("The reversed number is " + rev)
			
		}
		*/
		
		
			
		
		
		
	
	
}




