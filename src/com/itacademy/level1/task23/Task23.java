package com.itacademy.level1.task23;

public class Task23 {

	public static void main(String[] args) {

		Bankomat bank = new Bankomat(20, 1000, 10, 10);
		bank.doStatusMoney();

		bank.withdrawMoney(5010);
		bank.doStatusMoney();

		bank.withdrawMoney(1);
		
		bank.addMoney(1, 0, 0, 50);
		bank.doStatusMoney();
		
	}
}
