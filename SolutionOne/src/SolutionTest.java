import static org.junit.Assert.*;

import org.junit.Test;


public class SolutionTest {

	@Test
	public void test() {
		Solution s = new Solution();
		assertEquals(3, s.add(1, 2));
		assertEquals(4, s.add(1, 3));
		
	}

}
