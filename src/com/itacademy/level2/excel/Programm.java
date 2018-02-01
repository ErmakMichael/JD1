package com.itacademy.level2.excel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.itacademy.level2.excel.command.CExitProgramm;
import com.itacademy.level2.excel.command.CNewFile;
import com.itacademy.level2.excel.command.COpenFile;
import com.itacademy.level2.excel.command.Command;

public class Programm {

	private List<Command> topLevelCommands = new ArrayList<>();

	public Programm() {
		super();
		topLevelCommands.add(new CNewFile("1"));
		topLevelCommands.add(new COpenFile("2"));
		topLevelCommands.add(new CExitProgramm("3"));
	}

	public void start() throws IOException {
		while (true) {
			System.out.println("Выберите команду");
			for (Command command : topLevelCommands) {
				command.printMenuItem();
			}
			

			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

			// Reading data using readLine
			String input = reader.readLine();

			for (Command command : topLevelCommands) {
				if (command.isSelected(input)) {
					command.execute();
				}
			}
		}
	}
}
