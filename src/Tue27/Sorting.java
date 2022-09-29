package Tue27;
import java.util.Arrays;
public class Sorting {

	public static void main(String[] args) {
	
		int []a = {8,4,5,9,11,2,7};
		
		// First for loop
		for (int j=0 ; j<a.length-1 ;j++) {
			
			int minIndex = j ; // temp int to store the index of minimum value
			//2nd for loop works with K
			for (int k = j+1;k < a.length ; k++) {
				if (a[k]< a[minIndex]) {    // if the value at index K is smaller than the value at minIndex, then we replace/swap/store minIndex with K
					minIndex= k ; // 
				}
				
			}
			int temp = a[j]; 
			a[j] = a [minIndex] ;
			a [minIndex] = temp; 
		}
		
		System.out.println(Arrays.toString(a)); //onverts array to strings / Arrays is a built in java Class thcomes with several utility methods we can use 
												//with arrays. you must import the arrays library package
												// only used for java
	
	}
}
/* could do this instead of Arrays.to string
for(int k = 0; k < arr.length; k++){
System.out.print(arr[k] + " ");//
			PROPER ALGORITHM FOR SELECTION PROCESS
			Declare & initialize the array
Run two loops
The outer loop iterates over each element and gets the minimum element
Declare a variable to store the index of the minimum value gotten by the outer loop
The inner loop compares the minimum pointer to the next element
If the value of the element in the inner loop is small that the minimum element it changes the value of the minimum element to the value of the current element in the inner loop
Repeats till the minimum values are found
Declare temp variable to store the index of the first index of the outer loop
Swap the element of the minimum value with the element of the first index of the outer loop
Convert the array to string and print out
*/