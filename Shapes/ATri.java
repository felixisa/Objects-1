package Shapes;

public abstract class ATri extends AShape implements ITri{
	
protected Integer other, side2, side3;
	
	public ATri(Integer base, Integer s2, Integer s3, Integer height){
		this.x = base;
		this.side2 = s2;
		this.side3 = s3;
		this.other = height;
	}
	

	public Double getPerimeter(){
		return (new Double (x + side2 + side3));
	}
	
	public Double getArea(){
		return (new Double ((x * other)/2));
	}

}
