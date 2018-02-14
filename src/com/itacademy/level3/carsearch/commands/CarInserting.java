package com.itacademy.level3.carsearch.commands;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

import com.itacademy.level3.carsearch.dao.ICarDao;
import com.itacademy.level3.carsearch.dao.impl.CarDaoImpl;
import com.itacademy.level3.carsearch.model.Car;

public class CarInserting extends Commands {

	public CarInserting(String key) {
		super("Insert new car");
		setKey(key);
		System.out.println("This is menu for inserting new car in our DB");
	}

	@Override
	public void execute() throws IOException, SQLException {

		ICarDao carDao = new CarDaoImpl();
		String brand = inputBrand();
		String model = inputModel();
		String fuelType = inputFuelType();
		Integer year = Integer.parseInt(inputYear());

		Car car = new Car();

		car.setBrand(brand);
		car.setModel(model);
		car.setFuelType(fuelType);
		car.setYear(year);

		Integer generatedId1 = carDao.insert(car);
		System.out.println("latest generated car id: " + generatedId1);

	}

	private String inputYear() throws IOException {
		String yearInput;
		do {
			System.out.println(
					"Type year of your car (2000)");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

			yearInput = reader.readLine();

		} while (!isCorrect(yearInput, "[1-2]{1}[0-9]{3}", "Incorrect year"));
		return yearInput;
	}

	private String inputFuelType() throws IOException {
		String fuelTypeInput;
		do {
			System.out.println("Type fuel type of your car (gasoline)");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

			fuelTypeInput = reader.readLine();
		} while (!isCorrect(fuelTypeInput, "[a-z]{1,100}", "Incorrect fuel typr"));
		return fuelTypeInput;
	}

	private String inputModel() throws IOException {
		String modelInput;
		do {
			System.out.println("Type model of your car (Civic)");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

			modelInput = reader.readLine();
		} while (!isCorrect(modelInput,"[a-z0-9\\s]{1,100}", "Incorrect model"));
		return modelInput;
	}

	private String inputBrand() throws IOException {
		String brandInput;
		do {
			System.out.println("Type correct brand of your car (Honda)");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

			brandInput = reader.readLine();
		} while (!isCorrect(brandInput, "[a-z]{1,100}", "Incorrect brand"));
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
