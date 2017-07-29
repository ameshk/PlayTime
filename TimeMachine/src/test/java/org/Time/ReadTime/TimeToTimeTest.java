package org.Time.ReadTime;

import static org.junit.Assert.*;

import java.text.ParseException;

import org.junit.Test;

public class TimeToTimeTest {

	@Test
	public void testTimeToLong() throws ParseException {
		TimeToTime t = new TimeToTime();
		long time = t.readTimeToLong("01/01/2017", "MM/dd/yyyy");
		long ExpectedResult = 1483209000000L;
		assertEquals(ExpectedResult, time);
	}
	
	@Test
	public void testLongToTime() throws ParseException {
		TimeToTime t = new TimeToTime();
		String time = t.readLongToTime(1483209000000L, "MM/dd/yyyy");
		String ExpectedResult = "01/01/2017";
		assertEquals(ExpectedResult, time);
	}

}
