package Shapes;

public class Circle extends AShape{
	
private static Double PI = 3.14;
	
	public Circle(Integer radius){
		this.x = radius;
	}
	
	public Double getPerimeter(){
		return (new Double (2 * PI * x));
	}
	
	public Double getArea(){
		return (new Double (PI * (x * x)));
	}

}
