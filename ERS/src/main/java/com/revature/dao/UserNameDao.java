package com.revature.dao;

import com.revature.model.UserName;

public interface UserNameDao {

	//public int insertUserName(UserName un);
	public UserName selectUserNameByName(String uname);
}
