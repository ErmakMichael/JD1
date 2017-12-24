package com.itacademy.task18;

public class Task18 {

	public static void main(String[] args) {
		String s = "Hello, im., !!!!::::Mi,ke!";
		int sumSymbol = 0;
		sumSymbol += Task18.SearchAndSum(',', s, 0);
		sumSymbol += Task18.SearchAndSum('.', s, 0);
		sumSymbol += Task18.SearchAndSum('!', s, 0);
		sumSymbol += Task18.SearchAndSum(':', s, 0);

		String text = String.format("We have %s symbol(s)!", sumSymbol);
		System.out.println(text);

	}

	public static int SearchAndSum(char c, String s, int index) {
		int n = 0;
		while (index != -1) {
			index = s.indexOf(c, index);
			if (index != -1) {
				index++;
				n++;
			}
		}
		return n;
	}

}
