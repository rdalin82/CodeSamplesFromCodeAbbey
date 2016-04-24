import static org.junit.Assert.*;

import org.junit.Test;


public class BodyMassTest {

	@Test
	public void test() {
		BodyMass bm = new BodyMass();
		assertEquals("over normal under", bm.getResult());	
	}
}
