package com.itacademy.level1.task2;

public class Task2 {

	public static void main(String[] args) {

		int sec = 10000000;

		int secRemainder = sec % 60;
		int min = (sec - secRemainder) / 60;
		int minRemainder = min % 60;
		int hour = (min - minRemainder) / 60;
		int hourRemainder = hour % 24;
		int day = (hour - hourRemainder) / 24;
		int dayRemainder = day % 7;
		int week = (day - dayRemainder) / 7;

		System.out.println(week + " week, " + dayRemainder + " day, " + hourRemainder + " hour, " + minRemainder
				+ " min, " + secRemainder + " sec ");

	}

}
