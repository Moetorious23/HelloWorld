package BasicApps;
import java.util.Scanner;
public class Velocity {
	public static void main(String[] args) {
		// How to calculate distance
		Scanner in= new Scanner (System.in);
		System.out.println("Input distance in meters");
		Double f = in.nextDouble();
		Double distkm = f/1000 ;
		
		// How to calculate speed
		
		System.out.println("Input hours to reach distance");
		Double timeh= in.nextDouble();
	
		System.out.println("Input minutes to reach distance");
		Double timem= in.nextDouble()/60;
		
		System.out.println("Input seconds to reach distance");
		Double times= in.nextDouble()/3600;
	
		
	
		// formula for velocity , v= d/t
	
	Double velockmh = distkm/(timeh + timem + times); 
	
	System.out.println("Your speed in km/h is "+ velockmh);
	
	// converting km/h to meters/s
	
	Double velocmps=  (Double)(velockmh *1000)/3600;
	System.out.println("your speed in m/s is " + velocmps);
	
	Double velocmph = (Double)velockmh*0.621371; 
	System.out.println("Your speed in miles/hr is " + velocmph);
	
	
	}
}
