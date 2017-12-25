package com.itacademy.task24;

public class Microwave extends ApplianceForKitchen {

	private int cost;

	public Microwave(String name, String model, String releaseDate) {
		super(name, model, releaseDate);
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public void printDescriptionAppliance() {
		System.out
				.println(String.format("Microwave: \n Name-%s \n Model-%s \n Release Date-%s \n Cost-%s$ \n Inside-%s",
						this.getName(), this.getModel(), this.getReleaseDate(), this.getCost(), this.getIsInside()));
	}

}
