package com.itacademy.level2.excel.command;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;

import com.itacademy.level2.excel.file.Cat;

public class COpenFile extends Command {
	public COpenFile(String key) {
		super("Открыть  документ");
		setKey(key);
	}

	@Override
	public void execute() throws IOException {
		System.out.println("введите имя файла для открытия");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String fileName = reader.readLine();
		// open file from file system, deserialize and propose action items
		Cat cat = new Cat();
		try {
			FileInputStream fis = new FileInputStream(fileName);
			if (fis != null) {
				ObjectInputStream ois = new ObjectInputStream(fis);
				cat = (Cat) ois.readObject();
				ois.close();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			System.out.println(String.format("Open %s.txt", fileName));
		}

		// print list of actions (commands) for a current opened file file
	}
}
