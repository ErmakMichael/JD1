package com.itacademy.task24;

public abstract class Appliance {
	
	protected String name;
	protected String model;
	protected String releaseDate;
	protected boolean isOn;

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected String getModel() {
		return model;
	}

	protected void setModel(String model) {
		this.model = model;
	}

	protected String getReleaseDate() {
		return releaseDate;
	}

	protected void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	protected boolean getIsOn() {
		return isOn;
	}

	protected void setIsOn(boolean isOn) {
		this.isOn = isOn;
	}

	protected void printStatus() {
		if (isOn) {
			System.out.println("On");
		} else {
			System.out.println("Off");
		}

	}
	
	protected Appliance(String name, String model, String releaseDate) {
		this.name = name;
		this.model = model;
		this.releaseDate = releaseDate;
	}

}
