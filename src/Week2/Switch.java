package Week2;

public class Switch {

	public static void main(String[] args) {

		//FOrmat of switch
		//switch (expression)     // you are converting a number into a day name below
		// in the switch condition, you will have cases below
		// Switch will print all the cases , even if 1/ 7 is actually true
		// including break is important to prevent the program from jumping to next case
		// Switch has a disadvantage it is less controlled, how can you actually do
		// 25<a<100 , e.g case 25-100 do this/ it doesnt take range in java
		// but with an if statement you can evaluate ranges , 
		// good practice to put all your variables in the method , but there is some flexibility
		// in some cases you wont be able to use a variable outside of your conditional or loop blocks
		
		String str = "";
		int day = 5;
	      
	    	    switch (day) {
	    	      case 1:
	    	        System.out.println("Monday");
	    	        break;
	    	      case 2:
	    	        System.out.println("Tuesday");
	    	        break;
	    	      case 3:
	    	        System.out.println("Wednesday");
	    	        break;
	    	      case 4:
	    	        System.out.println("Thursday");
	    	        break;
	    	      case 5:
	    	        System.out.println("Friday");
	    	        break;
	    	      case 6:
	    	        System.out.println("Saturday");
	    	        break;
	    	      case 0:
	    	        System.out.println("Sunday");
	    	        break;   
	    	        default:
	    	        System.out.println( "invalid day");
	   
	    }
	    
	        
	/*       // Using an if statement is another alternative
	       int day = 4; 
	       String str= "";
	       if (day==0) {
	    	   str = "Sunday";
	       }
	       else if (day==1) {
	    	   str = "Monday"; // you repeat 
	       else if (day==2) {
		     str = "Tuesday";
	       } else if (day==3) {
			    str = "Wednesday";
	       }   else if (day==4) {
				 str = "Thursday";
	       } else if (day==5) {
				 str = "friday";
	       }else if (day==6) {
					str = "Saturday";
	       }  else {
			   str= "invalid days";
	       }
	    System.out.println(str);
	  */
	
/* THIS IS USING A SWITCH FUNCTION WITH USER INPUT
  Scanner input = new Scanner( System.in);
System.out.println("Enter the month number:");

int userMonthNumber= input.nextInt();
int monthNum= userMonthNumber;
switch (monthNum){
    case 1:
System.out.println("January");
break;

   case 2:  
System.out.println("Febuary");
break;

  case 3:
System.out.println("March");
break;

    case 4:
    
System.out.println("April");
break;

case 5:
  
System.out.println("May");
break;

case 6:
System.out.println("June");
break;

case 7:
System.out.println("July");
break;

case 8:
System.out.println("August");
break;

case 9: 
System.out.println("September");
break;

case 10: 
System.out.println("October");
break;

case 11: 
System.out.println("November");
break;

case 12:
System.out.println("December");
break;

default:
System.out.println( "Invalid month number!" );

System.out.println( "" );

System.out.println ("Please select a number between 1 to 12.");
}

}
}
 */

	


	    }
	}

