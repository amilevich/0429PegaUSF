/**
 * 
 */
window.onload = function() {
	getRequests();
}

function getRequests() {
	let xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
		if (xhttp.readyState == 4 && xhttp.status == 200) {
			let list = JSON.parse(xhttp.responseText);
			setValues(list);
		}
	}
	xhttp.open("GET", "http://localhost:8080/ProjectOne/html/LoadRequests.do", true);
	xhttp.send();
}

function setValues(list) {
	const LODGING = 1;
	const TRAVEL = 2;
	const FOOD = 3;
	const OTHER = 4;
	
	const APPROVED = 1;
	const DENIED = 2;
	const PENDING = 3;
	
	let table = document.getElementById("reimbtable");
	table.innerHTML = `<tr>
					   <th>User Id</th>
					   <th>First Name</th>
					   <th>Last Name</th>
					   <th>Type</th>
					   <th>Amount</th>
					   <th>Date submitted</th>
					   <th>Date resolved</th>
					   <th>Status</th>
					   <th>Description</th>
					   <th>Ticket Id</th>
					   <th></th>
					   </tr>`
	
	for (r in list) {
		let row = document.createElement("tr");
		let tdUser = document.createElement("td");
		let tdFirstName = document.createElement("td");
		let tdLastName = document.createElement("td");
		let tdType = document.createElement("td");
		let tdAmount = document.createElement("td");
		let tdSubmitDate = document.createElement("td");
		let tdResolveDate = document.createElement("td");
		let tdStatus = document.createElement("td");
		let tdDescription = document.createElement("td");
		let tdTicketId = document.createElement("td");
		let tdButtons = document.createElement("td");
		
		// Author Name
		tdUser.innerHTML = list[r].authorId;
		tdFirstName.innerHTML = list[r].firstName;
		tdLastName.innerHTML = list[r].lastName;
		// Type
		switch (list[r].type) {
		case LODGING:
			tdType.innerHTML = "Lodging";
			break;
		case TRAVEL:
			tdType.innerHTML = "Travel";
			break;
		case FOOD:
			tdType.innerHTML = "Food";
			break;
		case OTHER:
			tdType.innerHTML = "Other";
			break;
		}
		// Amount
		tdAmount.innerHTML = "$" + list[r].amount;
		// Submit Date
		let submitDate = new Date(list[r].submitDate);
		tdSubmitDate.innerHTML = submitDate;
		// Resolve Date
		if (list[r].resolveDate != null) {
			tdResolveDate.innerHTML = new Date(list[r].resolveDate);
		} else {
			tdResolveDate.innerHTML = "Pending";
		}
		// Status
		switch (list[r].status) {
		case APPROVED:
			tdStatus.innerHTML = "Approved";
			break;
		case DENIED:
			tdStatus.innerHTML = "Denied";
			break;
		case PENDING:
			tdStatus.innerHTML = "Pending";
			break;
		}
		// Description
		tdDescription.innerHTML = list[r].description;
		// Ticket Number
		tdTicketId.innerHTML = list[r].ticketId;
		
		// Buttons
		if (list[r].status == PENDING) {
			btnApprove = document.createElement("button");
			btnApprove.setAttribute("name", "btnApprove");
			btnApprove.setAttribute("value", list[r].ticketId);
			btnApprove.innerText = "Approve";
			btnApprove.addEventListener('click', ApproveRequest);

			btnDeny = document.createElement("button");
			btnDeny.setAttribute("name", "btnDeny");
			btnDeny.setAttribute("value", list[r].ticketId);
			btnDeny.innerText = "Deny";
			btnDeny.addEventListener('click', DenyRequest);
			
			tdButtons.appendChild(btnApprove);
			tdButtons.appendChild(btnDeny);
		}
		
		row.appendChild(tdUser);
		row.appendChild(tdFirstName);
		row.appendChild(tdLastName);
		row.appendChild(tdType);
		row.appendChild(tdAmount);
		row.appendChild(tdSubmitDate);
		row.appendChild(tdResolveDate);
		row.appendChild(tdStatus);
		row.appendChild(tdDescription);
		row.appendChild(tdTicketId);
		row.appendChild(tdButtons);
		
		table.appendChild(row);
	}
}

function ApproveRequest(e) {
	let target = e.target;
	let xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
		if (xhttp.readyState == 4 && xhttp.status == 200) {
			getRequests();
		}
	}
	xhttp.open("POST", "http://localhost:8080/ProjectOne/html/ApproveRequest.do", true);
	xhttp.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
	xhttp.send("value=" + target.value);
}

function DenyRequest(e) {
	let target = e.target;
	let xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
		if (xhttp.readyState == 4 && xhttp.status == 200) {
			getRequests();
		}
	}
	xhttp.open("POST", "http://localhost:8080/ProjectOne/html/DenyRequest.do", true);
	xhttp.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
	xhttp.send("value=" + target.value);
}