import static org.junit.Assert.*;

import org.junit.Test;


public class MinOfThreeTest {

	@Test
	public void test() {
		int[] one = { 5, 1, 10 } ;
		int[] two = { 10, 3, 1 } ;
		int[] three = { 1, 12, 2 }; 
		MinOfThree min3 = new MinOfThree(one, two, three);
		assertEquals("1 1 1", min3.result());
	}

}
