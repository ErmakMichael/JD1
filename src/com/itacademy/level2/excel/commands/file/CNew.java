package com.itacademy.level2.excel.commands.file;

import com.itacademy.level2.excel.table.Table;

public class CNew extends CForFile {

	public CNew(String value, String output) {
		super(value, output);
	}

	@Override
	public void execute() {
		System.out.println("New file was created.");
		enterToSecondMenu(new Table());
	}

}
