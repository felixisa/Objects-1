import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestingHW2 {

	@Test
	void test() {

		// tests for GCD 
		assertEquals(GreatestCommonDivisor.EuclidsGCD(5, 10), 5);
		assertEquals(GreatestCommonDivisor.EuclidsGCD(36, 72), 36);
		assertEquals(GreatestCommonDivisor.EuclidsGCD(150, 20), 10);

		// tests for IsPrime
		/*
		assertEquals(CountingPrimes.IsPrime(7), true);
		assertEquals(CountingPrimes.IsPrime(30), false);

		// tests for Prime Counter
		assertEquals(CountingPrimes.PrimeCounter(100), 25);
		assertEquals(CountingPrimes.PrimeCounter(10000000), 664579);
		*/
	}

}
