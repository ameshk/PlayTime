package org.Time.GetTime;

import org.Time.ReadTime.TimeToTime;

public class GetSetTimeInstance {
	public String GetHourOfDay(long Time)
	{
		TimeToTime tt = new TimeToTime();
		String resResult = tt.readLongToTime(Time, "u");
		return resResult;
	}
	public static void main(String[] args) {
		GetSetTimeInstance gst = new GetSetTimeInstance();
		System.out.println(gst.GetHourOfDay(1483209000000L));
	}
}
