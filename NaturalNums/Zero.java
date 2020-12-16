package NaturalNums;

public class Zero implements natnum{

	public Zero() {}; 
	
	public int getVal() { 
		return(0);
	}
	
	public boolean isZero() { 
		return(true); 
	}
	
	public boolean equal(natnum B) { 
		return(B.isZero()); 
	}
	
	public natnum succ() { 
		return(new nonZero(this)); 
	}
	
	public natnum pred() throws Exception{ 
		throw new Exception("Zero has no predecessor"); 
	}
	
	public natnum add(natnum a) { 
		return(a);
	}

	public natnum subtract(natnum a){ 
		try{ 
			return(this.succ().pred()); 
		}
		catch(Exception e){ 
			System.out.println("Error subtract: " + e.getMessage()); 
			return(null); 
		}
	}
	
	public boolean lessthan(natnum C) {
		return (0 < C.getVal());
	}
	
	public boolean greaterthan(natnum D) {
		
		return (0 > D.getVal());
	}
	
	public boolean leq(natnum E) {
		
		return (0 <= E.getVal());
	}

	public boolean geq(natnum F) {
		
		return (0 >= F.getVal());
	}
	
	public String toString() { 
		return("0"); 
	}
	
	public void print() { 
		System.out.println(this.toString()); 
	}
	
	public natnum quotient(natnum a) { 
		try { 
			if(a.isZero() == false) { 
				return(this); 
			}
		}
		catch(Exception e) { 
			System.out.println("Error quotient: "); 
		}
		return (null);
	}
	
	public natnum multiply(natnum a) { 
		return(this.subtract(this)); 
	}
	
	public natnum remainder(natnum a) { 
		try { 
			if(a.isZero() == false) { 
				return(this); 
			}
		}
		catch(Exception e) { 
			System.out.println("Error quotient: "); 
		}
		return (null);
	}
	

}
