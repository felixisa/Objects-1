package RSort;
import java.util.*;

public class Buckets implements IBuckets <Integer>{
    
	// create bucket for each single digit 
    Bucket <Integer> zero = new Bucket <Integer> (); 
    Bucket <Integer> one = new Bucket <Integer> (); 
    Bucket <Integer> two = new Bucket <Integer> (); 
    Bucket <Integer> three = new Bucket <Integer> (); 
    Bucket <Integer> four = new Bucket <Integer> (); 
    Bucket <Integer> five = new Bucket <Integer> (); 
    Bucket <Integer> six = new Bucket <Integer> (); 
    Bucket <Integer> seven = new Bucket <Integer> (); 
    Bucket <Integer> eight = new Bucket <Integer> (); 
    Bucket <Integer> nine = new Bucket <Integer> (); 

    ArrayList <Bucket<Integer>> LoB = new ArrayList<Bucket<Integer>>(); 

    public Buckets(){ 

    	// create list of buckets to be easily indexed and accessed when sorting 
        LoB.add(zero); 
        LoB.add(one); 
        LoB.add(two); 
        LoB.add(three); 
        LoB.add(four); 
        LoB.add(five); 
        LoB.add(six); 
        LoB.add(seven); 
        LoB.add(eight); 
        LoB.add(nine); 

    }

    // Purpose: to find the largest number in an array
    public static Integer findMax(Integer[] V){ 
        Integer max = V[0]; // initialize max value as first element of array 
        // max is used to maintain the current highest value of the array 
        int low = 0; 
        int high = V.length; 
        // low and high are used to process array like a vector interval, increasing low on each loop
        while (low < high){ // loop terminates because low increases by one on each loop and will eventually be >= high
            if (V[low] > max){ // if current low value is > current max value
                max = V[low]; // change max to current low 
            }
            low = low + 1; 
        }
        return max; 
    }

    // Purpose: to count the place digits of an integer 
    public static int countDig(Integer i){ 
        double num = i; // store given value as num to avoid mutation of input and to cast from Integer to double
        int total = 1; // total places starts at 1 because no number has zero places. it must at least be a single digit number. 
        
        while (num > 10){ // count digits until you can't divide by ten anymore 
            total = total + 1; 
            num = num / 10; 
        }
        return total; 
    }

    // Purpose: count digits of largest number in array 
    // used to determine how long to loop when bucketizing 
    public static int mostDig(Integer[] V){ 
        return countDig(findMax(V)); 
    }

    // Purpose: to sort array in place by moving array elements into the appropriate bucket
    public void bucketize(Integer[] V){ 
        int length = mostDig(V); 
        int dig = 0; // used to determine which bucket to add to 

        while (dig <= length){ 
        	// bucketize array based on current digit
            bucketizeHelper(V, dig);
            // place bucketized elements back into array 
            this.debucketize(V);
            // increase digit
            dig = dig + 1; 
        }
    }

    // Purpose: to place array elements into the correct buckets based on the given digit
    public void bucketizeHelper(Integer[] v, int div) {
		int high = v.length;
		int low = 0;
		// low and high are used to process the array with a vector interval, increasing low on each loop
		while(low < high) { // loop terminates because low increases on each loop, eventually being >= high 
			int current = v[low]; // store current low element 
			int dig = (int) ((current%(Math.pow(10, div + 1))) / (Math.pow(10, div)));
			// use digit of current element to determine which bucket to use
			LoB.get(dig).add(current); // add current to the appropriate bucket in the list of buckets
			low = low + 1; // increase low 
			
		}
    }
    
    // Purpose: to place bucketized elements back into array 
    public void debucketize(Integer[] V){ 
        int bindex = 0; // used to process list of buckets, increased on each loop
        int dumpAt = 0; // used to determine where in the array to dump bucket

        while (bindex < 10){ // terminates because there are only 10 buckets and bindex will eventually = 10
            dumpAt = dumpAt + LoB.get(bindex).toArray(V, dumpAt); 
            // dump bucket at LoB[bindex] into array at dumpAt
            bindex = bindex + 1; // increase bindex to dump next bucket 
        }
    }
  	

}
