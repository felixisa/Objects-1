import java.util.Scanner; 

public class CountingPrimes {

    // Purpose: To check if a number is prime
    public static boolean IsPrime(int x){ 
        int y = (int)(Math.floor(Math.sqrt(x)));
        if (x <= 1){ 
            return false; 
        }
        for(int i = 2; i <= y; i++){

            if ((x % i) == 0)
                return false;
        }
            
            return true;    
    }

    // Purpose: To count prime numbers <= a
    public static int PrimeCounter(int a){ 
        int counter = 0; 
        for (int i = 1; i <= a; i++){ 
            if (IsPrime(i)){ 
                counter++; 
            }
        }
        return counter; 
    }

    public static void main(String[] args) { 
        Scanner myScan = new Scanner(System.in);
        System.out.println("gimme number"); 
        int i = myScan.nextInt();

        System.out.println("The number of primes <= " + i + " is " + PrimeCounter(i)); 
		
		myScan.close();
    }
    
}
