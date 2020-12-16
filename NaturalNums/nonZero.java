package NaturalNums;

public class nonZero implements natnum{
	
	private int n; // value of this natnum 
	private natnum prev; // natnum used to construct this natnum 
	
	public nonZero(natnum nat) { 
		n = nat.getVal() + 1; 
		prev = nat; 
	}
	
	public int getVal() { 
		return(n);
	}
	
	public boolean isZero() { 
		return(false);
	}
	
	public boolean equal(natnum B) { 
		return(this.n == B.getVal()); 
	}
	
	public natnum succ() { 
		return(new nonZero(this)); 
	}
	
	public natnum pred() throws Exception{ 
		return(prev);
	}
	
	public natnum add(natnum a) { 
		try { 
			return(this.pred().add(a).succ()); 
		}
		catch(Exception e) { 
			System.out.println("Error add: " + e.getMessage()); 
			return(null);
		}
	}

	public natnum subtract(natnum a){ 
		try{ 
			if(a.isZero()){ 
				return(this); 
			}
			else{ 
				return(this.pred().subtract(a.pred())); 
			}
		}
		catch(Exception e){ 
			System.out.println("Error subtract: " + e.getMessage());
			return(null); 
		}
	}
	
	public boolean lessthan(natnum C){
		return(this.n < C.getVal());
	}
	public boolean greaterthan(natnum D){
		return(this.n > D.getVal());
	}
	public boolean leq(natnum E){
		return(this.n <= E.getVal());
	}
	public boolean geq(natnum F){
		return(this.n >= F.getVal());
	}
	
	public String toString() { 
		return("" + this.getVal()); 
	}
	
	public void print() { 
		System.out.println(this.toString()); 
	}
	
	public natnum quotienthelp(natnum a, natnum quot) { 
		try { 
			if(this.leq(a)) { 
				return(quot); 
			}
			else { 
				return(((nonZero) this.subtract(a)).quotienthelp(a, quot.succ())); 
			}
		}
		catch(Exception e) { 
			System.out.println("Error quotient: " + e.getMessage()); 
			return(null);
		}
	}
	
	public natnum quotient(natnum a) { 
		try { 
			if(this.getVal() < a.getVal()) { 
				return (new Zero()); 
			}
			return ((this.subtract(a)).quotient(a)).succ(); 
		}
		catch(Exception e) { 
			System.out.println("Error quotient: "); 
			return (null);
		}
	}
	
	public natnum multiply(natnum a) { 
		try { 
			return ((this.pred().multiply(a)).add(a));
		}
		catch(Exception e) { 
			System.out.println("Error multiply: " + e.getMessage()); 
			return(null); 
		}
	}
	
	public natnum remainder(natnum a) { 
		return this.subtract((this.quotient(a)).multiply(a));
	}
	

}
