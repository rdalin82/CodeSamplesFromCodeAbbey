import static org.junit.Assert.*;

import org.junit.Test;


public class FarenToCelTest {

	@Test
	public void test() {
		int[] test = { 495, 353, 168, -39, 22 };
		FarenToCel f = new FarenToCel(test);
		assertEquals("257 178 76 -39 -6", f.result());
	}

}
