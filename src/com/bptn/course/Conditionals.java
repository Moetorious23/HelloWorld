package com.bptn.course;

public class Conditionals {

	public static void main(String[] args) {

//		
//		int a = 8;
//		int b = 5;
//		if (a > b) {
//			System.out.println(a + " " + "is bigger than" + " " + b);
//			// Ctrl + shift + f
//			// if a is not greater than b, and you run the above code, the console/terminal
//			// will not print, the above is called an if block
//			
//		}
//
//		// We are now going to add an else statement if the condition evaluates false
//		// below is an else block
//
//		else {
//			System.out.println(a + " " + "is smaller than" + " " + b);
//		// if a= 2 , b=2 , the if block wont run, but the if block will bc
//		// else is a false statement , a>b is false, so thats why the else block ran even though 2 isnt actually smaller than 2
		
		
//		int c = 3;
//		int d = 4;
//		{
//		if (c > d) {
//		System.out.println(c + " " + "is bigger than" + " " + d);
//		}
//		// with else if, java will look for the correct statement to execute
//		 else if (c < d) {
//			 System.out.println(c + " " + "is less than" + " " + d);
//		 }
//		 else  {
//			 System.out.println(c + " " + "is equal to" + " " + d);
		 
		// if somehow you are in a scenario where 2 conditions are met, the first condition that is meant will print the one after wont
		// even tho java allows us to run as many else and if  statements as possible but it isnt acceptable, max you should use 3 else if statements (1 if statement+ 2 else if statement), if you have to use more than you have to try to find another solution
	
	// We are now going to do a nested statement (if statement inside an if statement)
	
	int e = 2;
	int f= 3;
	int g= 5; 
	
	if (e > f) {
		if (e < g) {
			System.out.println(e + " " + "is bigger than" + " " + f);
		} else {
				System.out.println(e + " " + "is less than" + " " + f);
		}

		} else {
		System.out.println(e + " " + "is less than" + " " + f);
	}
//	// When you run this program the else statement will run bc line 48 is false , so it goes to the else directly
				
//	int a = 7;
//	int b = 6; {
//	 if (a < b) 
//		 System.out.println(a +  " " + " " + " is bigger than" + " "+ b);
//	
//	 
//	else if (a > b)
//		 
//			 System.out.println(a +  " " + " " + " is less than" + " "+ b);
//			 
//			 else {
//				 System.out.println(a + " " + " is equal to" + " " + b);
	int a= 4;
	int b = 6;
	int c = 7;
	
	if (c > a) {
		if (c > b) {
			System.out.println(" good morning");
		} else {
			System.out.println("bye");
		}
	
	}
	else {
		System.out.println("hola");
		
	}
	
			 
	
	

					// Try the following code. Add an else statement to the if statement that prints out “Good job!” if the score is greater than 9. 
					//Change the value of score to test it. Can you change the boolean test to only print out “Good job” if the score is greater than 20?

//		int d = 5 ;{
//		if (d > 9) {
//			System.out.println(" Good Job!");
//		}
//		else {
//			System.out.println("try again");
//		}


			

		
		
	

}
}
}


