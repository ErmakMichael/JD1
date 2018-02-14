package com.itacademy.level3.carsearch.commands;

import java.io.IOException;
import java.sql.SQLException;

public abstract class Commands {

	private String title;

	private String key;

	public Commands(String title) {
		super();
		this.title = title;
	}

	public boolean isSelected(String userInput) {
		return key.equals(userInput);
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public void printMenuItem() {
		System.out.println(String.format("%s - %s", this.key, this.title));
	}

	public abstract void execute() throws IOException, SQLException;

}
