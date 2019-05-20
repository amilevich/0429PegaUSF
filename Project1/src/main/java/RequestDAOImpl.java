import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

public class RequestDAOImpl implements RequestDAO {

	private static final Logger logger = Logger.getLogger(RequestDAOImpl.class);
	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public int selectMaxRequestId() {
		int out = 0;
		try {
			Connection conn = DriverManager.getConnection(DatabaseInfo.URL, DatabaseInfo.USERNAME, DatabaseInfo.PASSWORD);
			PreparedStatement ps = conn.prepareStatement("SELECT MAX(reimb_id) FROM ers_reimbursement");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				out = rs.getInt(1);
			}
			conn.close();
			logger.info("Selected maximum ticket ID number");
		} catch (SQLException e) {
			e.printStackTrace();
			logger.error("[Exception] Cannot select maximum ID number " + e);
		}
		return out;
	}
	
	@Override
	public void insertRequest(Request r) {
		try {
			Connection conn = DriverManager.getConnection(DatabaseInfo.URL, DatabaseInfo.USERNAME, DatabaseInfo.PASSWORD);
			PreparedStatement ps = conn.prepareStatement("INSERT INTO ers_reimbursement(reimb_id, reimb_amount, reimb_submitted, reimb_description, reimb_author, reimb_status_id, reimb_type_id) VALUES(?,?,?,?,?,?,?)");
			int id = selectMaxRequestId() + 1;
			ps.setInt(1, id);
			ps.setDouble(2, r.getAmount());
			ps.setTimestamp(3, new Timestamp(r.getSubmitDateInMillis()));
			ps.setString(4, r.getDescription());
			ps.setInt(5, r.getAuthorId());
			ps.setInt(6, r.getStatus());
			ps.setInt(7, r.getType());
			ps.executeUpdate();
			conn.close();
			logger.info("Inserted request #" + id);
		} catch (SQLException e) {
			e.printStackTrace();
			logger.error("[Exception] Cannot insert request " + e);
		}
	}

	@Override
	public Request selectRequestByID(int id) {
		Request out = null;
		try {
			Connection conn = DriverManager.getConnection(DatabaseInfo.URL, DatabaseInfo.USERNAME, DatabaseInfo.PASSWORD);
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM ers_reimbursement WHERE reimb_id=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				out = new Request();
				out.setTicketId(rs.getInt(1));
				out.setAmount(rs.getDouble(2));
				out.setSubmitDate(rs.getTimestamp(3).getTime());
				if (rs.getTimestamp(4) == null) {
					out.setResolveDate(null);
				} else {
					out.setResolveDate(rs.getTimestamp(4).getTime());
				}
				out.setDescription(rs.getString(5));
				out.setAuthorId(rs.getInt(7));
				out.setAdminId(rs.getInt(8));
				out.setStatus(rs.getInt(9));
				out.setType(rs.getInt(10));
			}
			conn.close();
			logger.info("Selected request #" + id);
		} catch (SQLException e) {
			e.printStackTrace();
			logger.error("[Exception] Cannot select request " + e);
		}
		return out;
	}

	@Override
	public List<Request> selectAllByStatus(int status) {
		List<Request> out = new ArrayList<Request>();
		try {
			Connection conn = DriverManager.getConnection(DatabaseInfo.URL, DatabaseInfo.USERNAME, DatabaseInfo.PASSWORD);
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM ers_reimbursement WHERE reimb_status_id=?");
			ps.setInt(1, status);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Request r = new Request();
				r.setTicketId(rs.getInt(1));
				r.setAmount(rs.getDouble(2));
				r.setSubmitDate(rs.getTimestamp(3).getTime());
				if (rs.getTimestamp(4) == null) {
					r.setResolveDate(null);
				} else {
					r.setResolveDate(rs.getTimestamp(4).getTime());
				}
				r.setDescription(rs.getString(5));
				r.setAuthorId(rs.getInt(7));
				r.setAdminId(rs.getInt(8));
				r.setStatus(rs.getInt(9));
				r.setType(rs.getInt(10));
				out.add(r);
			}
			conn.close();
			logger.info("Selected requests with status #" + status);
		} catch (SQLException e) {
			e.printStackTrace();
			logger.error("[Exception] Cannot select requests " + e);
		}
		return out;
	}

	@Override
	public List<Request> selectAllByEmployeeId(int id) {
		List<Request> out = new ArrayList<Request>();
		try {
			Connection conn = DriverManager.getConnection(DatabaseInfo.URL, DatabaseInfo.USERNAME, DatabaseInfo.PASSWORD);
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM ers_reimbursement WHERE reimb_author=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Request r = new Request();
				r.setTicketId(rs.getInt(1));
				r.setAmount(rs.getDouble(2));
				r.setSubmitDate(rs.getTimestamp(3).getTime());
				if (rs.getTimestamp(4) == null) {
					r.setResolveDate(null);
				} else {
					r.setResolveDate(rs.getTimestamp(4).getTime());
				}
				r.setDescription(rs.getString(5));
				r.setAuthorId(rs.getInt(7));
				r.setAdminId(rs.getInt(8));
				r.setStatus(rs.getInt(9));
				r.setType(rs.getInt(10));
				out.add(r);
			}
			conn.close();
			logger.info("Selected requests with employee #" + id);
		} catch (SQLException e) {
			e.printStackTrace();
			logger.error("[Exception] Cannot select requests " + e);
		}
		return out;
	}

	@Override
	public List<Request> selectAllRequests() {
		List<Request> out = new ArrayList<Request>();
		try {
			Connection conn = DriverManager.getConnection(DatabaseInfo.URL, DatabaseInfo.USERNAME, DatabaseInfo.PASSWORD);
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM ers_reimbursement");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Request r = new Request();
				r.setTicketId(rs.getInt(1));
				r.setAmount(rs.getDouble(2));
				r.setSubmitDate(rs.getTimestamp(3).getTime());
				if (rs.getTimestamp(4) == null) {
					r.setResolveDate(null);
				} else {
					r.setResolveDate(rs.getTimestamp(4).getTime());
				}
				r.setDescription(rs.getString(5));
				r.setAuthorId(rs.getInt(7));
				r.setAdminId(rs.getInt(8));
				r.setStatus(rs.getInt(9));
				r.setType(rs.getInt(10));
				out.add(r);
			}
			conn.close();
			logger.info("Selected all requests");
		} catch (SQLException e) {
			e.printStackTrace();
			logger.error("[Exception] Cannot select requests " + e);
		}
		return out;
	}

	@Override
	public List<Request> selectAllRequestsForTable() {
		List<Request> out = new ArrayList<Request>();
		try {
			Connection conn = DriverManager.getConnection(DatabaseInfo.URL, DatabaseInfo.USERNAME, DatabaseInfo.PASSWORD);
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM ers_reimbursement ORDER BY reimb_id DESC");
			ResultSet rs = ps.executeQuery();
			UserDAOImpl udi = new UserDAOImpl();
			while (rs.next()) {
				RequestWithName r = new RequestWithName();
				r.setTicketId(rs.getInt(1));
				r.setAmount(rs.getDouble(2));
				r.setSubmitDate(rs.getTimestamp(3).getTime());
				if (rs.getTimestamp(4) == null) {
					r.setResolveDate(null);
				} else {
					r.setResolveDate(rs.getTimestamp(4).getTime());
				}
				r.setDescription(rs.getString(5));
				r.setAuthorId(rs.getInt(7));
				User u = udi.selectUserById(rs.getInt(7));
				r.setFirstName(u.getFirstName());
				r.setLastName(u.getLastName());
				r.setAdminId(rs.getInt(8));
				r.setStatus(rs.getInt(9));
				r.setType(rs.getInt(10));
				out.add(r);
			}
			conn.close();
			logger.info("Selected all requests");
		} catch (SQLException e) {
			e.printStackTrace();
			logger.error("[Exception] Cannot select requests " + e);
		}
		return out;
	}
	
	@Override
	public void updateRequest(Request r) {
		try {
			Connection conn = DriverManager.getConnection(DatabaseInfo.URL, DatabaseInfo.USERNAME, DatabaseInfo.PASSWORD);
			PreparedStatement ps = conn.prepareStatement("UPDATE ers_reimbursement SET reimb_amount=?, reimb_submitted=?, reimb_resolved=?, reimb_description=?, reimb_author=?, reimb_resolver=?, reimb_status_id=?, reimb_type_id=? WHERE reimb_id=?");
			ps.setDouble(1, r.getAmount());
			ps.setTimestamp(2, new Timestamp(r.getSubmitDateInMillis()));
			ps.setTimestamp(3, new Timestamp(r.getResolveDateInMillis()));
			ps.setString(4, r.getDescription());
			ps.setInt(5, r.getAuthorId());
			ps.setInt(6, r.getAdminId());
			ps.setInt(7, r.getStatus());
			ps.setInt(8, r.getType());
			ps.setInt(9, r.getTicketId());
			ps.executeUpdate();
			conn.close();
			logger.info("Updated request #" + r.getTicketId());
		} catch (SQLException e) {
			e.printStackTrace();
			logger.error("[Exception] Cannot update request " + e);
		}
	}

}
