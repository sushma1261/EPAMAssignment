import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleCompoundInterestTest {

	@Test
	void simpleInterestTest() {
		SimpleCompoundInterest sci = new SimpleCompoundInterest();
		assertEquals(225 ,sci.SimpleInterest(5000, 1.5f, 3));
		assertEquals(45 ,sci.SimpleInterest(4500, 0.5f, 3));
	}
	
	@Test
	void compoundInterestTest() {
		SimpleCompoundInterest sci = new SimpleCompoundInterest();
		assertEquals(225 ,sci.CompoundInterest(5000, 1.5f, 3));
		assertEquals(45 ,sci.CompoundInterest(4500, 0.5f, 3));
	}
	

}
