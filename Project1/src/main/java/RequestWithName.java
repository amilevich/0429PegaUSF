import java.util.Calendar;

public class RequestWithName extends Request {
	
	private String firstName;
	private String lastName;

	public RequestWithName() {
		super();
	}

	public RequestWithName(int authorId, int type, double amount, String description) {
		super(authorId, type, amount, description);
	}

	public RequestWithName(int ticketId, int authorId, int type, double amount, Calendar submitDate,
			Calendar resolveDate, int status, String description) {
		super(ticketId, authorId, type, amount, submitDate, resolveDate, status, description);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
