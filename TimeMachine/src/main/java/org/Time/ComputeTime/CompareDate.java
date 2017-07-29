package org.Time.ComputeTime;

public class CompareDate {

	public int CompareTime(long initialTime, long finalTime)
	{
		int flag = 0;
		if(initialTime<finalTime)
		{
			flag = -1;
		}
		else if (initialTime>finalTime) 
		{
			flag = 1;
		}
		else if (initialTime==finalTime) 
		{
			flag = 0;
		}
		return flag;
	}
}
