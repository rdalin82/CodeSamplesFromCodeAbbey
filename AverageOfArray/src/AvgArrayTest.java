import static org.junit.Assert.*;

import org.junit.Test;


public class AvgArrayTest {

	@Test
	public void testInputArray() {
		AvgArray test = new AvgArray("./test.txt");

		test.setInputArray();
		assertEquals("2 3 7", test.getInputArray()[1]);
	}
	@Test
	public void testLength() {
		AvgArray test = new AvgArray("./test.txt");
	
		test.setInputArray();
		assertEquals(3, test.getLength());
	}
	@Test
	public void testArrayofStrings() {
		AvgArray test = new AvgArray("./test.txt");
		test.setInputArray();
		test.setArrayofStrings();
		
		assertEquals("2", test.getArrayofStrings()[0][0]);
		assertEquals("3", test.getArrayofStrings()[0][1]);
		assertEquals("7", test.getArrayofStrings()[0][2]);
		assertEquals("20", test.getArrayofStrings()[1][0]);
		assertEquals("10", test.getArrayofStrings()[1][1]);
		assertEquals("1", test.getArrayofStrings()[2][0]);
	}
	@Test
	public void testArrayofInts() {
		AvgArray test = new AvgArray("./test.txt");
		test.setInputArray();
		test.setArrayofStrings();
		test.setArrayofInts();
		
		assertEquals(2, test.getArrayOfInts()[0][0]);
		assertEquals(3, test.getArrayOfInts()[0][1]);
		assertEquals(7, test.getArrayOfInts()[0][2]);
		assertEquals(20, test.getArrayOfInts()[1][0]);
		assertEquals(10, test.getArrayOfInts()[1][1]);
		assertEquals(1, test.getArrayOfInts()[2][0]);
	}
	@Test
	public void test(){
		AvgArray test = new AvgArray("./test.txt");
		test.setInputArray();
		test.setArrayofStrings();
		test.setArrayofInts();
		
		assertEquals("4 15 1", test.getResult());
	}

}
