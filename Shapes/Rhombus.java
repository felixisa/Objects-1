package Shapes;

public class Rhombus extends AQuad{ 
	
	public Rhombus(Integer side, Integer height){
		super(side, height);
	}
	
	
	public Double getPerimeter(){
		return(double)(4 * x);
	}

}
