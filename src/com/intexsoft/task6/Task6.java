package com.intexsoft.task6;

public class Task6 {

	public static void main(String[] args) {

		int day = 31;
		int mounth = 12;
		int year = 1999;
		
		if (day >= 31) {
			day = 1;
			mounth++;
		} else {
			day++;
		}

		if (mounth >= 12) {
			mounth = 1;
			year++;
		} else {
			mounth++;
		}

		System.out.println(day + " " + mounth + " " + year);

	}

}
