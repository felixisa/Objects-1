package ILists;


public interface IStack<X>{
	
	// Purpose: determines if the stack is empty 
	public boolean emptyStack(); 
	
	// Purpose: to remove the top element of the stack
	public IStack<X> pop() throws Exception; 
	
	// Purpose: pushes an element onto the stack
	public IStack<X> push(X i) throws Exception;  
	
	// Purpose: returns the last element added 
	public X top() throws Exception; 
	
	// Purpose: to determine if this stack is equal to the given one 
	public boolean equals(IStack<X> V) throws Exception; 
	
}
