package com.intexsoft.task20;

import java.util.regex.Pattern;
import java.util.regex.Matcher;;

public class Task20 {

	public static void main(String[] args) {

		String str = "II TT -- AA CC AA DD EE MM YY";
		str.trim();

		Pattern p = Pattern.compile(" +");

		Matcher matcher = p.matcher(str);
		while (matcher.find()) {
			System.out.print(str.charAt(matcher.start() - 1));
		}

		System.out.println(str.charAt(str.length() - 1));

	}
}
