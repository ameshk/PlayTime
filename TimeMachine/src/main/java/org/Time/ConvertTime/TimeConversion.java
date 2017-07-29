package org.Time.ConvertTime;

import java.text.ParseException;

import org.Time.ReadTime.TimeToTime;

public class TimeConversion {
	
	public String ConvertTimeFormat(String Time,String FromFormat ,String ToFormat) throws ParseException
	{
		String Output_Time = "";
		TimeToTime tt = new TimeToTime();
		long Time_Long = tt.readTimeToLong(Time, FromFormat);
		Output_Time = tt.readLongToTime(Time_Long, ToFormat);
		return Output_Time;
	}
public static void main(String[] args) throws ParseException {
	TimeConversion tc = new TimeConversion();
	String New_Time = tc.ConvertTimeFormat("05/01/2017", "MM/dd/yyyy", "ww");
	System.out.println(New_Time);
}
}
