package com.itacademy.level2.excel.table;

import java.io.Serializable;

public class Cell implements Serializable {

	private static final long serialVersionUID = 1L;
	private String value;
	public Cell(Table sheet) {
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}