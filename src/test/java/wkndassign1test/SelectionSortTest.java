package wkndassign1test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import wkndassign1.SelectionSort;

public class SelectionSortTest {
 SelectionSort selectionsort;
	@Before
	public void setUp() throws Exception {
		selectionsort=new SelectionSort();
	}

	@Test
	public void test() {
		String result=selectionsort.selectionSorting(new int[] {14,33,27,10,35});
		assertEquals("1014273335",result);
	}

}
