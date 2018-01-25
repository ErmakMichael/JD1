package com.itacademy.fuelstation;


public class Tank {

	private int quantityFuel;
	private Fuel fuelType;

	public Tank(Fuel fuelType, int quantityFuel) {

		this.fuelType = fuelType;
		this.quantityFuel = quantityFuel;
	}

	public Fuel getFuelType() {
		return fuelType;
	}

	public void setQuantityFuel(int quantityFuel) {
		this.quantityFuel = quantityFuel;
	}

	public void setFuelType(Fuel fuelType) {
		this.fuelType = fuelType;
	}

	public int getQuantityFuel() {
		return quantityFuel;
	}

}
