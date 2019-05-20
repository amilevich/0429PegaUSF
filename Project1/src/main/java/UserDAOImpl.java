import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

public class UserDAOImpl implements UserDAO {

	private static final Logger logger = Logger.getLogger(UserDAOImpl.class);
	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public User selectUserById(int id) {
		User out = null;
		try {
			Connection conn = DriverManager.getConnection(DatabaseInfo.URL, DatabaseInfo.USERNAME, DatabaseInfo.PASSWORD);
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM ers_user WHERE ers_user_id=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				out = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7));
			}
			conn.close();
			logger.info("Selected user #" + id);
		} catch (SQLException e) {
			e.printStackTrace();
			logger.error("[Exception] Cannot select user " + e);
		}
		return out;
	}
	
	@Override
	public User selectUserByUsername(String username) {
		User out = null;
		try {
			Connection conn = DriverManager.getConnection(DatabaseInfo.URL, DatabaseInfo.USERNAME, DatabaseInfo.PASSWORD);
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM ers_user WHERE ers_username=?");
			ps.setString(1, username);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				out = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7));
			}
			conn.close();
			logger.info("Selected user " + username);
		} catch (SQLException e) {
			e.printStackTrace();
			logger.error("[Exception] Cannot select user " + e);
		}
		return out;
	}

}
