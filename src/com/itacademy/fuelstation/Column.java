package com.home.test.fuelstation;

import java.util.List;
import java.util.Queue;

public class Column extends Thread {

	private List<Tank> fuelTanks;
	private Queue<Car> cars;
	private Car car;

	public Column(List<Tank> tanks, Queue<Car> cars) {

		this.fuelTanks = tanks;
		this.cars = cars;
		System.out.println(String.format("Started %s %s", getClass().getSimpleName(), getName()));
		this.setDaemon(true);
		this.start();

	}

	@Override
	public void run() {

	}

}
