package com.test.monthlyCalculatorBuilder;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;

import com.test.testData.SubscriptionDataCreator;

public class MonthlyCalculator {


	DayWiseCategory catBuilder;
	SubscriptionDataCreator sdc;

	public void setCategoryAndSubData(DayWiseCategory catBuilder,SubscriptionDataCreator sdc)
	{
		this.catBuilder=catBuilder;
		this.sdc=sdc;
	}


	public double getSubscriptionRate()
	{
		HashMap<String,HashMap<Integer,Double>> weeklyCategoryRate=sdc.getData();
		double monthlySubscriptionRate=0;

		if(weeklyCategoryRate.size()==0)
		{
			System.out.println("No data is present");
			return 0;
		}

		Calendar cal =Calendar.getInstance();
		int noOfDaysInCurrentMonth=cal.getActualMaximum(Calendar.DAY_OF_MONTH);

		for(int i=1;i<=noOfDaysInCurrentMonth;i++)
		{
			cal.set(Calendar.DAY_OF_MONTH, i);
			int day = cal.get(Calendar.DAY_OF_WEEK);
			String category=catBuilder.getDayCategory(day);
			double rate=weeklyCategoryRate.get(category).get(day);
			monthlySubscriptionRate+=rate;
		}
		return monthlySubscriptionRate;
	}


	public static void main(String...s)
	{
		int noOfDaysInCurrentMonth=Calendar.getInstance().getActualMaximum(Calendar.DAY_OF_MONTH);
		for(int i=1;i<=noOfDaysInCurrentMonth;i++)
		{
			Calendar cal =Calendar.getInstance();
			cal.set(Calendar.DAY_OF_MONTH, 1);
			int day = cal.get(Calendar.DAY_OF_WEEK);
			System.out.print("Today is ");
			switch (day) {
			case GregorianCalendar.SUNDAY:
				System.out.print("Sunday");
				break;
			case GregorianCalendar.MONDAY:
				System.out.print("Monday");
				break;
			case GregorianCalendar.TUESDAY:
				System.out.print("Tuesday");
				break;
			case GregorianCalendar.WEDNESDAY:
				System.out.print("Wednesday");
				break;
			case GregorianCalendar.THURSDAY:
				System.out.print("Thursday");
				break;
			case GregorianCalendar.FRIDAY:
				System.out.print("Friday");
				break;
			case GregorianCalendar.SATURDAY:
				System.out.print("Saturday");
			}
			System.out.print(".");

		}


		System.out.println(GregorianCalendar.YEAR);
		Calendar cal =Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, 1);
		int day = cal.get(Calendar.DAY_OF_WEEK);
		System.out.print("Today is ");
		switch (day) {
		case GregorianCalendar.SUNDAY:
			System.out.print("Sunday");
			break;
		case GregorianCalendar.MONDAY:
			System.out.print("Monday");
			break;
		case GregorianCalendar.TUESDAY:
			System.out.print("Tuesday");
			break;
		case GregorianCalendar.WEDNESDAY:
			System.out.print("Wednesday");
			break;
		case GregorianCalendar.THURSDAY:
			System.out.print("Thursday");
			break;
		case GregorianCalendar.FRIDAY:
			System.out.print("Friday");
			break;
		case GregorianCalendar.SATURDAY:
			System.out.print("Saturday");
		}
		System.out.print(".");


	}



















}
