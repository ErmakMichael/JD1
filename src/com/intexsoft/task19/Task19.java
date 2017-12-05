package com.intexsoft.task19;

public class Task19 {

	public static void main(String[] args) {
		String s = "sdfm, , sn23 rnn 23nfkls vlcv sd fdv";
		s = s.trim();
		
		String[] splitResult = s.split("\\s+|,\\s*");
		
		int n = splitResult.length;
		
		for (String i : splitResult) {
			System.out.print(i + ", ");
		}
		
		System.out.println("\n\nWe have word(s): "+n);
	}

}