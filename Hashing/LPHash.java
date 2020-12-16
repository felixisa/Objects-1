package Hashing;

public class LPHash <K, E> extends Hash<K, E>{
	
	public LPHash(int s, HashComparator<K> hc) { 
		super(s, hc);
	}
	
	//Purpose: to insert an element and key
	public void insert(K k, E e) {
		int i = h.hashIndex(k) % N;
		int j = i;
		boolean done = false;
		while (!done) { 
			if (empty(j) || available(j)) { 
				A.set(j, new Item<K, E>(k, e));
				n = n + 1;
				done = true;
			}
			else {
				this.Collisions++;
				j = (j+1)%N;
			}	
		}
	}
	
	//Purpose: to find a key in a Table
		public int find(K k) {
			// returns the index of the given key or -1 if there is no such key
			int i = (this.h.hashIndex(k) % N); // division method compression map
			int j = i;
			int res = -1;
			boolean done = false; 
			while (!done) {
				if (this.empty(j)) { 
					done = true; 
				}
				else if (this.available(j)) { 
					j = (j + 1) % N;  
					if (j == i) { 
						done = true; 
					}	 
				}
				else if (h.keyEqual(key(j), k)) { 
					res = j;
					done = true;
				}
				else { 
					j = (j+1)%N; 
					if (j == i) { 
						done = true; 
					}
				}
			}
			return(res); 
		}	
}
