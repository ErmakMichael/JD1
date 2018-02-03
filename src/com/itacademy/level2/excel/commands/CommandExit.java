package com.itacademy.level2.excel.commands;


public class CommandExit extends Command {

	public CommandExit(String value, String output) {
		super(value, output);
	}

	@Override
	public void execute() {
		System.exit(0);
	}
}