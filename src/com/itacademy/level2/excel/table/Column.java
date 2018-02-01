package com.itacademy.level2.excel.table;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;

public class Column implements Serializable{

	private Map<Integer, Cell> column = new TreeMap<Integer,Cell>();
}

