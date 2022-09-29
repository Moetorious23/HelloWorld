package com.bptn.course;

public class Strings {

	public static void main(String[] args) {
		//ctrl d , to delete a whole line
		/* two types of variables in Java 
		 
		 Primitives (always in lower case)
		 
		 int
		 long
		 byte
		 float
		 boolean
		 
		 
		 Class Variable (starts with a capital case)/ another word for class variable is object variable
		 
		 String
		 System
		 
		 
		 */
		
	/*	Integer a= 4;
		int b= 3; // Java will not allow int b= null;
		b=a; //java will run this 
		
		String s1 = "Hi";
		String s2 = s1.substring(0,1);// 
		String s3 = s2.toLowerCase();
		
		System.out.println(s3); */
		
		String message = 
			       " backslashed backslash \\ " +   "Backslash n \n"; // when you have a backslash in a code it escapes/ erases the previous char
																	  // it will run backslashed back slash \ and Backslash n
	
			     System.out.println(message);
			     
			     						// STRING METHODS
			     String message1= "this is a test";
			   System.out.println (message1.length()); // .length is a method of the Class String (message1)
			   System.out.println(message1.indexOf("a"));
			   System.out.println(message1.substring(4,13));
			   
			   System.out.println(message1.compareTo("thjt"));
			  
			    
	}

}
