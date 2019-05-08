package com.revature.daos;

import com.revature.beans.Admin;
import com.revature.beans.User;

public interface AdminDao {
	public static final AdminDao currentAdminDao = AdminSerializer.as;
	
	void createAdmin(Admin a);
	Admin findByUsernameAndPassword(String username, String password);
	void viewAllUsers();
	void viewUserTransactionHistory(String username);
}
