import java.util.Calendar;

public class Request {
	
	private int ticketId; // reimb_id NUMBER
	private int authorId; // reimb_author NUMBER
	private int adminId;  // reimb_resolver NUMBER
	private int type;     // reimb_type_id NUMBER
	private double amount;         // reimb_amount NUMBER
	private Calendar submitDate;  // reimb_submitted TIMESTAMP
	private Calendar resolveDate; // reimb_resolved TIMESTAMP
	private int status;            // reimb_status_id NUMBER
	private String description;    // reimb_description VARCHAR2(250)
	
	public Request() {
		super();
	}
	
	public Request(int authorId, int type, double amount, String description) {
		super();
		this.authorId = authorId;
		this.type = type;
		this.amount = amount;
		this.submitDate = Calendar.getInstance();
		this.resolveDate = null;
		this.status = StatusCode.PENDING;
		this.description = description;
	}

	public Request(int ticketId, int authorId, int type, double amount, Calendar submitDate,
			Calendar resolveDate, int status, String description) {
		super();
		this.ticketId = ticketId;
		this.authorId = authorId;
		this.type = type;
		this.amount = amount;
		this.submitDate = submitDate;
		this.resolveDate = resolveDate;
		this.status = status;
		this.description = description;
	}
	
	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Calendar getSubmitDate() {
		return submitDate;
	}

	public long getSubmitDateInMillis() {
		return submitDate.getTimeInMillis();
	}
	
	public void setSubmitDate(Calendar submitDate) {
		this.submitDate = submitDate;
	}

	public void setSubmitDate(long millis) {
		this.submitDate = new Calendar.Builder().setInstant(millis).build();
	}
	
	public Calendar getResolveDate() {
		return resolveDate;
	}

	public long getResolveDateInMillis() {
		if (resolveDate == null) {
			return 0;
		} else {
			return resolveDate.getTimeInMillis();
		}
	}
	
	public void setResolveDate(Calendar resolveDate) {
		this.resolveDate = resolveDate;
	}

	public void setResolveDate(long millis) {
		this.resolveDate = new Calendar.Builder().setInstant(millis).build();
	}
	
	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Request [ticketId=");
		builder.append(ticketId);
		builder.append(", authorId=");
		builder.append(authorId);
		builder.append(", adminId=");
		builder.append(adminId);
		builder.append(", type=");
		builder.append(type);
		builder.append(", amount=");
		builder.append(amount);
		builder.append(", submitDate=");
		builder.append(submitDate);
		builder.append(", resolveDate=");
		builder.append(resolveDate);
		builder.append(", status=");
		builder.append(status);
		builder.append(", description=");
		builder.append(description);
		builder.append("]");
		return builder.toString();
	}
	
}
