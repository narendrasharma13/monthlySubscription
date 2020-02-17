package com.test.monthlySubscription;


import java.util.Calendar;
import java.util.Locale;

import com.test.monthlyCalculatorBuilder.DayWiseCategory;
import com.test.monthlyCalculatorBuilder.MonthlyCalculator;
import com.test.testData.SubscriptionDataCreator;

public class MonthlySubscription {

	
	
	public static void main(String...strings)
	{
		DayWiseCategory dwc=new DayWiseCategory();
		
		//Set Daywise household from below category;
		//TOI, Hindu, ET, BM, HT for Mon Tues Wed Thurs Fri sat sun respectively
		dwc.setDayCategory("TOI", "Hindu", "ET", "BM", "HT", "TOI", "HT");
		SubscriptionDataCreator sdc=new SubscriptionDataCreator();
		
		MonthlyCalculator mc=new MonthlyCalculator();
		mc.setCategoryAndSubData(dwc,sdc);
		
		System.out.println(Calendar.getInstance().getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault())+" Month subscription :"+mc.getSubscriptionRate());
		
		//set New category with rate
		//setData("New category",Mon Rate, Tue Rate, Wed Rate, Thur Rate, Fri Rate, Sat Rate, Sun Rate)
		sdc.setData("New Category", 2,3,4,5,5,6,5);

		dwc.setDayCategory("TOI", "Hindu", "ET", "BM", "HT", "TOI", "New Category");
		System.out.println(Calendar.getInstance().getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault())+" Month subscription :"+mc.getSubscriptionRate());
	}
	
}
