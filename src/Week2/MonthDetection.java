package Week2;
import java.util.Scanner;

class Month { // not a good practice to put more than 1 class in a file 
			  // this is for assignment ,one condition is that atleast one class amtches the file 
			  // name MonthDetection
			// we do this bc we need to be able to communicate with both classes
	
	String printMonth(int month) {	// this is to create a printMonth method for the month class
		
		String str = "";
		 Scanner input = new Scanner( System.in);
		

		
		switch (month){
		    case 1:
		str = "January";
		break;

		   case 2:  
		str= "Febuary";
		break;

		  case 3:
		str ="March";
		break;

		    case 4:
		    
		str = "April";
		break;

		case 5:
		  
		str = "May";
		break;

		case 6:
		str ="June";
		break;

		case 7:
		str="July";
		break;

		case 8:
		str = "August";
		break;

		case 9: 
		str ="September";
		break;

		case 10: 
		str= "October";
		break;

		case 11: 
		str ="November";
		break;

		case 12:
		str ="December";
		break;

		default:
		System.out.println( "Invalid month number!" );

		System.out.println( "" );

		System.out.println ("Please select a number between 1 to 12.");
		}
		
		return str;
		}
}
	
	

public class MonthDetection {// creating MonthDetection class

	public static void main(String[] args) {
	// create an object of  the class month
	Month obj = new Month();
	
	//create scanner 
	Scanner input= new Scanner (System.in);
	
	// to get user input
	System.out.println(" Enter the month number:");
	int month = input.nextInt(); 
	
	// to convert month number/ user input to the month name
	String str= obj.printMonth(month);
	
	System.out.println("The month is " + str);

	}

}
