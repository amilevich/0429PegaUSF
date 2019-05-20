package com.model;

public class Ticket {
	private String ticketId, ticketType, amount, dateSubmitted, dateResolved, status, description, userId,
	               firstName, lastName;
	
	public Ticket() {
	}

	public Ticket(String ticketId, String ticketType, String amount, String dateSubmitted, 
			String dateResolved, String status,String description, String userId, String firstName,
			String lastName) {
		super();
		this.ticketId = ticketId;
		this.ticketType = ticketType;
		this.amount = amount;
		this.dateSubmitted = dateSubmitted;
		this.dateResolved = dateResolved;
		this.status = status;
		this.description = description;
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getTicketId() {
		return ticketId;
	}

	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}

	public String getTicketType() {
		return ticketType;
	}

	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getDateSubmitted() {
		return dateSubmitted;
	}

	public void setDateSubmitted(String dateSubmitted) {
		this.dateSubmitted = dateSubmitted;
	}

	public String getDateResolved() {
		return dateResolved;
	}

	public void setDateResolved(String dateResolved) {
		this.dateResolved = dateResolved;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", ticketType=" + ticketType + ", amount=" + amount + ", dateSubmitted="
				+ dateSubmitted + ", dateResolved=" + dateResolved + ", status=" + status + ", description="
				+ description + ", userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
}
