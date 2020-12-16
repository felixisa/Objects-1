import java.util.Scanner; 

public class ReverseArray {

	public static int[] reversereverse(int[] arr){ 
		// cha cha now yall
		// Purpose: To return a reversed array 
		int len = arr.length - 1;
		int i = 0; 
		int temp; 
		
		// INV: array before i and after len has been switched 
		while (i < len){ 
			temp = arr[i]; 
			arr[i] = arr[len]; 
			arr[len] = temp; 
			i++; 
			len--; 
		}
		return arr; 
	}

	public static void main(String[] args) {
		
		int i; 

		Scanner myScan = new Scanner(System.in); 
		System.out.println("Enter desired length of array: "); 
		i = myScan.nextInt(); 
		int myArray[] = new int[i]; 
		System.out.println("Enter elements of array: "); 

		for (int n = 0; n < i; n++){ 
			myArray[n] = myScan.nextInt(); 
		}

		System.out.println("Reversed array: "); 

		reversereverse(myArray);

		for (int f = 0; f < myArray.length; f++){ 
			System.out.println((myArray)[f]); 
		}

		myScan.close(); 

	}

}
