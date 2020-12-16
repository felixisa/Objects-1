package Hashing;
import java.util.*; 

public class Dict <K, E> implements IDictionary <K, E> {
	
	private ArrayList<K> keys; 
	private ArrayList<E> elems; 
	private int size; 
	
	public Dict() { 
		keys = new ArrayList<K>(); 
		elems = new ArrayList<E>(); 
		size = 0; 
	}
	
	public Integer size() { 
		return size; 
	}
	
	public Boolean isEmpty() { 
		return (size == 0); 
	}
	
	public Iterator<E> elements(){ 
		return elems.iterator(); 
	}
	
	public Iterator<K> keys(){ 
		return keys.iterator();
	}
	
	public E findElement(K k) { 
		int i = keys.indexOf(k); 
		if (i > -1) { 
			return elems.get(i); 
		}
		else { 
			return null; 
		}
	}
	
	public void insert(K k, E e) { 
		keys.add(k); 
		elems.add(e); 
		size++; 
	}
	
	public void delete(K k) { 
		int i = keys.indexOf(k); 
		keys.remove(i); 
		elems.remove(i); 
		size--; 
	}

}
