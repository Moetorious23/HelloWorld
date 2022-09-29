package BasicApps;

import java.util.Scanner;
import java.util.Arrays;

public class practice {
	public static void main(String[] args) {
/*
int[] numbers = { 18,24,56,78,96,33,32,14,5778} ;
	



		for (int t = 0;t<numbers.length ; t++ ){ // t is the index
			int ans= multiplier *t; // to optimize code such that any time tables can be used
			System.out.println("2 * " + t + "= "+ ans);
			if (numbers [i] %2==0) {
		// I want to optimize this code such that it would run the time a million times by adding 
			//i<numbers.length, condition will run 2 million times if you have 2 conditions
			// we try to avoid else block as much possible.
				System.out.println ( " number is even");			
		}
			if (numbers [i] %2!=0) {
				System.out.println (" number is odd"); // will run 2 mill times
				//if you do else if it will run 1 mill times
				*/
	
				// gathering array data from console
	/*	int n;
		  Scanner in = new Scanner (System.in);

	        System.out.println( " Enter the number of elements in the array:");
	        
	       
	        n= in.nextInt(); //  this stores the memory length of the array
	        
	        int [] arr = new int [n]; 
	        
	        System.out.println("Enter the elements of the array;");
	        
	        for (int i=0; i<n ; i++) {
	        	arr[i]=in.nextInt();	// to enter the number of elements in the array
	        
	        	
	       for (int j = 1; j< arr.length; j++) {
												
				int temp = arr[j];
	            int possibleIndex = j;
	            while (possibleIndex>0 && temp< arr[possibleIndex -1]) {
					arr[possibleIndex] = arr[possibleIndex-1];
					possibleIndex--;
					
	            }
				arr[possibleIndex]= temp;
	       }
	      System.out.println(Arrays.toString(arr));
	   }
	*/
		Scanner in= new Scanner (System.in);
		System.out.println("Enter 0 to view menu option:");
		Double x = in.nextDouble();
		
		
		if (x==5) {
			
			do {
				String as =in.nextLine();
				System.out.println("Enter string:");
				
				/*
				String g =in.nextLine();
				int len = g.length();
				System.out.println("The number of characters in the string is " + len);
				
				
				
				
				System.out.println("To continue calculation Press 1 else Press any button to exit");
				Double z= in.nextDouble();
				
				if (z!= 1) {
					break;
				}
			}while (true);
		}

			
			}
			
	


			
	





