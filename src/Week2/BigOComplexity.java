package Week2;

public class BigOComplexity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Big O = used to calculate the time required to run a code
		//Types of BigO 
		// Constant time; O (1)
		//Linear time ; o(n)
		//Quadratic time; O(n^2)
		
		
	// Calculate big O for following code
		
		// Prob 1-
	System.out.println("hello world");// 1 , it is 1 bc you are printing hello world and it is only ruinning once to do so
	//Big O / complexity ; O(1)
	
	
	//Prob 2
	System.out.println("hello world");// 1 , it is 1 bc you are printing hello world and it is only ruinning once to do so
	System.out.println("how are you");// 1
	System.out.println("how are you"); //1
	// 1+1+1 =3
	//Big O / complexity ; O(3)= O(1);
	
	//Prob 3
	
	String names= { "chigoze", "Riaz", "Matt", "moe"};// just line 3 will run once
	int countNames = 0; // run 1
	for (String name: names) { // it will run 4 times bc you have 4 names, if you had a million names it will run 1 mill times
							// WE CAN SAY IT 	 runs "n" numbers of time
		
		if (name== "Riaz") {// it will also run 4 times to check for riaz matching in the array , "n"
		System.out.println("I will still use is");// this will run once}
		
		countNames++ // will run 4 times
		}
		
		System.out.println("number of names" + countNames);// runs 1
		
		// 1+1+n+n+1+n+1= 3n+4 , remove 3, n+4= worst case is n,= O(n)
		// we ignore 3, as it is a constant , O(n)
		
		
		//Prob 4
		
		String names= { "chigoze", "Riaz", "Matt", "moe"};//1
		System.out.println(names[0]); // 1
		System.out.println(names[3]);// 1
		//= 1+1+1 = 3 =1 , +1 converts to 1 to O(1);
		// worst case = O(n) , if the names increase it would take a bit longer to run
		= O (1) , no Ns required. 
		
		//prob 6
				 int n = 10; // 1
        for(int i = 1; i <= n; i++){ //n
            System.out.println(i); //1
        }
        for(int j = 1; j <= n; j++){ //n
            System.out.println(j); //1
        }
     //   1 + n + 1 + n + 1 = 2n + 3 = O(n)
	}
	}
}


