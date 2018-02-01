package com.itacademy.level1.task4;

public class Task4 {

	public static void main(String[] args) {

		int a = 4;
		int b = 1;
		int radius = 5;

		if (diagRectangle(a, b) > radius) {
			System.out.println("Will not close");
		} else {
			System.out.println("Will  close");

		}
	}
	
	private static int diagRectangle(int a, int b) {
		int sum = (int) (Math.pow(a, a) + Math.pow(b, b));
		return (int) Math.sqrt(sum);
	}

}
