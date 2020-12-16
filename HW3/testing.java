import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testing {

	@Test
	void test() {
		assertEquals(Program2part1.calculateBill(), 21600);
		assertEquals(Program2part2.weekdayLoop(), 3000); 
		assertEquals(Program2part2.weekendLoop(), 2400); 
		assertEquals(Program2part2.monthlyBill(), 21600); 
	}

}
