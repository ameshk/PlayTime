package org.Time.ReadTime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeToTime {

	public long readTimeToLong(String time, String Format) throws ParseException {
		long LongTime = 0;
		SimpleDateFormat Formatter = new SimpleDateFormat(Format);
		Date Dated = Formatter.parse(time);
		LongTime = Dated.getTime();
		return LongTime;
	}
	
	public String readLongToTime(Long Time, String Format)
	{
		String Temp_Time = "";
		SimpleDateFormat Formatter = new SimpleDateFormat(Format);
		Date Dated = new Date(Time);
		Temp_Time = Formatter.format(Dated);
		return Temp_Time;
	}
}
