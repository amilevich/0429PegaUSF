import java.util.Calendar;
import java.util.List;

import org.junit.*;

public class RequestDAOImplTest {

	// This uses the ProjectOneFinal database file!
	
	private static RequestDAOImpl rdi;
	private static int maxID;

	@BeforeClass
	public static void setUpBeforeClass() {
		rdi = new RequestDAOImpl();
	}
	
	@Before
	public void getMaxID() {
		maxID = rdi.selectMaxRequestId();
	}

	@Test
	public void testInsertRequest() {
		Request r = new Request();
		r.setTicketId(maxID);
		r.setAmount(250);
		r.setType(ReimbursementType.FOOD);
		r.setStatus(StatusCode.PENDING);
		r.setSubmitDate(Calendar.getInstance());
		r.setAuthorId(2);
		r.setDescription("Well i needed to eat...");
		rdi.insertRequest(r);
	}
	
	@Test
	public void testSelectRequestByID() {
		Request r = rdi.selectRequestByID(3);
		Assert.assertEquals("Should be 3", 3, r.getTicketId());
	}

	@Test
	public void testSelectAllByStatus() {
		boolean m = true;
		List<Request> list = rdi.selectAllByStatus(StatusCode.DENY);
		for (Request r : list) {
			if (r.getStatus() != StatusCode.DENY) {
				m = false;
			}
		}
		Assert.assertTrue("they should all be StatusCode.DENY (2)", m);
	}

	@Test
	public void testSelectAllByEmployeeId() {
		int id = 2;
		boolean m = true;
		List<Request> list = rdi.selectAllByEmployeeId(id);
		for (Request r : list) {
			if (r.getAuthorId() != id) {
				m = false;
			}
		}
		Assert.assertTrue("they should all be employee 2", m);
	}

	@Test
	public void testSelectAllRequests() {
		List<Request> list = rdi.selectAllRequests();
		Assert.assertNotNull("Should exist (therefore not null)", list);
		Assert.assertEquals("should have all of its elements", maxID, list.size());
	}

	@Test
	public void testSelectAllRequestsForTable() {
		List<Request> list = rdi.selectAllRequests();
		Assert.assertNotNull("Should exist (therefore not null)", list);
		Assert.assertEquals("should have all of its elements", maxID, list.size());
	}

	@Test
	public void testUpdateRequest() {
		Request r = rdi.selectRequestByID(maxID);
		r.setStatus(StatusCode.DENY);
		r.setResolveDate(Calendar.getInstance());
		r.setAuthorId(1);
		rdi.updateRequest(r);
	}

}
