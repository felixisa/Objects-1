import java.util.Scanner;

// exercise 1.2.32

public class ColorConversion {
	
	// Purpose: To return the maximum of three integers 
	public static double maxi(double x, double y, double z) { 
		if(x > y && x > z) 
			return x; 
		else if(y > x && y > z)
			return y; 
		else 
			return z; 
	}
	
	// Purpose: To convert RGB values to CMYK values 
	public static String RGBtoCMYK(double r, double g, double b){ 
		double w = maxi(r/255,g/255,b/255); 
		double c = Math.round(((w - (r / 255)) / w) * 100) / 100.0; 
		double m = Math.round(((w - (g / 255)) / w) * 100) / 100.0; 
		double y = Math.round(((w - (b / 255)) / w) * 100) / 100.0; 
		double k = Math.round((1 - w) * 100) / 100.0; 
		
		if(r == 0 && g == 0 && b == 0) 
			return "C = 0 \nM = 0 \nY = 0 \nK = 1"; 
		else 
			return "C = " + c + "\nM = " + m + "\nY = " + y + "\nK = " + k;
	}

	public static void main(String[] args) {
		
		Scanner myScan = new Scanner(System.in);
		System.out.println("Enter R value"); 
		int RED = myScan.nextInt(); 
		System.out.println("Enter G value"); 
		int GREEN = myScan.nextInt(); 
		System.out.println("Enter B value"); 
		int BLUE = myScan.nextInt(); 
		
		System.out.println(RGBtoCMYK(RED,BLUE,GREEN)); 

		myScan.close();

	}

}
