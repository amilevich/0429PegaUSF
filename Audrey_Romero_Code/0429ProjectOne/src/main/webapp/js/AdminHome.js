/**
 * 
 */

window.onload = function getTickets() {

    let xHttp = new XMLHttpRequest();

    xHttp.onreadystatechange = function() {
	
	    if(xHttp.readyState == 4 && xHttp.status == 200) {
	    	let tickets = JSON.parse(xHttp.responseText);
		    setValues(tickets);
	    }
    }
    xHttp.open("GET", "/0429ProjectOne/html/Admin.do", true);
	xHttp.send();
}



// Iterate over table with a for loop


// Display inner HTML to cells
    function setValues(tickets) {
    	let ticketTable = document.getElementById("reimbtable");
    	
    	for (t in tickets) {
    	    let row = document.createElement("tr");
    	    
    	    let userId = document.createElement("th");
    	    let firstName = document.createElement("th");
    	    let lastName = document.createElement("th");
    	    let type = document.createElement("th");
    	    let amount = document.createElement("th");
    	    let dateSubmitted = document.createElement("th");
    	    let dateResolved = document.createElement("th");
    	    let status = document.createElement("th");
    	    let description = document.createElement("th");
    	    let ticketId = document.createElement("th");
    	    let buttons = document.createElement("th");
    	    
    	    let approve = document.createElement("button")
    	    let deny = document.createElement("button")

    	    approve.innerHTML = "Approve";
    	    deny.innerHTML = "Deny";
    	    
    	    buttons.appendChild(approve);
    	    buttons.appendChild(deny);
    	    
    	    userId.innerHTML = tickets[t].userId;
    	    firstName.innerHTML = tickets[t].firstName;
    	    lastName.innerHTML = tickets[t].lastName;
    	    type.innerHTML = tickets[t].ticketType;
    	    amount.innerHTML = tickets[t].amount;
    	    dateSubmitted.innerHTML = tickets[t].dateSubmitted;
    	    dateResolved.innerHTML = tickets[t].dateResolved;
    	    status.innerHTML = tickets[t].status;
    	    description.innerHTML = tickets[t].description;
    	    ticketId.innerHTML = tickets[t].ticketId;
    	    
    	    row.appendChild(userId);
    	    row.appendChild(firstName);
    	    row.appendChild(lastName);
    	    row.appendChild(type);
    	    row.appendChild(amount);
    	    row.appendChild(dateSubmitted);
    	    row.appendChild(dateResolved);
    	    row.appendChild(status);
    	    row.appendChild(description);
    	    row.appendChild(ticketId);
    	    row.appendChild(buttons);
    	    
    	    ticketTable.appendChild(row);
    	    
        }
}
    
    function approveTicket() {
    	tickets[t].status = "Approved";
    	status.innerHTML = tickets[t].status;
    	tickets[t].resolvedDate = "2019-05-20, 00:00:00:0";
    	resolvedDate.innerHTML = tickets[t].resolvedDate;
    }
    
    function denyTicket() {
    	tickets[t].status = "Denied";
    	status.innerHTML = tickets[t].status;
    	tickets[t].resolvedDate = "2019-05-20, 00:00:00:0";
    	resolvedDate.innerHTML = tickets[t].resolvedDate;
    }




