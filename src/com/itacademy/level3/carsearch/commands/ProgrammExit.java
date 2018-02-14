package com.itacademy.level3.carsearch.commands;

import java.io.IOException;

public class ProgrammExit extends Commands {

	public ProgrammExit(String key) {
		super("Exit programm");
		setKey(key);

	}

	@Override
	public void execute() throws IOException {
		System.exit(0);

	}

}
