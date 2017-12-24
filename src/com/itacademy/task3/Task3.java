package com.itacademy.task3;

import java.util.Random;

public class Task3 {

	public static void main(String[] args) {

		Random random = new Random();
		int num = random.nextInt(100);

		if (num % 10 == 7) {
			System.out.println("The number ends at 7: " + num);
		} else {
			System.out.println("The number DOES NOT end on 7" + num);
		}

	}

}
