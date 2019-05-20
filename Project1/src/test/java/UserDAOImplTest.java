import org.junit.*;

public class UserDAOImplTest {
	
	// This uses the ProjectOneFinal database file!
	
	private static UserDAOImpl udi;
	
	@BeforeClass
	public static void setUpBeforeClass() {
		udi = new UserDAOImpl();
	}

	@Test
	public void testSelectUserById() {
		User u = udi.selectUserById(5);
		Assert.assertEquals("Should be 5", 5, u.getUserID());
	}

	@Test
	public void testSelectUserByUsername() {
		User u = udi.selectUserByUsername("eweaver2");
		Assert.assertEquals("Should be eweaver2", "eweaver2", u.getUsername());
	}

}
