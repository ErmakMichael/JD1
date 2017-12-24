package com.itacademy.task26;

import java.util.ArrayList;
import java.util.Random;

public class Task26 {

	public static void main(String[] args) {

		ArrayList<Integer> assessments = new ArrayList<Integer>();
		Random random = new Random();

		int size = random.nextInt(20);

		System.out.println("Size array: " + size);

		for (int i = 0; i < size; i++) {
			assessments.add(random.nextInt(10) + 1);
			System.out.print(assessments.get(i) + " ");
		}

		System.out.println();

		int i = 0;
		while (assessments.size() > i) {
			if (assessments.get(i) <= 3) {
				assessments.remove(i);
				continue;
			} else {
				System.out.print(assessments.get(i) + " ");
			}
			i++;

		}
	}

}
