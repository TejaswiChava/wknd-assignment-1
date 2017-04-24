package wkndassign1test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import wkndassign1.Binary;

public class BinaryTest {
	Binary binary=null;
	@Before
	public void setup()
	{
		binary=new Binary();
	}

	@Test
	public void binarytest() {
	int result=binary.check(9);
	assertEquals(9,result);
	}
	@Test
	public void searchtest()
	{
		int result1=binary.check(2);
		assertEquals(2,result1);
		
	}
	@Test
	public void searchingtest()
	{
		int result2=binary.check(-1);
		assertEquals(0,result2);
		
	}

}
