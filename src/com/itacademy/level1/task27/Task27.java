package com.itacademy.level1.task27;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Task27 {

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
		
		Set<Integer> assesmentsAfterRemove = new HashSet<Integer>(assessments);
		System.out.println(assesmentsAfterRemove);
		
	}

}
