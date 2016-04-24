import static org.junit.Assert.*;

import org.junit.Test;


public class AddTwoArraysTest {

	@Test
	public void test() {
		int[] l1 = {1, 2};
		int[] l2 = {1, 2};
		AddTwo a = new AddTwo(l1, l2);
		int[] test = a.addArrays();
		int[] result = { 2, 4 };
		for (int i=0; i<result.length; i++){
		assertEquals(result[i], test[i]);
		}
		assertEquals(l1.length, a.getLength());
		assertEquals("2 4 ", a.getPrettyResult());
		AddTwo test2 = new AddTwo(l1, l2);
		assertEquals("2 4 ", test2.getPrettyResult());
		
	}


}
