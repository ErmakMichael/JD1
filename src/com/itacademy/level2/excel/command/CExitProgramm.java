package com.itacademy.level2.excel.command;

public class CExitProgramm extends Command {

	public CExitProgramm(String key) {
		super("Exit from the programm");
		setKey(key);
	}

	@Override
	public void execute() {

		System.out.println("\nProgramm is ended");
		
		System.exit(0);
	}

}

