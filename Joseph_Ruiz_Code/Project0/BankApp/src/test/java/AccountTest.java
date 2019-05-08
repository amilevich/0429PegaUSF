import org.junit.*;

public class AccountTest {
	
	private static Account a;
	private static Account b;
	
	@BeforeClass
	public static void initialize() {
		a = new Account(142479345628L, "AnyUser");
		b = new Account(346728467825L, "AnyUser");
	}
	
	@Test
	public void depositTest() {
		// You get $500 just for opening an account with us lol
		a.deposit(500);
		Assert.assertTrue("should be true", a.deposit(50));
		Assert.assertEquals("should be $550", 550.0, a.getBalance(), 0);
		Assert.assertFalse("should be false since it was blocked", a.deposit(-50));
		Assert.assertEquals("should still be $550 since it was blocked", 550.0, a.getBalance(), 0);
	}

	@Test
	public void testAccountNumber() {
		Assert.assertEquals("should be Account #142479345628", 142479345628L, a.getAccountNumber());
		Assert.assertNotEquals("should be Account #142479345628 NOT 5", 5, a.getAccountNumber());
	}
	
	@Test
	public void testUser() {
		Assert.assertEquals("should be AnyUser", "AnyUser", a.getOwner());
		Assert.assertNotEquals("should be AnyUser NOT ibvzdf", "ibvzdf", a.getOwner());
	}
	
	@Test
	public void withdrawTest() {
		Assert.assertTrue("should be true", a.withdraw(100));
		Assert.assertEquals("should be $450", 450.0, a.getBalance(), 0);
		Assert.assertFalse("should be false since it was blocked", a.withdraw(5000));
		Assert.assertEquals("should still be $450 since it was blocked", 450.0, a.getBalance(), 0);
		Assert.assertFalse("should be false since it was blocked (again)", a.withdraw(-50));
		Assert.assertEquals("should still be $450", 450.0, a.getBalance(), 0);
	}
	
	@Test
	public void testTransfer() {
		Assert.assertTrue("should be true", a.transfer(1, b));
		Assert.assertEquals("should be $1", 1.0, b.getBalance(), 0);
		Assert.assertFalse("should be false", a.transfer(-1, b));
		Assert.assertEquals("should still be $1", 1.0, b.getBalance(), 0);
	}
	
}
