import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;

public class LoginController {

	private static final Logger logger = Logger.getLogger(LoginController.class);
	
	public static String Login(HttpServletRequest request) {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		UserDAOImpl udi = new UserDAOImpl();
		User u = new User();
		u = udi.selectUserByUsername(username);
		if (u.getUsername().equals(username) && u.getPassword().equals(password)) {
			request.getSession().setAttribute("user", u);
			logger.info("Login user " + u.getUsername());
			if (u.getRole() == Roles.ADMIN) {
				return "/html/AdminHome.html";
			} else if (u.getRole() == Roles.EMPLOYEE) {
				return "/html/EmployeeHome.html";
			}
		}
		return "/html/Login.html";
	}
	
}
