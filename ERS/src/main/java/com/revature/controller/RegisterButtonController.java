/*
  package com.revature.controller;
  
  import javax.servlet.http.HttpServletRequest;
  
  import com.revature.dao.UserNameImpl; import com.revature.model.UserName;
  
  
  
  public class RegisterButtonController {
  
  public static String Register(HttpServletRequest request) {
  
  String name = request.getParameter("name"); String type =
  request.getParameter("type");
  
  UserName un = new UserName(); un.setName(name); un.setType(type);
  
  UserNameImpl unImpl = new UserNameImpl(); unImpl.insertUserName(un);
  
  return "/html/Login.html";
  
  }
 
  }
 */