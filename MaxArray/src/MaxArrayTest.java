import static org.junit.Assert.*;

import org.junit.Test;


public class MaxArrayTest {

	@Test
	public void test() {
		int[] array = { 3, 2, 100, 2, 1, 3, 5, 7, -3, -100, 2 };
		MaxArray arr = new MaxArray(array);
		assertEquals(100, arr.getMax());
		assertEquals(-100, arr.getMin());
	}

}
