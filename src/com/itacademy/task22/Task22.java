package com.itacademy.task22;

public class Task22 {

	public static void main(String[] args) {

		TimeInterval timeSec = new TimeInterval(4324343);
		TimeInterval timeSecMinHour = new TimeInterval(123, 322, 34);

		System.out.println(timeSecMinHour.compareTime(timeSec));
		
		timeSec.printTime();
		timeSecMinHour.printTimeInSec();

	}

}
