import java.util.Scanner; 

public class RelativelyPrime {

	/* print n by n table with * if row and column 
	numbers are relatively prime */

	// Purpose: to find the GCD of two given ints
	public static int GCD(int a, int b) { 
		int x = Math.max(a, b); 
		int y = Math.min(a, b); 

			if ((x % y) == 0) { 
				return y; 
			}
			return GCD((x % y), y); 
	}

	// Purpose: Print an n by n grid where, if i and j are relatively prime there is a * 
	public static void PrintStars(int n){ 
		for (int i = 1; i <= n; i++){ 
			for (int j = 1; j <= n; j++){ 
				if (GCD(i, j) == 1){ 
					System.out.print(" * "); 
				}
				else{ 
					System.out.print("   ");
				}
			}
			System.out.println(""); 
		}
	}
	

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("gimme number");
		int nofrows= scan.nextInt();

		PrintStars(nofrows); 

		scan.close(); 
	}
}
