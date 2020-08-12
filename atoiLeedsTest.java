/* Odile Wolf
 * 8/12/2020
 * create tests for atoi for base 10 only
 * dealing with overflow, underflow
 * leading with spaces allowed
 * stop at first alpha character
 */
package atoiLeeds;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class atoiLeedsTest {

	@Test // only testing a simple number
	void testMyAtoiSimpleTest() {
		atoiLeeds testAtoi = new atoiLeeds();
		assertTrue(testAtoi.myAtoi("42") == 42);
		
	}
	
	@Test // testing a negative number
	void testMyAtoiSimpleNegative() {
		atoiLeeds testAtoi = new atoiLeeds();
		assertTrue(testAtoi.myAtoi("-42") == -42);
		
	}
	
	@Test // testing leading white spaces
	void testMyAtoiLeadingWhiteSpaces() {
		atoiLeeds testAtoi = new atoiLeeds();
		assertTrue(testAtoi.myAtoi("   42") == 42);
		
	}
	
	@Test // testing alpha after
	void testMyAtoiInvalidAfter() {
		atoiLeeds testAtoi = new atoiLeeds();
		assertTrue(testAtoi.myAtoi("42AB") == 42);
		
	}
	
	@Test // testing alpha after from leeds
	void testMyAtoiWithWords() {
		atoiLeeds testAtoi = new atoiLeeds();
		assertTrue(testAtoi.myAtoi("413with words") == 413);
		
	}
	
	@Test // testing alpha before
	void testMyAtoiWordsBefore() {
		atoiLeeds testAtoi = new atoiLeeds();
		assertTrue(testAtoi.myAtoi("words and 987") == 0);
		
	}
	
	@Test // testing below min
	void testMyAtoiBelowMin() {
		atoiLeeds testAtoi = new atoiLeeds();
		System.out.println("min result " + testAtoi.myAtoi("-91283472332") );
		assertTrue(testAtoi.myAtoi("-91283472332") == Integer.MIN_VALUE);
		
	}
	@Test // testing above max
	void testMyAtoiAboveMax() {
		atoiLeeds testAtoi = new atoiLeeds();
		assertTrue(testAtoi.myAtoi("91283472332") == Integer.MAX_VALUE);
		
	}
	@Test // testing +1
	void testMyAtoiPositiveNumber() {
		atoiLeeds testAtoi = new atoiLeeds();
		assertTrue(testAtoi.myAtoi("+1") == 1);
		
	}
	@Test // testing "2147483648"
	void testMyAtoiBigNumber() {
		atoiLeeds testAtoi = new atoiLeeds();
		assertTrue(testAtoi.myAtoi("2147483648") ==  2147483647);
		
	}
	
}
