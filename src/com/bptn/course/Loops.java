package com.bptn.course;

public class Loops {

	public static void main(String[] args) {
		
		// format below, exp1 =expression 1= initialization side the curly bracket is what gets repeated multiple times
		
		
		
	/*for (int i=0; i<10; i++) {
		// whats in the () does not work outside the loop/outside the {}
		// middle expression if i is less than 10, itll prints (middle expression is the condition for executing the loop
		// last expression is used to specify the increment (add)
		// i++ == i= i +1
		// how it works, first iteration/output in console 0,0 is less than 10, print, then you add 1 to the 0. is 1 less than 10, true 1 will print and then you add another 1 till the 2nd expression is proven false
		// you need a condition to stop the loop, so if expression 2 is true, the loop would be infinite bc you dont have a condition to stop the loop, 
		// i.e 10 is true add 1, itll keep running infinitely bc there isnt  alimit on true
		
		System.out.println(i);// run = 0,1,2,3,4,5,6,7,8,,9
	} */
	    int i = 2;
		int [] a= {3,4,5,6,7};
		System.out.println(a[i]);
//print 3,4,5,6,7 to you will need to fix the i<10 bc there is only 5 items in the array not 10, in this case i in the above becomes the index for the array
	
		
						// FOR LOOPS TO TRAVERSE AN ARRAY
		String[ ] names = {"Jamal", "Emily", "Destiny", "Mateo", "Sofia", "John", "Amy" };

	     for (int i = 0; i < names.length; i++) //(names.length provides the length of the name string)
	     {
	         System.out.println( names[i] );     // to print out every index point of the array
	     }
	
	
	}
	
	

	}


