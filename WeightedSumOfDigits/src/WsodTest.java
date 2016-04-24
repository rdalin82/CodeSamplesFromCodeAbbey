import static org.junit.Assert.*;


import org.junit.Test;


public class WsodTest {

	@Test
	public void test() {
		Wsod w = new Wsod("./test.txt");
		int length = 3;
		String inputs = "3\n9 15 1776\n";
		String[] inputArray = {"3", "9 15 1776"};
		assertEquals(length, w.getLength());
		assertEquals(inputs, w.getInput());
		assertEquals("3", w.getInputArray()[0]);
		assertEquals("9 15 1776", w.getInputArray()[1]);
		assertEquals(9, w.calculate(0));
		assertEquals(6, w.calculate(1));
	}

}
