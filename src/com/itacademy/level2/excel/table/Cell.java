package com.itacademy.level2.excel.table;

import java.io.Serializable;

public class Cell implements Serializable {

	String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
