package com.test.testData;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;

public class SubscriptionDataCreator {


	private HashMap<String,HashMap<Integer,Double>> weeklyCategoryRate;
	
	
	public SubscriptionDataCreator()
	{
		this.weeklyCategoryRate=new HashMap<String,HashMap<Integer,Double>>();
		subscriptionData();
	}

	public void subscriptionData()
	{
		setData("TOI",	 	3,		3,		3,		3,		3, 		5,	 	6);
		setData("Hindu",	2.5,	2.5,	2.5,	2.5,	2.5, 	4, 		4);
		setData("ET", 		2, 		2,		2,		2,		2, 		2, 		10);
		setData("BM", 		1.5,	1.5,	1.5,	1.5,	1.5, 	1.5, 	1.5);
		setData("HT", 		2,		2,		2,		2, 		2,		2, 		4);
	}

	public void setData(String category,double mon,double tues,double wed,double thurs,double fri,double sat,double sun)
	{
		HashMap<Integer,Double> weekDayRate=new HashMap<>();
		weekDayRate.put(GregorianCalendar.MONDAY,mon);
		weekDayRate.put(GregorianCalendar.TUESDAY, tues);
		weekDayRate.put(GregorianCalendar.WEDNESDAY, wed);
		weekDayRate.put(GregorianCalendar.THURSDAY, thurs);
		weekDayRate.put(GregorianCalendar.FRIDAY, fri);
		weekDayRate.put(GregorianCalendar.SATURDAY, sat);
		weekDayRate.put(GregorianCalendar.SUNDAY, sun);
		weeklyCategoryRate.put(category, weekDayRate);
	}

	public HashMap<String,HashMap<Integer,Double>> getData()
	{
		return weeklyCategoryRate;
	}
	
}
