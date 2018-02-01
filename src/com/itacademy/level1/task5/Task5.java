package com.itacademy.level1.task5;

import java.util.Random;

public class Task5 {

	public static void main(String[] args) {

		Random random = new Random();
		int rubl = random.nextInt(100);
		int lastNumber = rubl % 10;

		switch (lastNumber) {
		case 1:
			lastNumber = 1;
			System.out.println(rubl + "рубль");
			break;
		case 2:
			lastNumber = 2;
			System.out.println(rubl + "рубля");
			break;
		case 3:
			lastNumber = 3;
			System.out.println(rubl + "рубля");
			break;
		case 4:
			lastNumber = 4;
			System.out.println(rubl + "рубля");
			break;

		default:
			System.out.println(rubl + "рублей");
			break;
		}

	}

}
