import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class SumOfDigitsTest {

	;

	@Test
	public void test() {
		SumOfDigits sod = new SumOfDigits("./test.txt");
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(100, 0);
		list.add(1492, 1);
		list.add(1776, 2);
		assertEquals(list, sod.getSums());
	}

}
