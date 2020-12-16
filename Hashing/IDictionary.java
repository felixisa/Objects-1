package Hashing;
import java.util.Iterator; 

public interface IDictionary <K, E> {
	
	// Purpose: to determine the number of elements in this dictionary 
	public Integer size(); 
	
	// Purpose: to determine if this dictionary is empty 
	public Boolean isEmpty(); 
	
	// Purpose: to return an iterator for this dictionary's keys 
	public Iterator<K> keys(); 
	
	// Purpose: to return an iterator for this dictionary's elements 
	public Iterator<E> elements();
	
	// Purpose: to return element associated with the given key 
	public E findElement(K k); 
	
	// Purpose: to insert a pair for the given key and element 
	// Effect: A new pair is added to this dictionary and size is increased by one 
	public void insert(K k, E e); 
	
	// Purpose: to delete the given key and element from this dictionary 
	public void delete(K k); 

}
