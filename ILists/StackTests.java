package ILists;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StackTests {

	@Test
	void test() throws Exception {
		IStack<Integer> emp1 = new EmptyStack<Integer>(); 
		IStack<Integer> nmt1 = new NonEmptyStack<Integer>(1, emp1); 
		IStack<Integer> nmt2 = new NonEmptyStack<Integer>(2, nmt1); 
		IStack<Integer> nmt3 = new NonEmptyStack<Integer>(3, nmt2);
		
		IStack<Integer> empstackL = new MTSTACK<Integer>();
		IStack<Integer> stackL1 = empstackL.push(1);
		IStack<Integer> stackL2 = stackL1.push(2);
		
		IList<Integer> MTL = new MTLIST<Integer>();
		IList<Integer> NMTL1 = MTL.cons(1).cons(2).cons(3);
		IList<Integer> NMTL2 = MTL.cons(3).cons(2).cons(1);
		
		assertEquals(emp1.emptyStack(), true); 
		assertEquals(nmt1.emptyStack(), false); 
		assertEquals(nmt2.emptyStack(), false); 
		
		assertEquals(emp1.push(1).equals(nmt1), true);
		assertEquals(nmt1.push(2).equals(nmt2), true);
		assertEquals(nmt2.push(3).equals(nmt3), true);
		
		empstackL = empstackL.push(1); 
		assertTrue(empstackL.equals(stackL1));
		assertTrue(stackL1.push(2).equals(stackL2));
		
		try{ 
			
			assertEquals(nmt3.pop().equals(nmt2), true); 
			assertEquals(nmt2.pop().equals(nmt1), true);
			assertEquals(nmt1.pop().equals(emp1), true); 
			
			assertEquals(stackL1.pop().equals(empstackL), true); 
			assertEquals(stackL2.pop().equals(stackL1), true);
			
			assertEquals(nmt1.top(), 1); 
			assertEquals(nmt2.top(), 2); 
			assertEquals(nmt3.top(), 3); 
			
			assertEquals(myReverse.reverse(NMTL1, emp1).equals(NMTL2), true); 
			assertEquals(myReverse.reverse(NMTL1, empstackL).equals(NMTL2), true);
			
		}
		catch(Exception e) { 
			System.out.println("Error: " + e.getMessage());
		}
	}

}
