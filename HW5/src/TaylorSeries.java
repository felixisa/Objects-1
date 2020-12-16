

public class TaylorSeries {
	
	public static double fact(double N) { 
		// Purpose: To calculate the factorial of n
		// Termination: n decreases by one on each iteration, eventually becoming 0 which terminates the loop
		double res = 1;
		double n = N; 
		// INV: res = N * ... * n+1
		while (n != 0) { 
			// res = N * ... * n+1
			res = res * n; 
			// res = N * ... * n+1 * n
			n--; 
			// res = N * ... * n+1
		}
		return res;
	}
	
	public static double sineTS(double num) { 
		// Purpose: To calculate the sin of num
		double sin = num; 
		double n = 3; 
		// INV: sin = num - (num^n/fact(n)) + (num^n+2/fact(n+2))...
		for (int i = 1; i < 15; i++) { 
			if (i % 2 == 0) { 
				sin = sin + (Math.pow(num, n) / fact(n)); 
			}
			else { 
				sin = sin - (Math.pow(num, n) / fact(n)); 
			}
			n += 2; 
		}
		return Math.round(sin); 
	}
	
	public static double cosineTS(double num) { 
		// Purpose: To calculate the cos of num
		double cos = 1; 
		double n = 2; 
		// INV: cos = 1 - (num^n/fact(n)) + (num^n+2/fact(n+2))...
		for (int i = 1; i < 15; i++) { 
			if (i % 2 == 0) { 
				cos = cos + (Math.pow(num, n) / fact(n)); 
			}
			else { 
				cos = cos - (Math.pow(num, n) / fact(n)); 
			}
			n += 2; 
		}
		return Math.round(cos); 
	}

	public static void main(String[] args) {
	
		
	}

}
