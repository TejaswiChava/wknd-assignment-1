package wkndassign1test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import wkndassign1.BubbleSort;

public class BubbleSortTest {
	BubbleSort bubblesort;

	@Before
	public void setUp() throws Exception {
		bubblesort=new BubbleSort();
	}

	@Test
	public void test() {
		String result=bubblesort.bubbleSorting(new int[] {14,33,27,10,35});
		assertEquals("1014273335",result);
	}

}
