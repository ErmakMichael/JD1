package com.itacademy.task24;

public class ApplianceForKitchen extends Appliance {

	protected boolean inside;

	public ApplianceForKitchen(String name, String model, String releaseDate) {
		super(name, model, releaseDate);
		this.setIsOn(true);
	}

	public boolean getIsInside() {
		return inside;
	}

	public void setInside(boolean inside) {
		this.inside = inside;
	}

}
