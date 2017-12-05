package com.intexsoft.task10;

import java.util.Random;

public class Task10 {

	public static void main(String[] args) {

		Random random = new Random();
		int number = random.nextInt(10000);
		int sum = 0;

		System.out.println(number);

		while (number > 0) {
			int remainder = number % 10;
			number /= 10;
			sum += remainder;
		}
		System.out.println("Sum is: " + sum);

	}

}
