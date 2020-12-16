
public class Posn {
	
	private double x; 
	private double y; 
	
	public Posn(double num1, double num2) { 
		x = num1; 
		y = num2; 
	}
	
	// Purpose: to get the x of this posn 
	public double getX() { 
		return this.x; 
	}
	
	// Purpose: to get the y of this posn 
	public double getY() { 
		return this.y; 
	}
	
	// Purpose: to set the x of this posn to the given number 
	public void setX(double newx) { 
		this.x = newx; 
	}
	
	// Purpose: to set the y of this posn to the given number 
	public void setY(double newy) { 
		this.y = newy; 
	}
	
	// Purpose: To find the distance between this posn and q 
	public double distanceTo(Posn q) { 
		double ydiff = q.getY() - this.getY(); 
		double xdiff = q.getX() - this.getX(); 
		double sumofsqrs = Math.pow(ydiff, 2) + Math.pow(xdiff, 2); 
		return Math.sqrt(sumofsqrs); 
	}
	
	// Purpose: to return the string representation of this interval 
		public String toString() { 
			return "(" + (int)this.getX() + ", " + (int)this.getY() + ")"; 
		}

	public static void main(String[] args) {
		

	}

}
