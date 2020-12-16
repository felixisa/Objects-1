import java.util.Scanner; 

/* the book said: if x is greater than y, then if y divides x, 
the gcd of x and y is y; otherwise the gcd of x and y is the same as the 
gcd of x % y and y */

public class GreatestCommonDivisor {

	// Purpose: To find the GCD of a and b using Euclid's algorithm 
	public static int EuclidsGCD(int a, int b) { 
		int x = Math.max(a, b); 
		int y = Math.min(a, b); 

			if ((x % y) == 0) { 
				return y; 
			}
			return EuclidsGCD((x % y), y); 
	}

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		System.out.println("Enter first number"); 
		int num1 = reader.nextInt(); 
		System.out.println("Enter second number"); 
		int num2 = reader.nextInt(); 
		int gcd = EuclidsGCD(num1, num2); 
		System.out.println("The GCD of " + num1 + " and " + num2 + " is " + gcd); 

		reader.close();

	}

}
