
public class Interval {
	
	private double min; 
	private double max; 
	
	public Interval(double x, double y) { 
		min = x; 
		max = y; 
	}
	
	// Purpose: to get the minimum of this interval
	public double getMin() { 
		return this.min; 
	}
	
	// Purpose: to get the maximum of this interval
	public double getMax() { 
		return this.max; 
	}
	
	// Purpose: to set the minimum of this interval to the given number
	public void setMin(double n) { 
		this.min = n;  
	}
	
	// Purpose: to set the maximum of this interval to the given number
	public void setMax(double n) { 
		this.max = n; 
	}
	
	// Purpose: to determine if an interval is empty
	public boolean empty() { 
		return this.getMax() < this.getMin();
	}
	
	// Purpose: to determine if x is in this interval
	public boolean contains(double x) { 
		if(this.empty()) { 
			return false;
		}
		else 
			return (x >= this.getMin() && x <= this.getMax()); 
	}
	
	// Purpose: to determine if this interval and b intersect 
	public boolean intersects(Interval b) { 
		return (this.contains(b.getMin()) || this.contains(b.getMax())); 
	}
	
	// Purpose: to return the string representation of this interval 
	public String toString() { 
		return "(" + (int)this.getMin() + ", " + (int)this.getMax() + ")"; 
	}

	public static void main(String[] args) {
		
	}

}
