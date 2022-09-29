package BasicApps;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		double num1, num2, result;
	    double condition, choice;

	    Scanner scan = new Scanner(System.in);

	    do {
	      System.out.println("/*................Calculator Menu................*/");
	      System.out.println("Press 1 for addition");
	      System.out.println("Press 2 for subtraction");
	      System.out.println("Press 3 for Multiplication");
	      System.out.println("Press 4 for Division");
	      System.out.println("Press 5 for finding Square");
	      System.out.println("Press 6 for finding Square root");
	      System.out.println("Press 7 for finding Reciprocal");

	      choice = scan.nextDouble();

	      if (choice == 1) {
	        System.out.println("Enter the first number");
	        num1 = scan.nextDouble();
	        System.out.println("Enter the second number");
	        num2 = scan.nextDouble();
	        result = num1 + num2;
	        System.out.println("The sum of the numbers " + num1 + " and " + num2 + " is = " + result);
	      }else if (choice==2) {
					 				 		
			System.out.println("Enter first number: ");
			double e = scan.nextDouble();
			System.out.println("Enter second number: ");
			double f = scan.nextDouble();
			double sub= e-f; 
			System.out.println("Reduction of "+ e + " and " + f + " is " + sub );	
							
	      } else if (choice==3)	{
					 				 	
			System.out.println("Enter first number: ");
			double g = scan.nextDouble();
			System.out.println("Enter second number: ");
			double h = scan.nextDouble();
			double mult= g*h; 
			System.out.println("Product of "+ g + " and " + h + " is " + mult );	

	      
	    }else if (choice == 4){
	                         
	        System.out.println("Enter the first number: ");
	        num1 = scan.nextDouble();
	        System.out.println("Enter second number: ");
	        num2 = scan.nextDouble();
	        double answer = num1/num2;
	        System.out.println("The result of " + num1 + " / " + num2 + " = " + answer);
	     
	    } else if(choice == 5) {
	            System.out.println("Enter a number to find the square");
	            num1 = scan.nextDouble();
	            result = (num1 * num1);
	            System.out.println("The square of " + num1 + " is = " + result);
	    

	    }else if (choice == 6) {
	        System.out.println("Enter a number to find the square root");
	        num1 = scan.nextDouble();
	        result = Math.sqrt(num1);
	        System.out.println("The square root of " + num1 + " is: " + result);

	    }else if (choice == 7) {
	        System.out.println("Enter a number to find the reciprocal");
	        num2 = scan.nextDouble();
	        result = 1/num2;
	        System.out.println("The reciprocal of " + num2 + " is: " + result);

	    }  else {
	        System.out.println("invalid choice");
	    }

	      System.out.println("To continue calculation Press 1 or Press any number to exit");

	      condition = scan.nextInt();
	      
	    } while (condition == 1);               
	  
	  
	  }
	}
