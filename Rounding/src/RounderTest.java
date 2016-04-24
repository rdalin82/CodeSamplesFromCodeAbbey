import static org.junit.Assert.*;

import org.junit.Test;


public class RounderTest {

	@Test
	public void test() {
		int[] arr1 = { 12, -11, 1381678 };
		int[] arr2 = { 5, 3, -2140081 };
		Rounder r = new Rounder(arr1, arr2);
		assertEquals("2 -4 -1", r.result());
	}

}
