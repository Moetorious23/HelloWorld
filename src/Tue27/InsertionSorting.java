package Tue27;
import java.util.Arrays;
public class InsertionSorting {

	public static void main(String[] args) {
		
		int []a = {8,4,5,9,11,2,7};
		
		for (int j = 1; j< a.length; j++) {	
											//Loop 1	// iterations starts at 1 bc we assume index 0 is sorted
			int temp = a[j]; // storing the 1st element/value of unsorted  ofarray, keep it constant till you know where you will insert it in the sorted part // i.e 4 
			int possibleIndex = j; // we are storing the index of the non sorted part // i.e =1 // this index will store insertion index 
		
					//	sorted	| unsorted / from pt 11
			// 2| 4| 5| 8| 9| 11| 7  values
			//0| 1| 2|  3|  4| 5|6  index
				   	//			 ^
					// possibleIn|  from index 3 to 6
					// value of temp = 7
			while (possibleIndex>0 && temp< a[possibleIndex -1]) {// && to add another condition
				a[possibleIndex] = a[possibleIndex-1];// is 7 less than possible index-1/ which is value 11
				possibleIndex--;
				
			}
			a[possibleIndex]= temp; //temp is 7, is 7 less than 5 no, now we have a new possible index
			
		}
		System.out.println(Arrays.toString(a));
	}
}

		
