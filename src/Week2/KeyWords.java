package Week2;

public class KeyWords {

	public static void main(String[] args) {
		//
		
		// How do we use the break statement with the FOR LOOP, lets say we do not want
		// to print past 5
		for (int i = 0; i<10; i++) { 
			if (i==5) {
				break;
			}
			System.out.println(i);
		}

		// How do we use the break statement with the WHILE LOOP
		int x = 0;
		while (x<10) {
			
			if (x==5) {
				break;
			}
			System.out.println(x); // this will infinitely be 0 , we can break this, if no x++ is present bc x will forever be 0
			x++;
		}
		
		//How do we use the break statement with the FOR NESTED LOOP
		outer:
		for (int a = 0; a<5; a++) { 
			for (int b = 0; b<4; b++) { 
				if (b==1) {
					break; // will the break, breakout for first for loop
						   // or all for loops? it will only break for the inner for not all
				}
		System.out.println("a:"+ a + ", b:" + b); 
						  // if you want to break all loops you do so by placing a label , eg. outer in line 29
						// then on line 32 type break outer; and itll do so
			}
		}
		
				// ANOTHER KEY WORD IS CONTINUE 
	/*	
		for (int c = 0; c<10; c++) {
			if (c==5) {
				continue;// it will break the for loop, but instead of breaking out
						// it will continue with next iteration 
						// meaning we will go from 0-4 print it
						// 5 is skipped and continue printing from
						// 0  to 9  . 
						// same case/use for while loop
			}
			System.out.println(c);
		}
	
	/*
		
		// CONTINUE FOR A WHILE LOOP
		int g= 0 ; 
		while (g<10);{
		
		/*
		g++;
		if (g==5) {
			continue;     // skips this iteration
		}
		
		System.out.println(g);
	
	}
	*/
}
}


