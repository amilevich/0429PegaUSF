package com.example.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.model.Pet;

public class PetDaoImpl implements PetDao {
	
	static{

	       try {

	           Class.forName("oracle.jdbc.driver.OracleDriver");

	       } catch (ClassNotFoundException e) {

	           e.printStackTrace();

	       }

	   }

	private static String url = "jdbc:oracle:thin:@db0429.cjdso6ohuu1q.us-east-2.rds.amazonaws.com:1521:db0429";
	private static String username = "PetLover";
	private static String password = "p4ssw0rd";

	@Override
	public int insertPet(Pet p) {
		try (Connection conn = DriverManager.getConnection(url, username, password)) {

			PreparedStatement ps = conn.prepareStatement("INSERT INTO Pets VALUES(?,?)");
			ps.setString(1, p.getName());
			ps.setString(2, p.getType());
			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public Pet selectPetByName(String name) {
		Pet pet = null;
		try (Connection conn = DriverManager.getConnection(url, username, password)) {
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM Pets WHERE p_name=?");
			ps.setString(1, name);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				pet = new Pet(rs.getString(1), rs.getString(2));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pet;
	}

}
