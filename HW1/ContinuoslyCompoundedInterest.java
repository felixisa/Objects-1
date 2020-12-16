import java.util.Scanner;
import java.lang.Math;

//exercise 1.2.24

public class ContinuoslyCompoundedInterest {
	
	// Purpose: To calculate total after investing P dollars at rate r for t years 
	public static double calculateAmount(int p, double r, int t) { 
		double e = 2.71828; 
		double res = p* Math.pow(e, (r * t)); 
		return Math.round(res * 100)/100.0; 
	}

	public static void main(String[] args) {
		
		Scanner myScan = new Scanner(System.in);
		System.out.println("Enter dollar amount invested"); 
		int P = myScan.nextInt(); 
		System.out.println("Enter annual interest rate as a decimal"); 
		double R = myScan.nextDouble(); 
		System.out.println("Enter time in years"); 
		int T = myScan.nextInt(); 
		
		System.out.println("$" + calculateAmount(P, R, T)); 

		myScan.close();
	}

}
