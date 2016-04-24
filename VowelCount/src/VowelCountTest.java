import static org.junit.Assert.*;


import org.junit.Test;


public class VowelCountTest {

	@Test
	public void test() {
		VowelCounter vc = new VowelCounter("./text.txt");
		

		String result = new String("12 11 10 5 14 6 8 10 14 16 7 8 7 9 10 9 10");
		assertEquals(result, vc.count());
	}

}
