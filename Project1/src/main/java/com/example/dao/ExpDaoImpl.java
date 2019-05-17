package com.example.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.example.model.Expanses;

public class ExpDaoImpl implements ExpDao{
	
	
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
	public int submitExp(Expanses x) {
		try (Connection conn = DriverManager.getConnection(url, username, password)) {

			PreparedStatement ps = conn.prepareStatement("INSERT INTO Employee VALUES(?,?,?)");
			ps.setDouble(1, x.getAmount());
			ps.setString(2, x.getComments());
			ps.setString(3, x.getExtype());
			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public Expanses selectPetByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Expanses> selectAllPets() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updatePet(Expanses x) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deletePet(Expanses x) {
		// TODO Auto-generated method stub
		return 0;
	}


}
