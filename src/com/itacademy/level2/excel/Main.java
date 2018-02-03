package com.itacademy.level2.excel;

import java.util.ArrayList;
import java.util.List;

import com.itacademy.level2.excel.commands.Command;
import com.itacademy.level2.excel.commands.CommandExit;
import com.itacademy.level2.excel.commands.file.CNew;
import com.itacademy.level2.excel.commands.file.COpen;

public class Main {

	public static void main(String[] args) {

		List<Command> firstLevelCommands = new ArrayList<Command>();
		System.out.println("Make a choice");
		firstLevelCommands.add(new COpen("1","Open file "));
		firstLevelCommands.add(new CNew("2", "Create file"));
		firstLevelCommands.add(new CommandExit("3","Exit"));
		Menu menu = new Menu(firstLevelCommands);
		menu.execute();
	}
}