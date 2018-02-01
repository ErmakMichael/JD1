package com.itacademy.level1.task7;

public class Task7 {

	public static void main(String[] args) {
		int a = 5; // 1house
		int b = 6; // 1house
		int c = 6; // 2house
		int d = 6; // 2house
		int e = 1; // land plot
		int f = 1; // land plot
		
		if ((a >= (c + e)) && (b >= d && b >= f)) {
			System.out.println("1 ����� ��������� 2 ����");
		} else if ((a >= (c + f)) && (b >= d && b >= e)) {
			System.out.println("2 ����� ��������� 2 ����");
		} else if ((a >= (d + e)) && (b >= c && b >= f)) {
			System.out.println("3 ����� ��������� 2 ����");
		} else if ((a >= (d + f)) && (b >= c && b >= e)) {
			System.out.println("4 ����� ��������� 2 ����");
		} else if ((b >= (c + e)) && (a >= d && a >= f)) {
			System.out.println("5 ����� ��������� 2 ����");
		} else if ((b >= (c + f)) && (a >= d && a >= e)) {
			System.out.println("6 ����� ��������� 2 ����");
		} else if ((b >= (d + e)) && (a >= c && a >= f)) {
			System.out.println("7 ����� ��������� 2 ����");
		} else if ((b >= (d + f)) && (a >= c && a >= e)) {
			System.out.println("8 ����� ��������� 2 ����");
		} else
			System.out.println("������ ��������� 2 ����");
	}

}
