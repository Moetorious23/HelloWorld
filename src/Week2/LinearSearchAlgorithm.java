package Week2;

public class LinearSearchAlgorithm {
	public static void main(String[] args) { // void method returns nothing
					// LINEAR SEARCH

					
					int key = 15;
					int ind = -1; // when key value that is searched does not exist
					
					int[] a = { 3, 8, 4, 2, 12, 6 };
					
					
					for (int i =0; i < a.length; i++ ) {
						
						if ( key == a[i] ) {
							ind = i;
							break; // breaks out from the for loop
						
					}
						else {
							ind = -1;
							System.out.println("Index is :" + ind);
						}
						}
					System.out.println("Index :" + ind);
							
				}
			}



   
    
    
				
			
		
		/*ind = search(a,key); //ind =index
		System.out.println("Index is :" + ind);
	
}
	/*		//Search 3
	String str= "purple";
	String[]c = {"blue", "red", "purple", "green"};*/

/*
public static int search(int[] b ,int key) {
	 // if you copy a code in the main method you could not reuse it/ only once, so if you do a code in a seperate method you could use it multiple times
	int ind=-1;
	for (int i = 0; i <b.length; i++) {
		if (key==b[i]) {  // when we are using numbers we do ==
			ind = i ;
			break; // breaks out from the for loop
			
	*/
	
	
	
	
	// we did int instead of void to get a return of the index, it searchs everything below it
	






			/*NOTES
			  							Sequential and linear search
			 
			 * typically starts at the first element in an array or ArrayList and looks through all the items one by one until it either 
			 * finds the desired value and then it returns the index it found 
			 * the value at or if it searches the entire array or list without finding the value it returns -1.
			 * Sequential and linear search, are used for unsorted data
			 
			 								Binary search 
			* can only be used on data that has been sorted or stored in order. It checks the middle of the data to see if that middle value	is less 
			* than, equal,or greater than the desired value and then based on the results of that it narrows the search. It cuts the search space in 
			* half each time.
			 
			 
			 
			*/