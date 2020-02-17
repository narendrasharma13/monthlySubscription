package com.test.monthlyCalculatorBuilder;

import java.util.GregorianCalendar;
import java.util.HashMap;

public class DayWiseCategory {
	
	
	private HashMap<Integer,String> hm;
	
	public DayWiseCategory()
	{
		this.hm=new HashMap<>();
	}	
	
	public void setDayCategory(String monCat,String tueCat,String wedCat,String thursCat,String friCat,String satCat,String sunCat)
	{
		hm.put(GregorianCalendar.MONDAY, monCat);
		hm.put(GregorianCalendar.TUESDAY, tueCat);
		hm.put(GregorianCalendar.WEDNESDAY, wedCat);
		hm.put(GregorianCalendar.THURSDAY, thursCat);
		hm.put(GregorianCalendar.FRIDAY, friCat);
		hm.put(GregorianCalendar.SATURDAY, satCat);
		hm.put(GregorianCalendar.SUNDAY, sunCat);
	}
	
	public String getDayCategory(Integer day)
	{
		return hm.get(day);
	}
	
	

}
