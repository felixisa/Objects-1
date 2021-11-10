package Shapes;

public class AQuad extends AShape implements IQuad{
	
protected Integer other;
	
	public AQuad(Integer side1, Integer side2){
		this.x = side1;
		this.other = side2;
	}
	
	public Double getPerimeter(){
		return (new Double (2 * x + 2 * other));
	}
	
	public Double getArea(){
		return (new Double (x * other));
	}

}
