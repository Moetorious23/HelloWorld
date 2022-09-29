package Mon26;

public class ReversingArrays {
	public static void main(String[] args) {
	
		/*
		int [] numbers = new int[5];
		
		numbers[0] = 1;
		numbers[1]= 5;
		numbers[2]= 3;
		numbers[3]= 7;
		numbers[4]= 4;
		
		for (int i =0 ; i<numbers.length; i++) { // to iterate ( print out array) in right order	
		}
		for (int i= numbers.length -1 ; i>=0 ; i--) { //to go backwards from end index to first
		} 
		}*/
	
	
	//WAP to add all elements in array
	
	//[ 14,20,30,19] // =83
	/*
	int[] num= {14,20,30,19};
	int sum =0; 
	// to reach each element /iterate we got to use the FOR LOOP
	
	for (int i= 0; i < num.length ; i++) {
													//i is element
		
		sum = sum + num[i];
		if (num[i]%2==0) {
			System.out.println(num[i]);
		}
	}
	System.out.println(sum);
			
	// Print all even numbers in an array i.e 14,20,30 */
	
	//WAP for tables of 2
	
		int multiplier= 2;
		
	for (int t = 0;t<=10 ; t++ ){ // t is the index
		int ans= multiplier *t; // to optimize code such that any time tables can be used
		System.out.println("2 * " + t + "= "+ ans);
	}
	}
}

