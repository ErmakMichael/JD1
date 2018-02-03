package com.itacademy.level2.excel.commands.file;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.itacademy.level2.excel.table.Table;

public class CSave extends CForFile {

	private Table sheet;

	public CSave(String value, String output, Table sheet) {
		super(value, output);
		this.sheet = sheet;
	}

	@Override
	public void execute() {
		String fileName = enterFileName();
		try (FileOutputStream fos = new FileOutputStream(fileName);
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			oos.writeObject(this.sheet);
			oos.close();
			System.out.println(String.format("File %s was saved.", fileName));
		} catch (IOException e) {
			System.out.println("Something was wrong. File wasn't saved. Please try again.");
		}
	}
}