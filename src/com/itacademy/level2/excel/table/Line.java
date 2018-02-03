package com.itacademy.level2.excel.table;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;

public class Line implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Map<String, Cell> Line = new TreeMap<String, Cell>();

	public Line() {
		super();
	}

	public Cell getCell(String j) {
		return Line.get(j);
	}

	public void addCell(String j, Cell cell) {
		Line.put(j, cell);
	}
}