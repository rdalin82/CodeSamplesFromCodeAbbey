import static org.junit.Assert.*;

import org.junit.Test;


public class MinimumOfTwoTest {

	@Test
	public void test() {
		String expected = new String("1 2 3");
		int[] one = { 3, 4, 5 };
		int[] two = { 1, 2, 3 };
		MinOfTwo minOfTwo = new MinOfTwo(one, two);
		assertEquals(expected, minOfTwo.result());
	}

}
