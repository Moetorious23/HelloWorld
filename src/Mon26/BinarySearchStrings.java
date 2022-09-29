package Mon26;

public class BinarySearchStrings {
	public static void main(String[] args) {
		
		String key= "apple";
		String[] a = {"apple","kiwi","lemon","bannana"};
		
		public static int searchString(String[] a, String key) {
			
			
			int left = 0;  // left index
			int right = a.length - 1; // right index
			
			int middle = 0;
			
			while (left <= right) { // perform the loop while left <= right
				
				middle = (left + right) / 2; // Find the index of the element in the middle
				
				if ( key.compareTo(a[middle]) < 0 ){ // if the key is small the value in the middle
					right = middle -1 ; // the new right is (middle -1)
				} else if ( key.compareTo(a[middle]) > 0 ) { // if the key is bigger than the value in the middle
					left = middle + 1; // the new left is (middle +1)
				} else if ( key.compareTo(a[middle]) == 0 ){
					return middle; // if the value is equal return the index of the middle
				}
			}
			
			return -1;
		}
}
}
