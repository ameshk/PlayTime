package org.Time.ReadTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeToTime {

	/*
	 * The following code is to convert date to long
	 */
	public long readTimeToLong(String time, String Format) throws ParseException {
		long LongTime = 0;
		SimpleDateFormat Formatter = new SimpleDateFormat(Format);
		Date Dated = Formatter.parse(time);
		LongTime = Dated.getTime();
		return LongTime;
	}
	public long readTimeToLong(Date time) throws ParseException {
		long LongTime = 0;
		LongTime = time.getTime();
		return LongTime;
	}
	
	/*
	 * The following code is to convert long to date
	 */
	public String readLongToTime(Long Time, String Format)
	{
		String Temp_Time = "";
		SimpleDateFormat Formatter = new SimpleDateFormat(Format);
		Date Dated = new Date(Time);
		Temp_Time = Formatter.format(Dated);
		return Temp_Time;
	}
	public String readLongToTime(Date Time, String Format)
	{
		String Temp_Time = "";
		SimpleDateFormat Formatter = new SimpleDateFormat(Format);
		Temp_Time = Formatter.format(Time);
		return Temp_Time;
	}
}
