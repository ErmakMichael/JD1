package com.itacademy.level2.excel.table;

import java.io.Serializable;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.TreeMap;

public class Table implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Map<Integer, Line> table = new TreeMap<Integer, Line>();

	public Table() {
		super();
	}

	public Line getLine(int i) {
		return table.get(i);
	}

	public void addLine(Integer i, Line row) {
		table.put(i, row);
	}

	public boolean isLineExist(int i) {
		if (getLine(i) == null) {
			return false;
		} else {
			return true;
		}
	}

	public String getCellValue(String s) throws NoSuchElementException, NumberFormatException{
		Integer i = Integer.valueOf(s.substring(s.indexOf('[') + 1, s.indexOf(',')));
		String j = s.substring(s.indexOf(',') + 1, s.indexOf(']'));
		return this.table.get(i).getCell(j).getValue();
	}
}
