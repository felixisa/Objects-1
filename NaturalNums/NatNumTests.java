package NaturalNums;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NatNumTests {

	@Test
	public void test() {
		
		natnum zero = new Zero(); 
		natnum one = zero.succ();
		natnum two = zero.succ().succ(); 
		natnum three = two.succ(); 
		natnum four = two.add(two); 
		natnum five = two.succ().succ().succ();  
		
		assertEquals(zero.getVal(), 0); 
		assertEquals(two.getVal(), 2); 
		assertEquals(four.getVal(), 4); 
		
		assertEquals(zero.isZero(), true); 
		assertEquals(two.isZero(), false); 
		
		assertEquals(zero.equal(zero), true); 
		assertEquals(zero.equal(two), false); 
		
		assertEquals(five.lessthan(two), false); 
		assertEquals(zero.lessthan(five), true); 
		
		assertEquals(five.greaterthan(two), true); 
		assertEquals(zero.greaterthan(five), false); 
		
		assertEquals(zero.lessthan(zero), false);
		assertEquals(zero.lessthan(two), true);
		assertEquals(two.lessthan(zero), false);
		
		assertEquals(zero.greaterthan(zero), false);
		assertEquals(two.greaterthan(zero), true);
		assertEquals(zero.greaterthan(two), false);
		
		assertEquals(zero.leq(zero), true);
		assertEquals(two.leq(zero), false);
		assertEquals(zero.leq(two), true);
		
		assertEquals(zero.geq(zero), true);
		assertEquals(two.geq(zero), true);
		assertEquals(zero.geq(two), false);
		
		try { 
			
			assertEquals(two.pred().getVal(), 1); 
			assertEquals(zero.add(two), two); 
			assertEquals(one.add(two).getVal(), three.getVal()); 
			assertEquals(two.subtract(one).getVal(), one.getVal()); 
			assertEquals(three.subtract(two).getVal(), one.getVal()); 
			assertEquals(three.multiply(one).getVal(), three.getVal()); 
			assertEquals(zero.multiply(three), zero); 
			assertEquals(five.remainder(two).getVal(), one.getVal());
			assertEquals(zero.remainder(two).getVal(), zero.getVal());
			assertEquals(four.quotient(two).getVal(), two.getVal());
			assertEquals(zero.quotient(two).getVal(), zero.getVal());
			assertEquals(Factorial.fact(four).getVal(), 24); 
			assertEquals(Factorial.fact(five).getVal(), 120); 
			
		}
		catch(Exception e) { 
			System.out.println("Error: " + e.getMessage());
		}
	
		
	}

}
