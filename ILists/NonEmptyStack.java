package ILists;

public class NonEmptyStack<X> implements IStack<X> {
	
	private X top;
	private IStack<X> bottom;
	
	public NonEmptyStack(X t, IStack<X> b) {
		top = t;
		bottom = b;
	}
	
	//Purpose: To push the value onto the Top of this stack.
	public IStack<X> push(X v) throws Exception{
		return new NonEmptyStack<X>(v, new NonEmptyStack<X>(top, bottom));
	}
	
	//Purpose: To return the top element in this Stack
	public X top() {
		return top;
	}
	
	//Purpose: To return this Stack without the Top element 
	public IStack<X> pop() {
		return bottom;
	}
	
	//Purpose: To check if this stack is empty
	public boolean emptyStack() {
		return false;
	}
	
	//Purpose: To determine if this stack is equal to the given one 
	public boolean equals(IStack<X> V) throws Exception { 
		if(! (V.emptyStack() && emptyStack())){ 
			return(V.top().equals(top()) && V.pop().equals(pop()));
		}
		else if (V.emptyStack() && emptyStack()) { 
			return true; 
		}
		else { 
			return false; 
		}

	}
	
	
}
