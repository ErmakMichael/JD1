package com.itacademy.level1.task24;

public class Task24 {

	public static void main(String[] args) {
		Microwave mw = new Microwave("LG", "AA10", "10.10.2017");
		mw.setCost(150);
		mw.setInside(true);

		mw.printDescriptionAppliance();

	}

}
