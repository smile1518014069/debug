package com.servlet;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.LoginDao1;
import com.entity.User;

public class LoginServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	
		req.setCharacterEncoding("utf-8");
		String nickname=req.getParameter("name");
		String passward=req.getParameter("passward");
		User user=new User(nickname,passward);
		
		int result=LoginDao1.Login(user);
		System.out.println(result);
		if(result>0){
			resp.sendRedirect("/sys/main.jsp");
		}else{
			resp.sendRedirect("/sys/login.jsp");
			
		}
	}

}
