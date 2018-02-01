package com.itacademy.level2.excel.table;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;

public class Table implements Serializable {

	private Map<Character, Column> table = new TreeMap<Character, Column>();
	
}
