import static org.junit.Assert.*;

import org.junit.Test;


public class MedianOfThreeTest {
	
	
	@Test
	public void test() {
		
		MedianOfThree m = new MedianOfThree();
		
		
		assertEquals(3, m.splitLineInFileArray().length);
		assertEquals("7", m.splitSpaceInFileArray()[0][0]);
		m.convertToIntArray();
		
		assertEquals(7, m.getIntIntArray()[0][0]);
		assertEquals(15,m.getIntIntArray()[1][0]);
		assertEquals(300, m.getIntIntArray()[2][0]);
		m.sortIntIntArray();
				
		assertEquals("5 20 300", m.result());
	}

}
