package com.itacademy.level1.task14;

public class Task14 {

	public static void main(String[] args) {

		int[] marks = new int[20];
		int maxAssessment = -1;

		for (int i = 0; i < marks.length; i++) {
			marks[i] = (int) (Math.random() * 10 + 1);
		}

		for (int i = 0; i < marks.length; i++) {
			String text = String.format("Ученик №%s: оценка: %s", i, marks[i]);
			System.out.println(text);
		}

		for (int i : marks) {
			if (maxAssessment < i) {
				maxAssessment = i;
			}
		}

		for (int i = 0; i < marks.length; i++) {
			if (maxAssessment == marks[i]) {
				System.out.println("Index max num: " + i);

			}
		}

	}

}
