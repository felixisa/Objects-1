import java.util.Scanner;

// corrected version

public class RankGrades {

    // Purpose: to return an array where the given grades are replaced with their rankings
    public static int[] rankGrades(double[] A){ 

        double[] grades = A; 
        int[] rankings = new int[A.length]; 
        int rank = 1; 
        int i = 0; 

        // INV: max is the current highest grade and maxIndex is its index 
        // rank < grades.length && i <= grades.length 
        while (i <= grades.length-1){ 
            double max = getMax(grades); 
            int maxIndex = getIndex(grades, max); 

            rankings[maxIndex] = rank; 
            rank++; 
            grades[maxIndex] = -1; 
            i++; 
        }
        return rankings; 
    }

    // Purpose: To find the largest value in the given array
    public static double getMax(double[] A){ 

        double currentMax = A[0]; 
        int i = 0; 

        // INV: currentMax >= A[i - 1]
        while (i <= currentMax){ 
            if (A[i] >= currentMax){ 
                currentMax = A[i]; 
            }
            i++; 
        }
        return currentMax;

    }

    // Purpose: to get the index of the given value in the given array 
    // return -1 if max is not in A
    public static int getIndex(double[] A, double max){ 

        int i = 0; 
        while (i <= A.length){ 
            if (A[i] == max){ 
                return i;
            }
            i++; 
        }
        return -1;
    }

    public static void main(String[] args){ 
        int i; 

		Scanner myScan = new Scanner(System.in); 
		System.out.println("Enter desired length of array: "); 
		i = myScan.nextInt(); 
		int myArray[] = new int[i]; 
		System.out.println("Enter grades: "); 

		for (int n = 0; n < i; n++){ 
			myArray[n] = myScan.nextInt(); 
        }
        


        myScan.close();

    }
    
}
