package RSort;

public interface IBuckets <X>{
	
	// Purpose: to sort array in place by moving array elements into the appropriate bucket
    public void bucketize(X[] B); 
    
    // Purpose: to place bucketized elements back into array 
    public void debucketize(X[] B); 
    
}
