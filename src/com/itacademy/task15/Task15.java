package com.intexsoft.task15;

public class Task15 {
	
	public static void main(String[] args) {

		int[] arr = new int[20];
		int indexOfMax = 0;
		int indexOfMin = 0;
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10);
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > arr[indexOfMax]) {
				indexOfMax = i;
			} else if (arr[i] < arr[indexOfMin]) {
				indexOfMin = i;
			}
		}

		if (indexOfMin < indexOfMax) {
			for (int i = indexOfMin; i < indexOfMax; i++) {
				sum += arr[i];
			}
		} else {
			for (int i = indexOfMin; i < indexOfMax; i--) {
				sum += arr[i];
			}
		}
		String text = String.format("\nindexOfMax: %s, indexOfMin: %s", indexOfMax, indexOfMin);
		System.out.println(text);
		System.out.println("Sum is: " + sum);
	}
}
