package ILists;

public class NMTSTACK<X> implements IStack<X>{
	
	private IList<X> l;
	
	public NMTSTACK(IList<X> i){
		i = l;
	}

	//Purpose: To push the value onto the Top of this stack.
	public IStack<X> push(X v) throws Exception{
		
		 l = new NMTLIST<X>(v, l);
		return this; 
		
		//return (new NMTSTACK<X>(l.cons(v))); 
	}

	// Purpose: to pop off top value 
	public IStack<X> pop() throws Exception {
		if(l.length() == 1){
			return(new MTSTACK<X>());
		}
		else{
			return(new NMTSTACK<X>(l.rest()));
		}
	}

	//Purpose: To return the top element in this Stack
	public X top() throws Exception {
		return(l.first());
	}

	// Purpose: to determine if this stack is empty 
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
