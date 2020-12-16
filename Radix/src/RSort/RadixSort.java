package RSort;
//import java.util.*; 

public class RadixSort {

	// Purpose: to sort the given array 
	public static Integer[] radix(Integer[] v) {
		// create buckets object to be used when sorting 
		Buckets buckets = new Buckets();
		// bucketize function sorts array 
		buckets.bucketize(v);
		// return sorted array 
		return v;
	}
	
}
