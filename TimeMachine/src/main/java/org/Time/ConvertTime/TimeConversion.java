package org.Time.ConvertTime;

import java.text.ParseException;
import java.util.Date;

import org.Time.ReadTime.TimeToTime;

public class TimeConversion extends TimeToTime {
	
	public String ConvertTimeFormat(String Time,String FromFormat ,String ToFormat) throws ParseException
	{
		String Output_Time = "";
		long Time_Long = readTimeToLong(Time, FromFormat);
		Output_Time = readLongToTime(Time_Long, ToFormat);
		return Output_Time;
	}
	public String ConvertTimeFormat(Date Time,String ToFormat) throws ParseException
	{
		String Output_Time = "";
		long Time_Long = readTimeToLong(Time);
		Output_Time = readLongToTime(Time_Long, ToFormat);
		return Output_Time;
	}
}
