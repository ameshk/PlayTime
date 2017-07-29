package org.Time.ConvertTime;

import static org.junit.Assert.*;

import java.text.ParseException;

import org.junit.Test;

public class TimeConversionTest {

	@Test
	public void test() throws ParseException {
		TimeConversion tc = new TimeConversion();
		String Actual_OP = tc.ConvertTimeFormat("01/25/2017", "MM/dd/yyyy", "yyyy/MM/dd");
		String Expected_OP = "2017/01/25";
		assertEquals(Expected_OP, Actual_OP);
	}

}
