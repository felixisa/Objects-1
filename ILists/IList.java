package ILists;


public interface IList<X> {
	
	// Purpose: add the given value to the list
	public IList<X> cons(X val); 
	
	// Purpose: return the length of this list 
	public int length(); 
	
	// Purpose: determine if this list is empty 
	public boolean isEmpty(); 
	
	// Purpose: to determine if the given list is equal to this list 
	public boolean equals(IList<X> L); 
	
	// Purpose: to return the first element of this list 
	public X first() throws Exception; 
	
	// Purpose: to return the rest of this list 
	public IList<X> rest() throws Exception; 
	
	// Purpose: to return the nth element of this list 
	public X listref(int i) throws Exception; 
	
	// Purpose: to append the given list to this list 
	public IList<X> append(IList<X> L); 
	
	// Purpose: to reverse this list 
	public IList<X> reverse(); 
	
	// Purpose: to map the given function to the elements of this list 
	public <R> IList<R> map(IFun<X, R> f); 
	
	// Purpose: Return a list w/elements of this list satisfying the given predicate
	public IList<X> filter(IPred<X> p); 
	
	// Purpose: to apply the given function to all the elements of the given list left to right
	public <R> R foldl(IFun2<X, R> f, R res); 
	
	// Purpose: to apply the given function to all the elements of the given list right to left
	public <R> R foldr(IFun2<X, R> f, R res); 
	
	// Purpose: to determine if two lists are equal 
	public boolean equal(IList<X> L); 

}
