package com.revature.controller;

import javax.servlet.http.HttpServletRequest;

import com.revature.dao.UserNameImpl;

import com.revature.model.UserName;

public class LoginButtonController {

	public static String Login(HttpServletRequest request) {

		String uname = request.getParameter("username");
		String pword = request.getParameter("password");

		UserNameImpl unImpl = new UserNameImpl();
		UserName un = new UserName();
		un = unImpl.selectUserNameByName(uname);

		if (uname.equals(un.getName()) & pword.equals(un.getType())) {

			return "/html/Home.html";
		}

		return "/html/Login.html";

	}

}
