package com.itacademy.level1.task22;

public class Task22 {

	public static void main(String[] args) {

		TimeInterval timeSec = new TimeInterval(123421);
		TimeInterval timeSecMinHour = new TimeInterval(123, 322, 34);

		System.out.println(timeSecMinHour.compareTime(timeSec));
		
		timeSec.printTime();
		timeSecMinHour.printTimeInSec();

	}

}
