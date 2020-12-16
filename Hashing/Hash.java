package Hashing;
import java.util.*;

public abstract class Hash <K, E> implements IDictionary <K, E>{

	protected Item<K, E> AVAILABLE = new Item<K, E>(null, null); // deleted cell item
	protected int n; // number of elements in the hash table
	protected int N; //size of hash table
	protected ArrayList<Item<K, E>> A;
	protected HashComparator<K> h; // provides hashIndex and Equals
	protected int Collisions = 0;
	
	protected abstract int find(K k);
	
	public Hash(int s, HashComparator<K> hc) { 
		n = 0; h = hc; 
		N = s; 
		int i = -1;
		A = new ArrayList<Item<K, E>>(s);
		while (i < s - 1) { 
			i = i + 1;
			A.add(i, null);
		}
	}
	
	// Purpose: to determine if a spot is available
	public boolean available(int i) { 
		return(A.get(i) == AVAILABLE); 
	}
	// Purpose: to determine if a spot is empty
	public boolean empty(int i) { 
		return(A.get(i) == null);
	}
	// Purpose: to define a key
	public K key(int i) {
		return(A.get(i).getKey());
	}
	// Purpose: to define an element
	public E elem(int i) {
		return(A.get(i).getElem());
	}
	// Dictionary methods
	public Integer size() {
		return(n);
	}
	public Boolean isEmpty() {
		return(n == 0);
	}
	// Iterators
	// Purpose: to go through the elements in a dictionary
	public Iterator<E> elements() { 
		Iterator<Item<K, E>> htlooper = A.iterator();
		ArrayList<E> elems = new ArrayList<E>();
		Item<K, E> k;
		while (htlooper.hasNext()) { 
			k = htlooper.next();
			if ((k != null) && (k != AVAILABLE)) { 
				elems.add(k.getElem()); 
			}
		}
		return(elems.iterator());
	}
	// Purpose: to go through the keys in a dictionary
	public Iterator<K> keys() {
		Iterator<Item<K, E>> htlooper = A.iterator();
		ArrayList<K> keys = new ArrayList<K>();
		Item<K, E> k;
		while (htlooper.hasNext()) { 
			k = htlooper.next();
			if ((k != null) && (k != AVAILABLE)) { 
				keys.add(k.getKey()); 
			}
		}
		return(keys.iterator());
	}
	
	// Purpose: to find an element
	public E findElement(K k) {
		int i = find(k);
		if (i < 0) { 
			return (null); 
		}
		else { 
			return (elem(i)); 
		}
	}
	//Purpose: to delete an element and key
	public void delete(K k) {
		int i = find(k);
		if (i > -1) {
			A.set(i, AVAILABLE);
			n = n - 1;
		}
	}

	
	
}
