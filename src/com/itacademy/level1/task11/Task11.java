package com.itacademy.level1.task11;

import java.util.Random;

public class Task11 {


	public static void main(String[] args) {

		Random random = new Random();
		int number = random.nextInt(100);
		System.out.println(number);
		
		int n = 0;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				n++;
			}
		}
		if (n <= 2) {
			System.out.println("Number is SIMPLE");
		} else {
			System.out.println("Number is COMPLEX");
		}

	}

}
