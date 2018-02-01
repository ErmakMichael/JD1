package com.itacademy.level2.excel.command;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;


public class CNewFile extends Command {

	public CNewFile(String key) {
		super("Create a document");
		setKey(key);
	}

	@Override
	public void execute() throws IOException  { 
		System.out.println("Enter the name of the file to create////doc.txt////");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String fileName = reader.readLine();

		
		ObjectOutputStream out;
		try {
			out = new ObjectOutputStream(new FileOutputStream(fileName));
			out.flush();
			out.close();
			System.out.println("File "+ fileName +" created\n");
		} catch (IOException e) {
			System.out.println("File not created\n");
		}
		
			
		// print list of actions (commands) for a new file
	}

}
