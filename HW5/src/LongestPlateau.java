import java.util.Scanner;

public class LongestPlateau {
	
	
	public static String findPlateau(int[] arr) { 
		// Purpose: To find the length, start index, and end index of the longest plateau in an array 
		
		int length = 1; 
		int start = 0; 
		
		// INV: length = the length of the longest plateau so far, start = start of plateau + 1 
		// TERMINATION = i increases by one on each iteration, eventually exceeding the length of the array, which stops the loop
		for (int i = 1; i < arr.length; i++) { 
			if (arr[i] == arr[i - 1]) { 
				length = length + 1; 
				start = arr[i - 1]; 
			}
		}
		if (start == 0) { 
			return ("No plateau"); 
			} 
		else return ("Plateau of length " + length + " from " + (start-1) + " to " + (start + length - 2)); 
		}
	

	public static void main(String[] args) {
		
		
		int len; 
		Scanner myScan = new Scanner(System.in); 
		System.out.println("Enter desired length of array: "); 
		len = myScan.nextInt(); 
		int myArray[] = new int[len]; 
		System.out.println("Enter elements of array: "); 

		for (int n = 0; n < len; n++){ 
			myArray[n] = myScan.nextInt(); 
		}
		
		System.out.println(findPlateau(myArray)); 
		
		myScan.close(); 
		
	}

}
