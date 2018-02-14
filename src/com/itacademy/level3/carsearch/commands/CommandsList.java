package com.itacademy.level3.carsearch.commands;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.List;

public class CommandsList {
	List<Commands> levelCommands;

	public CommandsList(List<Commands> levelCommands) {
		this.levelCommands = levelCommands;
	}

	public void execute() throws IOException, SQLException {
		while (true) {
			System.out.println("Choose the required command");
			for (Commands commands : levelCommands) {
				commands.printMenuItem();
			}

			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

			String input = reader.readLine();

			for (Commands commands : levelCommands) {
				if (commands.isSelected(input)) {
					commands.execute();
				}
			}
		}
	}
}
