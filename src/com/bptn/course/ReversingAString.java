package com.bptn.course;


public class ReversingAString {

	public static void main(String[] args) {
		
		
		
		String am = "Hello" ; 
		
		
	//USE A STRING BUFFER , it is a class that has the reverse function. 
		StringBuffer am1 = new StringBuffer(); // to create a new buffer string ,can be altered, remember strings themselves are immutable
		
		 am1.append(am);      //append function is used to convert string to buffer string
		 am1.reverse();		  // used to reverse buffer string
		 System.out.println(am);
		System.out.println(am1);
		
		
	}


	}


