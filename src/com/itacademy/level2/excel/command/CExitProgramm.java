package com.itacademy.level2.excel.command;

public class CExitProgramm extends Command {

	public CExitProgramm(String key) {
		super("Выйти из программы");
		setKey(key);
	}

	@Override
	public void execute() {

		System.out.println("Программа завершена");
		
		System.exit(1);
	}

}

