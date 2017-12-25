package com.itacademy.task24;

public abstract class Appliance {
	
	private String name;
	private String model;
	private String releaseDate;
	private boolean isOn;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public boolean getIsOn() {
		return isOn;
	}

	public void setIsOn(boolean isOn) {
		this.isOn = isOn;
	}

	public void printStatus() {
		if (isOn) {
			System.out.println("On");
		} else {
			System.out.println("Off");
		}

	}
	
	public Appliance(String name, String model, String releaseDate) {
		this.name = name;
		this.model = model;
		this.releaseDate = releaseDate;
	}

}
