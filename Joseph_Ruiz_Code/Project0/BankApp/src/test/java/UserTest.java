import org.junit.*;

public class UserTest {
	
	private static User u;
	
	@BeforeClass
	public static void initialize() {
		u = new User("test", "password");
	}
	
	@Test
	public void login() {
		Assert.assertTrue("Should be true", u.login("password"));
		Assert.assertFalse("Should be false", u.login("pAssword"));
	}

}
