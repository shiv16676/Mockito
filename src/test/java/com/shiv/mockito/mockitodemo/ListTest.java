package com.shiv.mockito.mockitodemo;

import java.util.List;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListTest {

	@Test
	public void testSize() {
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(10);
		assertEquals(10,listMock.size());
	}
	
	@Test
	public void testMultipleReturns() {
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(10).thenReturn(20).thenReturn(100);
		assertEquals(10,listMock.size());
		assertEquals(20,listMock.size());
		assertEquals(100,listMock.size());
		assertEquals(100,listMock.size());
	}
	
	@Test
	public void testGetSpecificParam() {
		List listMock = mock(List.class);
		when(listMock.get(0)).thenReturn("Shiv");
		assertEquals("Shiv",listMock.get(0));
		assertEquals(null,listMock.get(1));
		assertEquals(null,listMock.get(3));
	}
	
	@Test
	public void testGetGenericParam() {
		List listMock = mock(List.class);
		when(listMock.get(Mockito.anyInt())).thenReturn("Shiv");
		assertEquals("Shiv",listMock.get(0));
		assertEquals("Shiv",listMock.get(1));
	}

}
