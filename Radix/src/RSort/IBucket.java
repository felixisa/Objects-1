package RSort;

public interface IBucket <X>{
	
	// Purpose: to add the given element to this bucket 
	// Effect: the bucket has the given element as its last element added 
	public void add(X elem); 
	
	// Purpose: place bucket elements into the given array starting at index i
	// Effect: clears the bucket 
	public int toArray(X[] A, int i); 
	
}