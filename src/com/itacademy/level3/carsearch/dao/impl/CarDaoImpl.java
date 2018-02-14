package com.itacademy.level3.carsearch.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.itacademy.level3.carsearch.dao.ICarDao;
import com.itacademy.level3.carsearch.model.Car;

public class CarDaoImpl extends AbstractDao<Car> implements ICarDao {

	@Override
	protected Car handleRow(ResultSet resultSet) throws SQLException {
		Car object = new Car();
		object.setId(resultSet.getInt("id"));
		object.setBrand(resultSet.getString("brand"));
		object.setModel(resultSet.getString("model"));
		object.setFuelType(resultSet.getString("fuel_type"));
		object.setYear(resultSet.getInt("year"));
		return object;
	}

	@Override
	protected String getTableName() {
		return "car";
	}

	@Override
	public Integer insert(Car object) throws SQLException {
		Connection c = getConnection();

		PreparedStatement preparedStatement = c.prepareStatement(
				"insert into car (brand, model, fuel_type, year) values(?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
		preparedStatement.setString(1, object.getBrand());
		preparedStatement.setString(2, object.getModel());
		preparedStatement.setString(3, object.getFuelType());
		preparedStatement.setInt(4, object.getYear());

		preparedStatement.executeUpdate();

		final ResultSet rs = preparedStatement.getGeneratedKeys();
		rs.next();
		final int id = rs.getInt("id");

		rs.close();
		preparedStatement.close();
		c.close();

		return id;

	}

	@Override
	public void select(String query) throws SQLException {
		Connection c = getConnection();

		Statement statement = c.createStatement();
		statement.executeQuery("select * from car where " + query);

		ResultSet resultSet = statement.getResultSet();

		List<Car> result = new ArrayList<>();
		boolean hasNext = resultSet.next();
		while (hasNext) {
			result.add(handleRow(resultSet));
			hasNext = resultSet.next();
		}

		resultSet.close();
		statement.close();
		c.close();
		printList(result);
	}

	private static void printList(List<? extends Object> all) {
		for (Object object : all) {
			System.out.println(object.toString());
		}
	}

}
