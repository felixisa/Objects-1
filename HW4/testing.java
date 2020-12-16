import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testing {

	int[] input = {1, 2, 3, 4, 5}; 
	int[] actual = ReverseArray.reversereverse(input);
	int[] expected = {5, 4, 3, 2, 1}; 

	double[] vect1 = {1, 2, 3, 4, 5}; 
	double[] vect2 = {5, 4, 3, 2, 1}; 

	@Test
	void test() {

		assertEquals(actual[0], expected[0]);
		assertEquals(actual[1], expected[1]);
		assertEquals(actual[2], expected[2]);
		assertEquals(actual[3], expected[3]);
		assertEquals(actual[4], expected[4]);

		assertEquals(Euclid.euclideanDistance(vect1, vect2), 6.324555320336759); 
		// according to euclidean distance calculator online
	}

}
