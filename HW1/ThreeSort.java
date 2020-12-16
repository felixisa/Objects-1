import java.util.Scanner;
import java.lang.Math;

//exercise 1.2.34

public class ThreeSort {
	
	// Purpose: To sort three int values in ascending order 
	public static String sort(int num1, int num2, int num3) { 
		int smallest = Math.min(num1, Math.min(num2, num3)); 
		int mid = Math.max((Math.max(Math.min(num2,num3),Math.min(num1,num3))), Math.max(Math.min(num1,num2),Math.min(num2,num3))); 
		int largest = Math.max(num1, Math.max(num2, num3));  
		
		return smallest + "\n" + mid + "\n" + largest;
	}
	
	public static void main(String[] args) {
		
		Scanner myScan = new Scanner(System.in);
		System.out.println("Enter first number"); 
		int x = myScan.nextInt(); 
		System.out.println("Enter second number"); 
		int y = myScan.nextInt(); 
		System.out.println("Enter third number"); 
		int z = myScan.nextInt(); 
		
		System.out.println(sort(x, y, z));

		myScan.close();
	}
}
