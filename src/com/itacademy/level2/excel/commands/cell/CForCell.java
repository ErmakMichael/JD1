package com.itacademy.level2.excel.commands.cell;

import java.util.Scanner;

import com.itacademy.level2.excel.commands.Command;
import com.itacademy.level2.excel.table.Table;

public abstract class CForCell extends Command {
	protected Table table;

	public CForCell(String value, String output, Table sheet) {
		super(value, output);
		this.table = sheet;
	}

	@Override
	public void execute() {
	}

	@SuppressWarnings("resource")
	protected String enterCorrectAddress() {
		String s;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("Please, enter cell address. For example [23,D]. (Remember [1..1000,A-Z]).");
			s = scan.next();
		} while (!isAddressValid(s));
		return s;
	}

	private boolean isAddressValid(String s) {
		if (s.matches("\\[([1-9][0-9]{0,2}|1000),[A-Z]\\]")) {
			return true;
		} else {
			System.out.println("Incorrect cell address.");
			return false;
		}
	}
}