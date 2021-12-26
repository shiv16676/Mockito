package com.shiv.mockito.mockitodemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class SomeBusinessStubTest {

	@Test
	public void testFindGreatestFromAllData() {
		SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl(new DataServiceStub());
		int result = someBusinessImpl.findGreatestFromAllData();
		
		assertEquals(40,result);
		
	}

}

class DataServiceStub implements DataService{

	@Override
	public int[] retriveAllData() {
		return new int[] {20,10,40,30};
	}
	
}
