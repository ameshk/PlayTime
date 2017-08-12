package org.Time.ComputeTime;

public class AddMinusTime {
	/**
	 * 
	 * Plus start here
	 */
	public Long plusMilliseconds(Long InTime, Long Count)
	{
		Long resTime = 0L;
		resTime = InTime + Count;
		return resTime;
	}
	public Long plusSeconds(Long InTime, Long Count)
	{
		Long resTime = 0L;
		Long addition = Count*plusMilliseconds(0L, 1000L);
		resTime = InTime + addition;
		return resTime;
	}
	public Long plusMinutes(Long InTime, Long Count)
	{
		Long resTime = 0L;
		Long addition = Count*plusSeconds(0L, 60L);
		resTime = InTime + addition;
		return resTime;
	}
	public Long plusHours(Long InTime, Long Count)
	{
		Long resTime = 0L;
		Long addition = Count*plusMinutes(0L, 60L);
		resTime = InTime + addition;
		return resTime;
	}
	public Long plusDays(Long InTime, Long Count)
	{
		Long resTime = 0L;
		Long addition = Count*plusHours(0L, 24L);
		resTime = InTime + addition;
		return resTime;
	}
	public Long plusWeeks(Long InTime, Long Count)
	{
		Long resTime = 0L;
		Long addition = Count*plusDays(0L, 7L);
		resTime = InTime + addition;
		return resTime;
	}
	public Long plusFortnights(Long InTime, Long Count)
	{
		Long resTime = 0L;
		Long addition = Count*plusWeeks(0L, 2L);
		resTime = InTime + addition;
		return resTime;
	}
	
	/**
	 * 
	 * Minus start here
	 */
	public Long minusSeconds(Long InTime, Long Count)
	{
		Long resTime = 0L;
		Long subtraction = Count*plusMilliseconds(0L, 1000L);
		resTime = InTime - subtraction;
		return resTime;
	}
	public Long minusMinutes(Long InTime, Long Count)
	{
		Long resTime = 0L;
		Long subtraction = Count*plusSeconds(0L, 60L);
		resTime = InTime - subtraction;
		return resTime;
	}
	public Long minusHours(Long InTime, Long Count)
	{
		Long resTime = 0L;
		Long subtraction = Count*plusMinutes(0L, 60L);
		resTime = InTime - subtraction;
		return resTime;
	}
	public Long minusDays(Long InTime, Long Count)
	{
		Long resTime = 0L;
		Long subtraction = Count*plusHours(0L, 24L);
		resTime = InTime - subtraction;
		return resTime;
	}
	public Long minusWeeks(Long InTime, Long Count)
	{
		Long resTime = 0L;
		Long subtraction = Count*plusDays(0L, 7L);
		resTime = InTime - subtraction;
		return resTime;
	}
	public Long minusFortnights(Long InTime, Long Count)
	{
		Long resTime = 0L;
		Long subtraction = Count*plusWeeks(0L, 2L);
		resTime = InTime - subtraction;
		return resTime;
	}
	
}
