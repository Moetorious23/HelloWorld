package BasicApps;

import java.util.Scanner;

public class Conversions {

	public static void main(String[] args) {
		
		Scanner input= new Scanner (System.in);
		System.out.println("Enter a number in inches");
		
		double inches= input.nextDouble();
		
		double meter= inches*0.0254;
		
		System.out.println(inches+ " is" + meter + " in meters"  );
	}

}
