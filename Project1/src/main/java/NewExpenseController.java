import javax.servlet.http.HttpServletRequest;

public class NewExpenseController {
	
	public static String NewExpense(HttpServletRequest request) {
		User u = (User) request.getSession().getAttribute("user");
		int author_id = u.getUserID();
		int type = Integer.parseInt(request.getParameter("type"));
		double amount = Double.parseDouble(request.getParameter("Amount"));
		String desc = request.getParameter("Description");
		Request r = new Request(author_id, type, amount, desc);
		RequestDAOImpl rdi = new RequestDAOImpl();
		rdi.insertRequest(r);
		return "/html/Login.html";
	}

}
