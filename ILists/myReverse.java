package ILists;

public class myReverse {
	
	// Purpose: to reverse a list using a stack
	public static <X> IList<X> reverse(IList<X> l, IStack<X> s){
		int i = l.length();
		s = intoStack(l, s);
		l = intoList(s, i);
		return l;
	}
	
	
	// Purpose: to put list elements into a stack
	public static <X> IStack<X> intoStack(IList<X> l, IStack<X> s){
		if (l.isEmpty()){
			return s;
		}
		else {
			try {
				System.out.println("intostack" + l.first()));
				return intoStack(l.rest(), s.push(l.first()));
			}
			catch(Exception e) {
				System.out.println("Error intoStackt: " + e.getMessage());
				return s;
			}
		}
	}
	
	// Purpose: to put stack elements into a list 
	public static <X> IList<X> intoList(IStack<X> s, int i){
		if (i == 0) {
			return(new MTLIST<X>());
		}
		else {
			try { 
				System.out.println("intolist" + l.first()));
				return intoList(s.pop(), (i - 1)).cons(s.top());
			}
			catch (Exception e) {
				System.out.println("Error intoList: " + e.getMessage());
				return new MTLIST<X>();
			}
		}
	}
	
	public static void main(String[] args) { 
		IList<Integer> MTL = new MTLIST<Integer>();
		IList<Integer> NMTL1 = MTL.cons(1).cons(2).cons(3);
		IStack<Integer> emp1 = new EmptyStack<Integer>();
		myReverse.reverse(NMTL1, emp1);
	}
	

}
