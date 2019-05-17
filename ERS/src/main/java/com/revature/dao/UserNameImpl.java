package com.revature.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.model.UserName;

public class UserNameImpl implements UserNameDao {

	static {

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

		} catch (ClassNotFoundException e) {

			e.printStackTrace();

		}

	}

	private static String url = "jdbc:oracle:thin:@sqldb.cff3qzq6ys4x.us-east-2.rds.amazonaws.com\n" + ":1521:db0429";
	private static String username = "PublicUser";
	private static String password = "p4ssw0rd";

	
	/*@Override
	public int insertUserName()) {
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
*/
	@Override
	public UserName selectUserNameByName(String uname) {
		UserName un = null;
		try (Connection conn = DriverManager.getConnection(url, username, password)) {
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM login_user WHERE user_username=? AND user_password=?");
			ps.setString(1, ((UserName) ps).getName());
			ps.setString(2, ((UserName) ps).getType());
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				un = new UserName(rs.getString(1), rs.getString(2));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return un;
	}
}
