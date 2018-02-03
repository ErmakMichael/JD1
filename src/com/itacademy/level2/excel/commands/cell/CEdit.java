package com.itacademy.level2.excel.commands.cell;

import java.util.NoSuchElementException;
import java.util.Scanner;

import com.itacademy.level2.excel.table.Cell;
import com.itacademy.level2.excel.table.Line;
import com.itacademy.level2.excel.table.Table;

public class CEdit extends CForCell {

	public CEdit(String value, String output, Table table) {
		super(value, output, table);
	}

	@Override
	public void execute() {
		String s = enterCorrectAddress();
		enterNewValue(s);
	}

	@SuppressWarnings("resource")
	private void enterNewValue(String s) {
		Integer i = Integer.valueOf(s.substring(s.indexOf('[') + 1, s.indexOf(',')));
		String j = s.substring(s.indexOf(',') + 1, s.indexOf(']'));
		System.out.println("Type new value.");
		Cell cell = new Cell(table);
		Scanner scan = new Scanner(System.in);
		try {
			cell.setValue(scan.next());
			if (table.isLineExist(i)) {
				table.getLine(i).addCell(j, cell);
			} else {
				Line row = new Line();
				row.addCell(j, cell);
				table.addLine(i, row);
			}
			System.out.println(String.format("Cell %s has been recorded.", s));
		} catch (NumberFormatException | NoSuchElementException e) {
			System.out.println("Incorrect value in one of the cells.");
			enterNewValue(s);
		}
	}
}