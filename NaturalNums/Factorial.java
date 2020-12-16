package NaturalNums;
import java.util.Scanner;


public class Factorial {
	
	// Purpose: To calculate the factorial of the given natnum
	public static natnum fact(natnum a) { 
		try{ 
			if(a.isZero()) { 
				return(new Zero().succ()); 
			}
			else { 
				return(a.multiply(fact(a.pred())));
			}
		}
		catch(Exception e) { 
			System.out.print("Error factorial: " + e.getMessage());
			return(null); 
		}
	}
	

	public static void main(String[] args) {
		
		Scanner myScan = new Scanner(System.in);
		System.out.println("Enter natural number"); 
		int n = myScan.nextInt(); 
		
		natnum x = new Zero(); 
		while(n > 0) { 
			x = x.succ();
			n--; 
		}
		
		System.out.print("Factorial = ");
		fact(x).print();
		
		myScan.close();

	}

}
