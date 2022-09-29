package com.bptn.course;
public class ForEach {
	
	
	public static void main(String[] args) {
		// i++ == i=i+1
		
		// initilization ; condition for executing the; increment the variable
		
		int[] arr = { 3, 4, 5, 6};
		//      0 1 2 3 4
		

		for(int i=0; i < arr.length; i++) {

			if (i<=2) {
				System.out.println( arr[i] );
			
			}
		}
	}
}

	
