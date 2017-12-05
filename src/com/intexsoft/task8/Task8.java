package com.intexsoft.task8;

public class Task8 {

	public static void main(String[] args) {

		int sr = 0;
		int factorial = 1;
		int n = 0;
		int x = (int) (Math.random() * 10);

		while (x != 0) {
			factorial *= x;
			n++;
			x = (int) (Math.random() * 10);
			System.out.print(x + "  ");
		}
		
		if (n != 0) {
			sr = factorial / n;
		} else {
			sr = 0;
		}

		String text = String.format("factorial: %s of %s numbers", sr, n);
		System.out.println(text);
	}

}
