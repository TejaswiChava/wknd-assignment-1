package wkndassign1test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import wkndassign1.InsertionOperation;

public class InsertionSortTest {
	InsertionOperation insertionoperation;

	@Before
	public void setUp() throws Exception {
		insertionoperation=new InsertionOperation();
	}

	@Test
	public void test() {
		String result=insertionoperation.insertionsort(new int[] {14,33,27,10,35});
		
	
	assertEquals("1014273335",result);
	}

}
