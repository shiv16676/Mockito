package com.shiv.mockito.mockitodemo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessMockAnnotationTest {
	
	@Mock
	DataService dataServiceMock;
	
	@InjectMocks
	SomeBusinessImpl someBusinessImpl;

	@Test
	public void testFindGreatestFromAllData() {
		when(dataServiceMock.retriveAllData()).thenReturn(new int[] {10,40,50,30,5});
		assertEquals(50,someBusinessImpl.findGreatestFromAllData());
	}

	@Test
	public void testFindGreatestFromAllDataForOneValue() {
		when(dataServiceMock.retriveAllData()).thenReturn(new int[] {10});
		assertEquals(10,someBusinessImpl.findGreatestFromAllData());
	}
	
	@Test
	public void testFindGreatestFromAllDataForNoValue() {
		when(dataServiceMock.retriveAllData()).thenReturn(new int[] {});
		assertEquals(Integer.MIN_VALUE,someBusinessImpl.findGreatestFromAllData());
	}
	
}
