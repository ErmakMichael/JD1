package com.itacademy.level2.excel.commands.cell;

import java.util.NoSuchElementException;

import com.itacademy.level2.excel.table.Table;

public class CRead extends CForCell {

	public CRead(String value, String output, Table table) {
		super(value, output, table);
	}

	@Override
	public void execute() {
		String s = enterCorrectAddress();
		try {
			System.out.println(String.format("Cell %s=%s", s, this.table.getCellValue(s)));
		} catch (NullPointerException e) {
			System.out.println(String.format("Cell %s doesn-t exist", s));
		} catch (NoSuchElementException | NumberFormatException e) {
			System.out.println("Incorrect value in one of the cells.");
		}
	}
}