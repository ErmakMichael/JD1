package com.itacademy.level3.carsearch.model;

public class Car {

	private Integer id;
	private String brand;
	private String model;
	private String fuelType;
	private Integer year;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return String.format("Car [id= %s, brand= %s, model= %s, fuelType= %s, year= %s]", id, brand, model, fuelType,
				year);
	}

}
