package com.itacademy.task23;

public class Task23 {

	public static void main(String[] args) {

		Bankomat bank = new Bankomat(100, 100, 100, 100);
		bank.getStatusMoney();

		bank.withdrawMoney(5010);
		bank.getStatusMoney();

		bank.withdrawMoney(1);
		
		bank.addMoney(1, 0, 0, 50);
		bank.getStatusMoney();

	}
}
