package com.itacademy.level2.excel;

import java.util.List;
import java.util.Scanner;

import com.itacademy.level2.excel.commands.Command;

public class Menu {
	List<Command> LevelCommands;

	public Menu(List<Command> LevelCommands) {
		this.LevelCommands = LevelCommands;
	}

	@SuppressWarnings("resource")
	public void execute() {
		String s = "";
		do {
			for (Command command : LevelCommands) {
				command.print();
			}
			Scanner scan = new Scanner(System.in);
			s = scan.next();
			for (Command command : LevelCommands) {
				if (s.equals(command.getValue())) {
					command.execute();
				}
			}
		} while (!s.equals("exit"));

	}
}
