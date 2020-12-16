package RSort;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RadixTests {
	
	Integer[] myArray = {1, 301, 45, 5, 8}; // unsorted
	Integer[] myArray2 = {1, 5, 8, 45, 301}; // sorted myArray
	
	Integer[] myArray3 = {69, 420, 3, 1, 7, 3999}; // unsorted
	Integer[] myArray4 = {1, 3, 7, 69, 420, 3999}; // sorted myArray3
	
	@Test
	void test() {
		
		assertEquals(Buckets.findMax(myArray), 301);
		assertEquals(Buckets.countDig(45), 2); 
		assertEquals(Buckets.mostDig(myArray), 3); 
		
		IBucket<Integer> bucket1 = new Bucket<Integer>();
        bucket1.add(0);
        bucket1.add(1);
        bucket1.add(2);
        bucket1.add(3);
        Integer[] X = {0, 0, 0, 0};
		assertEquals(bucket1.toArray(X, 0), 4);
		assertArrayEquals(X, new Integer[] {0, 1, 2, 3});
		RadixSort.radix(myArray); 
		
		assertEquals(myArray[0].equals(myArray2[0]), true); 
		assertEquals(myArray[1].equals(myArray2[1]), true); 
		assertEquals(myArray[2].equals(myArray2[2]), true); 
		assertEquals(myArray[3].equals(myArray2[3]), true); 
		assertEquals(myArray[4].equals(myArray2[4]), true); 
		
		RadixSort.radix(myArray3); 
		
		assertEquals(myArray3[0].equals(myArray4[0]), true); 
		assertEquals(myArray3[1].equals(myArray4[1]), true); 
		assertEquals(myArray3[2].equals(myArray4[2]), true); 
		assertEquals(myArray3[3].equals(myArray4[3]), true); 
		assertEquals(myArray3[4].equals(myArray4[4]), true); 
		assertEquals(myArray3[5].equals(myArray4[5]), true); 
		
	}

}
