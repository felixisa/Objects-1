package Hashing;

public interface HashComparator <K> {
	
	// Purpose: to return the hash index
	public int hashIndex(K k); 
	
	// Purpose: to determine if two keys are equal
	public Boolean keyEqual(K k1, K k2); 

}
