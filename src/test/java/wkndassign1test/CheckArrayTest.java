package wkndassign1test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import wkndassign1.CheckArray;

public class CheckArrayTest {
	CheckArray checkarray=null;
	@Before
	 public void setup()
	 {
		checkarray=new CheckArray();
	 }

	@Test
	public void Foundingnumbertest() {
		
		int result=checkarray.check(7);
		assertEquals(7,result);
		}
@Test
public void numbertest(){
	int result=checkarray.check(2);
	assertEquals(6,result);
	
}
@Test
public void findingtest()
{
	int result=checkarray.check(8);
	assertEquals(0,result);
}
}
