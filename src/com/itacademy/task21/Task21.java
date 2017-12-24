package com.itacademy.task21;

public class Task21 {

	public static void main(String[] args) {
		String str = "str";
		TestTimeString(str);
		TestTimeStringBulder(str);
	}

	public static long TestTimeString(String str) {

		long startTime = System.nanoTime();
		for (int i = 0; i < 20; i++) {
			str += str;
		}
		long endTime = System.nanoTime();
		long resultTime = endTime - startTime;
		String text = String.format("Programm worked with String %s nanosec", resultTime);
		System.out.println(text);
		return resultTime;
	}

	public static long TestTimeStringBulder(String str) {
		long startTime = System.nanoTime();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 20; i++) {
			sb.append(str);
		}
		long endTime = System.nanoTime();
		long resultTime = endTime - startTime;
		String text = String.format("Programm worked with StringBulder %s nanosec", resultTime);
		System.out.println(text);
		return resultTime;
	}

}
