package com.itacademy.task28;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Task28 {

	public static void main(String[] args) {

		ArrayList<Integer> assessments = new ArrayList<Integer>();
		Random random = new Random();

		int size = random.nextInt(10);

		System.out.println("Size array: " + size);

		for (int i = 0; i < size; i++) {
			assessments.add(random.nextInt(10) + 1);
			System.out.print(assessments.get(i) + " ");
		}

		System.out.println();

		Iterator<Integer> iterator = assessments.iterator();
		
		int maxNumber = iterator.next();
		while (iterator.hasNext()) {
			int temp = iterator.next();
			if (maxNumber < temp) {
				maxNumber = temp;
			}
		}
		System.out.println("\nMax number: " + maxNumber);
	}

}
