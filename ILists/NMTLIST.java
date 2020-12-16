package ILists;


public class NMTLIST<X> implements IList<X>{
	
	private X car; 
	private IList<X> cdr; 
	
	public NMTLIST(X first, IList<X> rest) { 
		car = first; 
		cdr = rest; 
	}
	
	public IList<X> cons(X val){ 
		return(new NMTLIST<X>(val, this)); 
	}
	
	public int length() { 
		return(1 + this.cdr.length()); 
	}
	
	public boolean isEmpty() { 
		return(false); 
	}
	
	public boolean equals(IList<X> l) { 
		try { 
			return((this.first().equals(l.first())) && this.rest().equals(l.rest())); 
		}
		catch(Exception e) { 
			System.out.println("Error NMTLIST equals " + e.getMessage()); 
			return(false); 
		}
	}
	
	public X first() throws Exception{ 
		return(car);
	}
	
	public IList<X> rest() throws Exception{ 
		return(cdr); 
	}
	
	public X listref(int i) throws Exception{ 
		if (i == 0) { 
			return(car); 
		}
		else { 
			return(this.cdr.listref(i--)); 
		}
	}
	
	public IList<X> append(IList<X> L){ 
		try { 
			return(new NMTLIST<X>(this.first(), this.rest().append(L))); 
		}
		catch(Exception e) { 
			System.out.println("Error NMTLIST append: " + e.getMessage()); 
			return(this);
		}
	}
	
	private IList<X> revhelper(IList<X> l, IList<X> res){ 
		// ACCUM INV: reverse(this) == append(reverse(l), res)
		try { 
			if (l.isEmpty()) { 
				return(res); 
			}
			else { 
				return(revhelper(l.rest(), res.cons(l.first()))); 
			}
		}
		catch(Exception e) { 
			System.out.println("Error NMTLIST reverse: " + e.getMessage()); 
			return(res); 
		}
	}
	
	public IList<X> reverse(){ 
		return (revhelper(this, new MTLIST<X>())); 
	}
	
	public <R> IList<R> map(IFun<X, R> f){ 
		try { 
			return(new NMTLIST <R>(f.f(this.first()), this.rest().map(f)));  
		}
		catch(Exception e) { 
			System.out.println("Error NMTLIST map: " + e.getMessage()); 
			return(new MTLIST<R>());
		}
	}
	
	public IList<X> filter(IPred<X> p){ 
		try { 
			if (p.p(this.first())) { 
				return (new NMTLIST<X>(this.first(), this.rest().filter(p)));
			}
			else { 
				return(this.rest().filter(p)); 
			}
		}
		catch(Exception e) { 
			System.out.println("Error NMTLIST filter: " + e.getMessage()); 
			return(new MTLIST<X>()); 
		}
	}
	
	public <R> R foldl(IFun2<X, R> f, R res) { 
		try { 
			return(this.rest().foldl(f, f.f(this.first(), res))); 
		}
		catch(Exception e) { 
			System.out.println("Error NMTLIST foldl: " + e.getMessage()); 
			return(res); 
		}
	}
	
	public <R> R foldr(IFun2<X, R> f, R res) { 
		return(this.reverse().foldl(f, res)); 
	}
	
	public boolean equal(IList<X> L) { 
		try{ 
			return(this.first().equals(L.first()) && this.rest().equal(L.rest())); 
		}
		catch(Exception e) {
			 System.out.println("Error equal: " + e.getMessage());
			 return false; 
		}
	}

}

