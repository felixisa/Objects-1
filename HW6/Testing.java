import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Testing {

	@Test
	void test() {
		Rational rat1 = new Rational(1, 2); 
		Rational rat2 = new Rational(2, 3); 
		
		assertEquals(rat1.getNumerator(), 1); 
		assertEquals(rat1.getDenominator(), 2); 
		assertEquals(rat1.plus(rat2).equal(new Rational(7, 6)), true); 
		assertEquals(rat2.minus(rat1).equal(new Rational(1, 6)), true);
		assertEquals(rat1.times(rat2).equal(new Rational(1, 3)), true);
		assertEquals(rat1.divides(rat2).equal(new Rational(3, 4)), true);
		assertEquals(rat1.toString(), "1/2"); 
		assertEquals(rat1.equal(rat2), false); 
		rat1.setNumerator(3);
		assertEquals(rat1.getNumerator(), 3);
		rat1.setDenominator(4);
		assertEquals(rat1.getDenominator(), 4);  

		Interval int1 = new Interval(1, 10); 
		Interval int2 = new Interval(4, 12); 
		
		assertEquals(int1.contains(5), true); 
		assertEquals(int1.intersects(int2), true); 
		assertEquals(int1.toString(), "(1, 10)"); 
		assertEquals(int1.getMin(), 1); 
		assertEquals(int2.getMax(), 12); 
		int1.setMin(11);
		assertEquals(int1.empty(), true); 

		Posn pos1 = new Posn(2, -1); 
		Posn pos2 = new Posn(-2, 2); 

		assertEquals(pos1.distanceTo(pos2), 5.0); 
		assertEquals(pos2.toString(), "(-2, 2)"); 
		pos1.setX(5);
		assertEquals(pos1.getX(), 5); 
		assertEquals(pos1.getY(), -1); 

	}

}
