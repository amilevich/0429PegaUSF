import java.util.List;

public interface RequestDAO {
	
	public void insertRequest(Request r);
	
	public int selectMaxRequestId();
	public Request selectRequestByID(int id);
	public List<Request> selectAllByStatus(int status);
	public List<Request> selectAllByEmployeeId(int id);
	public List<Request> selectAllRequests();
	public List<Request> selectAllRequestsForTable();
	
	public void updateRequest(Request r);

	
}
