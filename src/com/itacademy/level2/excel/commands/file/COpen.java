package com.itacademy.level2.excel.commands.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

import com.itacademy.level2.excel.table.Table;

public class COpen extends CForFile {

	public COpen(String value, String output) {
		super(value, output);
	}

	@Override
	public void execute() {
		String fileName = enterFileName();
		Table table = new Table();
		table = openFile(fileName);
		enterToSecondMenu(table);
	}

	private Table openFile(String fileName) {

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));) {
			Table table = (Table) ois.readObject();
			ois.close();
			return table;
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
			openFile(enterFileName());
		} catch (Exception e) {
			System.out.println("Something is wrong.");
			openFile(enterFileName());
		}
		return null;
	}
}