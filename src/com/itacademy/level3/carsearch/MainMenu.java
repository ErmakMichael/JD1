package com.itacademy.level3.carsearch;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.itacademy.level3.carsearch.commands.CarInserting;
import com.itacademy.level3.carsearch.commands.CarSearching;
import com.itacademy.level3.carsearch.commands.Commands;
import com.itacademy.level3.carsearch.commands.CommandsList;
import com.itacademy.level3.carsearch.commands.ProgrammExit;

public class MainMenu {
	private List<Commands> firstLevelCommands = new ArrayList<>();

	public MainMenu() throws IOException, SQLException {
		firstLevelCommands.add(new CarSearching("1"));
		firstLevelCommands.add(new CarInserting("2"));
		firstLevelCommands.add(new ProgrammExit("3"));
		CommandsList commandsList = new CommandsList(firstLevelCommands);
		commandsList.execute();
	}

}
