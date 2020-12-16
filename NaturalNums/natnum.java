package NaturalNums;

public interface natnum {
	
	// Purpose: To return the int value of this natnum 
	public int getVal(); 
	
	// Purpose: To return true if this natnum is 0 and false otherwise
	public boolean isZero(); 
	
	// Purpose: To determine if this natnum and the given natnum have the same value 
	public boolean equal(natnum B); 
	
	// Purpose: To return the successor of this natnum 
	public natnum succ(); 
	
	// Purpose: To return the predecessor of this natnum 
	public natnum pred() throws Exception; 
	
	// Purpose: To add this natnum with the given natnum 
	public natnum add(natnum a); 

	// Purpose: To subtract the given natnum from this natnum
	public natnum subtract(natnum a); 
	
	// Purpose: To determine if this natnum is less than the given natnum 
	public boolean lessthan(natnum a); 
	
	// Purpose: To determine if this natnum is greater than the given natnum 
	public boolean greaterthan(natnum a); 
	
	// Purpose: To determine if this natnum is less than or equal to the given natnum 
	public boolean leq(natnum a); 
	
	// Purpose: To determine if this natnum is greater than or equal to the given natnum 
	public boolean geq(natnum a); 

	// Purpose: To convert this natnum to a string 
	public String toString(); 
	
	// Purpose: To print the given natnum
	public void print(); 
	
	// Purpose: To multiply this natnum by the given one
	public natnum multiply(natnum a);
	
	// Purpose: To return the quotient of this number and the given one 
	public natnum quotient(natnum a);
	
	// Purpose: To return the remainder of this number and the given one 
	public natnum remainder(natnum a); 
	
	
}
