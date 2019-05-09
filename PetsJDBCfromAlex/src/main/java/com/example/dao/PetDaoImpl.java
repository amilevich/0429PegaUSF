package com.example.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.example.model.Pet;

/*
 * JDBC - Java Database Connectivity 
 * ----> it is an interface for client and database access.
 * i.e. it connects to our db from java
 * 
 * IMPORTANT INTERFACES:
 * Connection - allows us to connect to our db
 * Statement - allows for native SQL queries
 * PreparedStatement - precompiles the SQL string without parameters,
 * once parameters are added, they are only treated as values, never
 * keywords.
 * (Prepared statements do not allow SQL injections, statements do)
 * CallableStatement - used for stored procedures
 * 
 * How to connect to our db:
 * 1) URL
 * 2) Username    ----- connection interface
 * 3) Password
 * 4) Driver - .jar implements JDBC
 * 
 */

public class PetDaoImpl implements PetDao {
	
	private static String url="jdbc:oracle:thin:@db0429.cjdso6ohuu1q.us-east-2.rds.amazonaws.com:1521:db0429";
	private static String username="PetLover";
	private static String password="p4ssw0rd";

	@Override
	public int insertPet(Pet p) {
		try (Connection conn = DriverManager.getConnection(url, username, password)){
			
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
		try(Connection conn = DriverManager.getConnection(url, username, password)){
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM Pets WHERE p_name=?");
			ps.setString(1, name);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				pet = new Pet(rs.getString(1), rs.getString(2));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pet;
	}

	@Override
	public List<Pet> selectAllPets() {
		List<Pet> pets = new ArrayList<>();
		try(Connection conn = DriverManager.getConnection(url, username, password)){
			
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM Pets");
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				pets.add(new Pet(rs.getString(1), rs.getString(2)));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pets;
	}

	@Override
	public int updatePet(Pet p) {
		try(Connection conn = DriverManager.getConnection(url, username, password)){
			PreparedStatement ps = conn.prepareStatement("UPDATE Pets SET p_type=? WHERE p_name=?");
			ps.setString(1, p.getType());
			ps.setString(2, p.getName());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int deletePet(Pet p) {
		try(Connection conn = DriverManager.getConnection(url, username, password)){
			PreparedStatement ps = conn.prepareStatement("DELETE FROM Pets WHERE p_name=?");
			ps.setString(1, p.getName());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return 0;
	}

}
