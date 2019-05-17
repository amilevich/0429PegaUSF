package com.example.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.example.model.Pet;

public class PetDaoImpl implements PetDao {
	
	static{

	       try {

	           Class.forName("oracle.jdbc.driver.OracleDriver");

	       } catch (ClassNotFoundException e) {

	           e.printStackTrace();

	       }

	   }

	
	private static String url = "jdbc:oracle:thin:@abdoudb.ceuuuwinccbt.us-east-1.rds.amazonaws.com:1521:AbdouDB";
	private static String username = "Abdou_Project";
	private static String password = "Thioye123";

	@Override
	public int insertPet(Pet p) {
//		try (Connection conn = DriverManager.getConnection(url, username, password)) {
//
//			PreparedStatement ps = conn.prepareStatement("INSERT INTO Employee VALUES(?,?,?,?,?)");
//			ps.setString(1, p.get());
//			ps.setString(2, p.getType());
//			ps.executeUpdate();
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		return 0;
	}

	@Override
	public Pet selectPetByName(String name) {
		Pet pet = null;
		try (Connection conn = DriverManager.getConnection(url, username, password)) {
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM Employee WHERE username =?");
			ps.setString(1, name);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				pet = new Pet (rs.getString(1), rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pet;
	}
	
	@Override
	public int updatePet(Pet p) {
//		try(Connection conn = DriverManager.getConnection(url, username, password)){
//			PreparedStatement ps = conn.prepareStatement("UPDATE Employee SET p_type=? WHERE p_name=?");
//			ps.setString(1, p.getPassword());
//			ps.setString(2, p.getName());
//			ps.executeUpdate();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		return 0;
	}

	@Override
	public int deletePet(Pet p) {
//		try(Connection conn = DriverManager.getConnection(url, username, password)){
//			PreparedStatement ps = conn.prepareStatement("DELETE FROM Pets WHERE p_name=?");
//			ps.setString(1, p.getName());
//			ps.executeUpdate();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} 
		return 0;
	}

	@Override
	public List<Pet> selectAllPets() {
		List<Pet> pets = new ArrayList<>();
//		try(Connection conn = DriverManager.getConnection(url, username, password)){
//			
//			PreparedStatement ps = conn.prepareStatement("SELECT * FROM Employee");
//			ResultSet rs = ps.executeQuery();
//			
//			while(rs.next()) {
//				pets.add(new Pet(rs.getString(1), rs.getString(2),rs.getString(3), rs.getString(4),rs.getString(5)));
//			}
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		return pets;
	}




}
