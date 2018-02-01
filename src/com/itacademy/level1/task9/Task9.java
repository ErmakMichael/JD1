package com.itacademy.level1.task9;

import java.util.Random;

public class Task9 {

	public static void main(String[] args) {

		Random rand = new Random();

		int max = 0;

		for (int i = 0; i < 10; i++) {
			int number = rand.nextInt(100);
			if (max < number) {
				max = number;
			}
			System.out.print("  " + number);
			
		}
		System.out.println();
		String text = String.format("Max number is: %s", max);
		System.out.println(text);

	}

}
