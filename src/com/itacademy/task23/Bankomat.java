package com.itacademy.task23;

public class Bankomat { // I added a fourth property of the class to make it easier
						// to describe the condition for issuing money. I decide in express mode)

	private int note10;
	private int note20;
	private int note50;
	private int note100;

	public int getNote10() {
		return note10;
	}

	public void setNote10(int note10) {
		this.note10 = note10;
	}

	public int getNote20() {
		return note20;
	}

	public void setNote20(int note20) {
		this.note20 = note20;
	}

	public int getNote50() {
		return note50;
	}

	public void setNote50(int note50) {
		this.note50 = note50;
	}

	public int getNote100() {
		return note100;
	}

	public void setNote100(int note100) {
		this.note100 = note100;
	}

	public void addMoney(int note10, int note20, int note50, int note100) {
		this.note10 += note10;
		this.note20 += note20;
		this.note50 += note50;
		this.note100 += note100;
	}

	public boolean withdrawMoney(int money) {
		int cash = money;
		int n10 = 0;
		int n20 = 0;
		int n50 = 0;
		int n100 = 0;
		boolean resultWithdrawMoney = false;

		if (money % 10 == 0) {
			resultWithdrawMoney = true;
			while (note100 > 0 && money >= 99) {
				money -= 100;
				note100--;
				n100++;
			}
			while (note50 > 0 && money >= 49) {
				money -= 50;
				note50--;
				n50++;
			}
			while (note20 > 0 && money >= 19) {
				money -= 20;
				note20--;
				n20++;
			}
			while (note10 > 0 && money >= 9) {
				money -= 10;
				note10--;
				n10++;
			}
			System.out.println(String.format("Money - %s\nnote10 - %s\nnote20 - %s\nnote50 - %s\nnote100 - %s\n ", cash,
					n10, n20, n50, n100));
		} else {
			System.out.println("Issue of money is not possible");
		}
		return resultWithdrawMoney;
	}

	public void doStatusMoney() {
		System.out.println(String.format("note10 - %s\nnote20 - %s\nnote50 - %s\nnote100 - %s\n", note10, note20,
				note50, note100));
	}

	public Bankomat(int note10, int note20, int note50, int note100) {
		this.note10 = note10;
		this.note20 = note20;
		this.note50 = note50;
		this.note100 = note100;
	}

}
