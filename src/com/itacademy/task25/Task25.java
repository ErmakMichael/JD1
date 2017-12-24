package com.itacademy.task25;

public class Task25 {

	public static void main(String[] args) {

		BankCard masterCard = new MasterCard();
		masterCard.setPin(1234);

		System.out.println(masterCard.getPin());

	}

}
