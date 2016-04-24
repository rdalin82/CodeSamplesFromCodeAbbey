import static org.junit.Assert.*;

import org.junit.Test;


public class DiceRollTest {

	@Test
	public void test() {
		DiceRoll dr = new DiceRoll("./test.txt");
		assertEquals("4 6 3 2 5 1", dr.getResult());
	}

}
