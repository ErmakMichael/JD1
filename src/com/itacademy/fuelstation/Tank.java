package com.home.test.fuelstation;


public class Tank {

	public int quantityFuel;
	private Fuel fuelType;

	public Tank(Fuel fuelType, int quantityFuel) {

		this.fuelType = fuelType;
		this.quantityFuel = quantityFuel;
	}

	public int getQuantityFuel() {
		return quantityFuel;
	}

}
