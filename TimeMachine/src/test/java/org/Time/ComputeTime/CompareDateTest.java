package org.Time.ComputeTime;

import static org.junit.Assert.*;

import org.junit.Test;

public class CompareDateTest {

	@Test
	public void testCompareTime() {
		CompareDate cdt = new CompareDate();
		int posative_Expected = 1;
		int Negative_Expected = -1;
		int equals_Expected = 0;
		
		int posative_Actual = cdt.CompareTime(10L, 5L);
		int Negative_Actual = cdt.CompareTime(10L, 15L);
		int equals_Actual = cdt.CompareTime(10L, 10L);
		
		assertEquals(posative_Expected, posative_Actual);
		assertEquals(Negative_Expected, Negative_Actual);
		assertEquals(equals_Expected, equals_Actual);
	}

}
