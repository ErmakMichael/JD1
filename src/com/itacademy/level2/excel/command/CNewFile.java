package com.itacademy.level2.excel.command;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;

import com.itacademy.level2.excel.file.Cat;

public class CNewFile extends Command {

	public CNewFile(String key) {
		super("Создать документ");
		setKey(key);
	}

	@Override
	public void execute() throws IOException { // should not throw. cathc and retry
		System.out.println("Введите имя файла для создания");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String fileName = reader.readLine();
		// create a new file

		File file = new File(fileName + ".txt");
		Cat cat = new Cat();
		cat.setName("Tom");

		try {
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(cat);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			System.out.println(String.format("Create %s.txt", fileName));
		}
		// print list of actions (commands) for a new file
	}

}
