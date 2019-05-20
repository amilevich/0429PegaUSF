import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestHelper {

	public static String process(HttpServletRequest request, HttpServletResponse response) {
		String out = null;
		switch (request.getRequestURI()) {
		case "/ProjectOne/html/ApproveRequest.do":
			out = AdminMenuController.approveRequest(request, response);
			break;
		case "/ProjectOne/html/DenyRequest.do":
			out = AdminMenuController.denyRequest(request, response);
			break;
		case "/ProjectOne/html/LoadRequests.do":
			out = AdminMenuController.getAllRequestsAsJSON(request, response);
			break;
		case "/ProjectOne/html/Login.do":
			out = LoginController.Login(request);
			break;
		case "/ProjectOne/html/NewExpense.do":
			out = NewExpenseController.NewExpense(request);
			break;
		default:
			out = "/html/Login.html";
			break;
		}
		return out;
	}
	
}
