package com.itacademy.level2.excel.command;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;

public class COpenFile extends Command {
	public COpenFile(String key) {
		super("Open a document");
		setKey(key);
	}

	@Override
	public void execute() throws IOException {
		System.out.println("Enter the name of the file to open");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String fileName = reader.readLine();

		ObjectInputStream in;
		try {
			in = new ObjectInputStream(new FileInputStream(fileName));
			in.close();
			System.out.println("File " + fileName + " open\n");
		} catch (FileNotFoundException e) {
			System.out.println(fileName + " does not exist\n");
		}

		// print list of actions (commands) for a current opened file file
	}
}
