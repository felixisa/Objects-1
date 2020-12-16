import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HomeworkTesting {

	@Test
	void test() {
		//color converter tests
		assertEquals(ColorConversion.RGBtoCMYK(255, 201, 96), "C = 0.0\nM = 0.21\nY = 0.62\nK = 0.0");
		assertEquals(ColorConversion.RGBtoCMYK(0, 0, 0), "C = 0 \nM = 0 \nY = 0 \nK = 1");
		
		// compounded interest tests
		assertEquals(ContinuoslyCompoundedInterest.calculateAmount(2000, .13, 20), 26927.43);
		assertEquals(ContinuoslyCompoundedInterest.calculateAmount(1000, .025, 5), 1133.15);
		
		// three number sorter tests
		assertEquals(ThreeSort.sort(23, 5, 190), "5\n23\n190"); 
		assertEquals(ThreeSort.sort(456, 645, 654), "456\n645\n654"); 
	}

}
