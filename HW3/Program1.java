
public class Program1 {

	public static void printLetters(){ 
		// Purpose: to generate all combinations of two letters between 'A' and 'E', 
		// and display in ascending order, to identify all possible 2 letter domains for “shu.edu” 

		String[] letters = {"A", "B", "C", "D", "E"}; 
		// INV: i is the first letter in the printed pair
		for(int i = 0; i < letters.length; i++){ 
			// INV: j is the second letter in the printed pair 
			for(int j = 0; j < letters.length; j++){ 
				System.out.println(letters[i] + letters[j] + ".shu.edu"); 
			}
		}

	}

	public static void main(String[] args) {

		printLetters(); 

	}

}
