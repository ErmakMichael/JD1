package com.itacademy.level2.excel.commands.file;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.itacademy.level2.excel.Main;
import com.itacademy.level2.excel.Menu;
import com.itacademy.level2.excel.commands.Command;
import com.itacademy.level2.excel.commands.CommandExit;
import com.itacademy.level2.excel.commands.cell.CEdit;
import com.itacademy.level2.excel.commands.cell.CRead;
import com.itacademy.level2.excel.table.Table;

public abstract class CForFile extends Command {

	public CForFile(String value, String output) {
		super(value, output);
	}

	@Override
	public void execute() {
	}

	@SuppressWarnings("resource")
	protected String enterFileName() {
		Scanner scan = new Scanner(System.in);
		String fileName = "";
		do {
			System.out.println("Type correct filename.(excel.xls)");
			System.out.println("For exit to previous menu print \"exit\"");
			fileName = scan.next();
			if (fileName.equals("exit")) {
				Main.main(null);
			}
		} while (!isFileNameCorrect(fileName));
		return fileName;
	}

	private boolean isFileNameCorrect(String fileName) {
		return fileName.matches("[0-9,a-z,A-Z]+.xls");
	}

	protected void enterToSecondMenu(Table table) {
		System.out.println("You are in table menu.");
		List<Command> secondLevelCommands = new ArrayList<Command>();
		secondLevelCommands.add(new CRead("1", "Read cell", table));
		secondLevelCommands.add(new CEdit("2", "Edit cell", table));
		secondLevelCommands.add(new CSave("3", "Save file", table));
		secondLevelCommands.add(new CommandExit("4", "For close file and exit"));
		Menu menu = new Menu(secondLevelCommands);
		menu.execute();
	}
}