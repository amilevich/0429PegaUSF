import java.io.IOException;
import java.util.Calendar;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class AdminMenuController {
	
	public static String approveRequest(HttpServletRequest request, HttpServletResponse response) {
		User u = (User) request.getSession().getAttribute("user");
		int ticketId = Integer.parseInt(request.getParameter("value"));
		if (u == null || u.getRole() != Roles.ADMIN) {
			return "/html/Login.html";
		}
		RequestDAOImpl rdi = new RequestDAOImpl();
		Request r = rdi.selectRequestByID(ticketId);
		r.setStatus(StatusCode.APPROVE);
		r.setResolveDate(Calendar.getInstance());
		r.setAdminId(u.getUserID());
		rdi.updateRequest(r);
		return "/html/AdminHome.html";
	}

	public static String denyRequest(HttpServletRequest request, HttpServletResponse response) {
		User u = (User) request.getSession().getAttribute("user");
		int ticketId = Integer.parseInt(request.getParameter("value"));
		if (u == null || u.getRole() != Roles.ADMIN) {
			return "/html/Login.html";
		}
		RequestDAOImpl rdi = new RequestDAOImpl();
		Request r = rdi.selectRequestByID(ticketId);
		r.setStatus(StatusCode.DENY);
		r.setResolveDate(Calendar.getInstance());
		r.setAdminId(u.getUserID());
		rdi.updateRequest(r);
		return "/html/AdminHome.html";
	}
	
	public static String getAllRequestsAsJSON(HttpServletRequest request, HttpServletResponse response) {
		User u = (User) request.getSession().getAttribute("user");
		if (u == null || u.getRole() != Roles.ADMIN) {
			return "/html/Login.html";
		}
		RequestDAOImpl rdi = new RequestDAOImpl();
		List<Request> list = rdi.selectAllRequestsForTable();
		try {
			response.getWriter().write(new ObjectMapper().writeValueAsString(list));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
