import java.util.Scanner;

public class Duplicates {
	
	public static boolean areThereDuplicates(int[] arr){ 
		// Purpose: To determine if there are duplicates in an array 
		boolean res = false; 
		for (int i = 0; i < arr.length - 1; i++) { 
			for (int j = i + 1; j < arr.length; j++) { 
				if (arr[i] == arr[j]) { 
					res = true; 
				}
			}
		}
		return res; 
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
		
		System.out.println(areThereDuplicates(myArray)); 
		
		myScan.close(); 

	}

}
