import java.util.Scanner;

public class Euclid {

	public static double euclideanDistance(double[] v1, double[] v2) {
		// Purpose: To calculate the euclidean distance between two vectors 
		double sum = 0;
		int i = 0;

		// INV: sum = sqrt((v2[i-1] - v1[i - 1])^2) + ... + sqrt((v2[i] - v1[i])^2)
		while (i < v1.length) {
			sum = sum + Math.pow(v2[i] - v1[i], 2);
			i++;
		}
		return Math.sqrt(sum);
	}

	public static void main(String[] args) {

		int i; 

		Scanner myScan = new Scanner(System.in); 
		System.out.println("Enter desired length of vectors: "); 
		i = myScan.nextInt(); 
		double vector1[] = new double[i]; 
		double vector2[] = new double[i]; 
		System.out.println("Enter elements of first vector: "); 

		for (int n = 0; n < i; n++){ 
			vector1[n] = myScan.nextDouble(); 
		}

		System.out.println("Enter elements of second vector: ");

		for (int n = 0; n < i; n++){ 
			vector2[n] = myScan.nextDouble(); 
		}

		myScan.close();

		System.out.println("Euclidean Distance: " + euclideanDistance(vector1, vector2));

	}

}
