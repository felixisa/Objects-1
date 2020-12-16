public class Rational {
	
	// Purpose: To find the GCD of a and b using Euclid's algorithm 
		public static int EuclidsGCD(int a, int b) { 
			int x = Math.max(a, b); 
			int y = Math.min(a, b); 

				if ((x % y) == 0) { 
					return y; 
				}
				return EuclidsGCD((x % y), y); 
		}
	
	
	private int numerator; 
	private int denominator; 
	
	public Rational(int num, int den) { 
		numerator = num; 
		denominator = den; 
	}
	
	// Purpose: get numerator of rational
	public int getNumerator() { 
		return this.numerator;
	}
	
	// Purpose: get denominator of rational
	public int getDenominator(){ 
		return this.denominator; 
	}
	
	// Purpose: to set the numerator of a rational to the given number
	public void setNumerator(int n) { 
		this.numerator = n; 
	}
	
	// Purpose: to set the denominator of a rational to the given number
	public void setDenominator(int n) { 
		this.denominator = n; 
	}
	
	// Purpose: to return the sum of this rational and b
	public Rational plus(Rational b) { 
		// Purpose: adds the given rational to the current one
		int newnum = (this.getNumerator() * b.getDenominator()) + (this.getDenominator() * b.getNumerator()); 
		int newden = this.getDenominator() * b.getDenominator();
		int divisor = EuclidsGCD(newnum, newden); 
		newnum = newnum / divisor; 
		newden = newden / divisor; 
		
		return new Rational(newnum, newden); 
	}
	
	// Purpose: to return the difference of this rational and b
	public Rational minus(Rational b) { 
		// Purpose: subtracts the given rational from the current one
		int newnum = (this.getNumerator() * b.getDenominator()) - (b.getNumerator() * this.getDenominator()); 
		int newden = this.getDenominator() * b.getDenominator(); 
		int divisor = EuclidsGCD(newnum, newden); 
		newnum = newnum / divisor; 
		newden = newden / divisor; 
		
		return new Rational(newnum, newden); 
	}
	
	// Purpose: to return the product of this rational and b
	public Rational times(Rational b) { 
		int newnum = this.getNumerator() * b.getNumerator(); 
		int newden = this.getDenominator() * b.getDenominator(); 
		int divisor = EuclidsGCD(newnum, newden); 
		newnum = newnum / divisor; 
		newden = newden / divisor;  
		
		return new Rational(newnum, newden); 
	}
	
	// Purpose: to return the quotient of this rational and b
	public Rational divides(Rational b) { 
		int newnum = this.getNumerator() * b.getDenominator(); 
		int newden = this.getDenominator() * b.getNumerator(); 
		int divisor = EuclidsGCD(newnum, newden); 
		newnum = newnum / divisor; 
		newden = newden / divisor;  
		
		return new Rational(newnum, newden); 
	}
	
	// Purpose: to return the string representation of this rational 
	public String toString() { 
		return this.getNumerator() + "/" + this.getDenominator(); 
	}
	
	// Purpose: to see if two Rationals are equal 
	public boolean equal(Rational b){ 
		return (this.getNumerator() == b.getNumerator() && this.getDenominator() == b.getDenominator()); 
	}
	
}
