package Shapes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class shapeTests {

	@Test
	void test() {
		Square s = new Square(4);
		assertEquals(s.getArea().doubleValue(), 16.0, 0.1);
		assertEquals(s.getPerimeter().doubleValue(), 16.0, 0.1);
		
		Rect r = new Rect(3, 5);
		assertEquals(r.getArea().doubleValue(), 15.0, 0.1);
		assertEquals(r.getPerimeter().doubleValue(), 16.0, 0.1);
		
		Rhombus rh = new Rhombus(4, 3);
		assertEquals(rh.getArea().doubleValue(), 12.0, 0.1);
		assertEquals(rh.getPerimeter().doubleValue(), 16.0, 0.1);
		
		Equi e = new Equi(4, 5);
		assertEquals(e.getArea().doubleValue(), 10.0, 0.1);
		assertEquals(e.getPerimeter().doubleValue(), 12.0, 0.1);
		
		Isosceles i = new Isosceles(4, 6, 7);
		assertEquals(i.getArea().doubleValue(), 14.0, 0.1);
		assertEquals(i.getPerimeter().doubleValue(), 16.0, 0.1);
		
		Scalene sc = new Scalene(4, 5, 6, 3);
		assertEquals(sc.getArea().doubleValue(), 6.0, 0.1);
		assertEquals(sc.getPerimeter().doubleValue(), 15.0, 0.1);
		
		Circle c = new Circle(2);
		assertEquals(c.getArea().doubleValue(), 12.56, 0.1);
		assertEquals(c.getPerimeter().doubleValue(), 12.56, 0.1);
	}

}
