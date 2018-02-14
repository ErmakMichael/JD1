package com.itacademy.level3.carsearch.commands;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

import com.itacademy.level3.carsearch.dao.ICarDao;
import com.itacademy.level3.carsearch.dao.impl.CarDaoImpl;

public class CarSearching extends Commands {

	public CarSearching(String key) {
		super("Search for a car");
		setKey(key);
		System.out.println("You are in menu for inserting new car in our DB");
	}

	@Override
	public void execute() throws IOException, SQLException {

		ICarDao carDao = new CarDaoImpl();
		String brand = inputBrand();
		String model;
		if (!brand.equals(" is not null")) {
			model = inputModel();
		} else {
			model = " is not null";
		}
		String fuelType = inputFuelType();
		String year = inputYear();

		String query = String.format("brand%s and model%s and fuel_type%s and year%s ", brand, model, fuelType, year);
		carDao.select(query);

	}

	private String inputYear() throws IOException {
		String yearInput;
		do {
			System.out.println("Type year");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

			yearInput = reader.readLine();

		} while (!isCorrect(yearInput, "([<>]{0,1}[1-2]{1}[0-9]{3}|next)", "Incorrect year"));
		if (yearInput.equals("next")) {
			yearInput = " is not null";
		} else {

			yearInput = "=" + yearInput;

		}
		return yearInput;
	}

	private String inputFuelType() throws IOException {
		String fuelTypeInput;
		do {
			System.out.println(
					"Type correct fuel type");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

			fuelTypeInput = reader.readLine();
		} while (!isCorrect(fuelTypeInput, "[a-z]{1,100}", "Incorrect information"));
		if (fuelTypeInput.equals("next")) {
			fuelTypeInput = " is not null";
		} else {
			fuelTypeInput = "='" + fuelTypeInput + "'";
		}
		return fuelTypeInput;
	}

	private String inputModel() throws IOException {
		String modelInput;
		do {
			System.out.println(
					"Type correct model");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

			modelInput = reader.readLine();
		} while (!isCorrect(modelInput, "[a-z0-9\\s]{1,100}", "Incorrect information"));
		if (modelInput.equals("next")) {
			modelInput = " is not null";
		} else {
			modelInput = "='" + modelInput + "'";
		}
		return modelInput;
	}

	private String inputBrand() throws IOException {
		String brandInput;
		do {
			System.out.println(
					"Type correct brand");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

			brandInput = reader.readLine();
		} while (!isCorrect(brandInput, "[a-z]{1,100}", "Incorrect information"));
		if (brandInput.equals("next")) {
			brandInput = " is not null";
		} else {
			brandInput = "='" + brandInput + "'";
		}
		return brandInput;
	}

	private boolean isCorrect(String s, String regExp, String message) {
		if (s.matches(regExp)) {
			return true;
		} else {
			System.out.println(message);
			return false;
		}
	}

}
