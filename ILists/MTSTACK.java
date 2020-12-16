package ILists;

public class MTSTACK<X> implements IStack<X>{
	
	private IList<X> l = new MTLIST<X>(); 
	
	public MTSTACK() {} 
	
	// Purpose: determines if the stack is empty 
	public boolean emptyStack() { 
		return true; 
	}
	
	// Purpose: pushes an element onto the stack
	public IStack<X> push(X i) throws Exception{ 
		return(new NMTSTACK<X>(l.cons(i)));
	}
	
	// Purpose: to remove the top element of the stack
	public IStack<X> pop() throws Exception{ 
		if(l.isEmpty()) { 
			throw new Exception("List is empty. Nothing to pop."); 
		}
		else { 
			l = l.rest(); 
			return this; 
		}
	}
	
	// Purpose: returns the last element added 
	public X top() throws Exception{ 
		if(l.isEmpty()) { 
			throw new Exception("List is empty. No top.");
		}
		else { 
			return (l.first()); 
		}
	}
	
	// Purpose: to determine if this stack is equal to the given one 
	public boolean equals(IStack<X> V) throws Exception{ 
		return(V.emptyStack()); 
	}

}
